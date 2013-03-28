/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.demos.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIViewRoot;

import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.SelectEvent;
import org.icefaces.ace.event.UnselectEvent;
import org.icefaces.ace.model.table.RowState;
import org.icefaces.ace.model.tree.NodeState;
import org.icefaces.ace.model.tree.NodeStateMap;

import com.liferay.faces.demos.kyle.FolderTreeNode;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;


/**
 * @author  Neil Griffin
 */
@ManagedBean(name = "docLibViewBean")
@ViewScoped
public class DocLibViewBean implements Serializable {

	private static final String DOCUMENTS_TABLE_PATH = ":f2:l1:c2:pc1:p1:documents";
	
	// serialVersionUID
	private static final long serialVersionUID = 351876131652958472L;

	// Private Data Members
	private boolean popupRendered = false;
	private NodeStateMap treeNodeStateMap;
	private int selectedFiles = 0;

	public void breadcrumbSelectFolder(DLFolder selectedDlFolder) {

		treeNodeStateMap.setAllSelected(false);

		Set<Map.Entry<Object, NodeState>> entrySet = treeNodeStateMap.entrySet();

		for (Map.Entry<Object, NodeState> mapEntry : entrySet) {

			FolderTreeNode folderTreeNode = (FolderTreeNode) mapEntry.getKey();
			DLFolder dlFolder = (DLFolder) folderTreeNode.getUserObject();

			if (selectedDlFolder.getFolderId() == dlFolder.getFolderId()) {
				mapEntry.getValue().setSelected(true);
			}
		}
	}

	public boolean isPopupRendered() {
		return popupRendered;
	}

	public void setPopupRendered(boolean popupRendered) {
		this.popupRendered = popupRendered;
	}

	public NodeStateMap getTreeNodeStateMap() {
		return treeNodeStateMap;
	}

	public void setTreeNodeStateMap(NodeStateMap treeNodeStateMap) {
		this.treeNodeStateMap = treeNodeStateMap;
	}
	
	public void setSelectedFilesToZero() {
		selectedFiles = 0;
	}
	
	public void incrementSelectedFiles(SelectEvent selectEvent) {
		selectedFiles++;
	}
	
	//workaround for  http://jira.icesoft.org/browse/ICE-9122
	public void decrementSelectedFiles(UnselectEvent unselectEvent) {
		selectedFiles--;
		System.err.println("unselectEvent.getObject() = " + unselectEvent.getObject());
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
		DataTable dataTable = (DataTable) uiViewRoot.findComponent(DOCUMENTS_TABLE_PATH);
		
		Set<Map.Entry<Object, RowState>> entrySet = (Set<Map.Entry<Object, RowState>>) dataTable.getStateMap().entrySet();
		
		DLFileEntry unselectedDlFileEntry = (DLFileEntry) unselectEvent.getObject();

		for (Map.Entry<Object, RowState> mapEntry : entrySet) {

			DLFileEntry dlFileEntry = (DLFileEntry) mapEntry.getKey();
			//DLFolder dlFolder = (DLFolder) folderTreeNode.getUserObject();

			if (unselectedDlFileEntry.getFileEntryId() == dlFileEntry.getFileEntryId()) {
				mapEntry.getValue().setSelected(false);
			}
		}			
	}
	
	public boolean isFilesSelected() {
		return (selectedFiles > 0);
	}
}
