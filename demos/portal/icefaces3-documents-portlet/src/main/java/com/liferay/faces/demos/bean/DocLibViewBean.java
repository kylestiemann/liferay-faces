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

import com.liferay.faces.demos.tree.FolderTreeNode;
import com.liferay.faces.demos.util.DataTableUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
@ManagedBean(name = "docLibViewBean")
@ViewScoped
public class DocLibViewBean implements Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 351876131652958472L;

	// Private Data Members
	private boolean popupRendered = false;
	private int selectedFiles = 0;
	private NodeStateMap treeNodeStateMap;
	private boolean addFolderDialogRendered = false;
	private boolean addFileDialogRendered = false;

	public void breadcrumbSelectFolder(Folder selectedFolder) {

		treeNodeStateMap.setAllSelected(false);

		Set<Map.Entry<Object, NodeState>> entrySet = treeNodeStateMap.entrySet();

		for (Map.Entry<Object, NodeState> mapEntry : entrySet) {

			FolderTreeNode folderTreeNode = (FolderTreeNode) mapEntry.getKey();
			Folder folder = (Folder) folderTreeNode.getUserObject();

			if (selectedFolder.getFolderId() == folder.getFolderId()) {
				mapEntry.getValue().setSelected(true);
			}
		}
	}

	// workaround for  http://jira.icesoft.org/browse/ICE-9122
	public void decrementSelectedFiles(UnselectEvent unselectEvent) {
		selectedFiles--;

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
		DataTable dataTable = (DataTable) uiViewRoot.findComponent(DataTableUtil.DOCUMENTS_TABLE_PATH);

		@SuppressWarnings("unchecked")
		Set<Map.Entry<Object, RowState>> entrySet = (Set<Map.Entry<Object, RowState>>) dataTable.getStateMap()
			.entrySet();

		FileEntry unselectedDlFileEntry = (FileEntry) unselectEvent.getObject();

		for (Map.Entry<Object, RowState> mapEntry : entrySet) {

			FileEntry fileEntry = (FileEntry) mapEntry.getKey();
			// Folder folder = (Folder) folderTreeNode.getUserObject();

			if (unselectedDlFileEntry.getFileEntryId() == fileEntry.getFileEntryId()) {
				mapEntry.getValue().setSelected(false);
			}
		}
	}

	public void incrementSelectedFiles(SelectEvent selectEvent) {
		selectedFiles++;
	}
	
	public void incrementSelectedFiles() {
		selectedFiles++;
	}

	public boolean isFilesSelected() {
		return (selectedFiles > 0);
	}

	public boolean isPopupRendered() {
		return popupRendered;
	}

	public void setPopupRendered(boolean popupRendered) {
		this.popupRendered = popupRendered;
	}

	public void setSelectedFilesToZero() {
		selectedFiles = 0;
	}

	public NodeStateMap getTreeNodeStateMap() {
		return treeNodeStateMap;
	}

	public void setTreeNodeStateMap(NodeStateMap treeNodeStateMap) {
		this.treeNodeStateMap = treeNodeStateMap;
	}

	public boolean isAddFolderDialogRendered() {
		return addFolderDialogRendered;
	}

	public void setAddFolderDialogRendered(boolean addFolderDialogRendered) {
		this.addFolderDialogRendered = addFolderDialogRendered;
	}

	public boolean isAddFileDialogRendered() {
		return addFileDialogRendered;
	}

	public void setAddFileDialogRendered(boolean addFileDialogRendered) {
		this.addFileDialogRendered = addFileDialogRendered;
	}
}
