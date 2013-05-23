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
import org.icefaces.ace.event.CloseEvent;
import org.icefaces.ace.event.SelectEvent;
import org.icefaces.ace.event.UnselectEvent;
import org.icefaces.ace.model.table.RowState;
import org.icefaces.ace.model.tree.NodeState;
import org.icefaces.ace.model.tree.NodeStateMap;

import com.liferay.faces.demos.tree.FolderTreeNode;
import com.liferay.faces.demos.util.DataTableUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeServiceUtil;
// future release import com.liferay.portal.theme.ThemeDisplay;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
@ManagedBean(name = "docLibViewBean")
@ViewScoped
public class DocLibViewBean implements Serializable {

	// Logger
		private static final Logger logger = LoggerFactory.getLogger(DocLibViewBean.class);
	
	// serialVersionUID
	private static final long serialVersionUID = 351876131652958472L;

	// Private Data Members
	private boolean popupRendered;
	private int selectedFiles;
	private boolean addFolderDialogRendered;
	private boolean addFileDialogRendered;
	private boolean deleteFileDialogRendered;
	private boolean deleteFolderDialogRendered;
	private boolean RootFolderSelected = true;
	private NodeStateMap treeNodeStateMap;
	private List<DLFileEntryType> dlFileEntryTypes;
	
	public List<DLFileEntryType> getDlFileEntryTypes() {
		
		if(dlFileEntryTypes == null){
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			// future release ThemeDisplay themeDisplay = liferayFacesContext.getThemeDisplay();
			List<DLFileEntryType> dlFileEntryTypes = null;		
			try {
				long[] groupIds = new long[3];
				groupIds[0] = GroupConstants.DEFAULT_LIVE_GROUP_ID; //Basic Doc
				// future release groupIds[1] = themeDisplay.getCompanyGroupId(); // Everything else: Contract, marketing banner, online training, sales presentation
				groupIds[2] = scopeGroupId; // nothing currently
				dlFileEntryTypes = DLFileEntryTypeServiceUtil.getFileEntryTypes(groupIds);
			} catch (SystemException e) {
				logger.error(e);
			}
			this.dlFileEntryTypes = dlFileEntryTypes;
		}
		
		return dlFileEntryTypes;
		
	}

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

	public boolean isRootFolderSelected() {
		return RootFolderSelected;
	}

	public void setRootFolderSelected(boolean rootFolderSelected) {
		RootFolderSelected = rootFolderSelected;
	}

	public boolean isDeleteFileDialogRendered() {
		return deleteFileDialogRendered;
	}

	public void setDeleteFileDialogRenderedTrue() {
		deleteFileDialogRendered = true;
	}
	
	public void setDeleteFileDialogRenderedFalse() {
		deleteFileDialogRendered = false;
	}
	
	public void setDeleteFileDialogRenderedFalse(CloseEvent closeEvent) {
		deleteFileDialogRendered = false;
	}

	public boolean isDeleteFolderDialogRendered() {
		return deleteFolderDialogRendered;
	}

	public void setDeleteFolderDialogRenderedTrue() {
		deleteFolderDialogRendered = true;
	}
	
	public void setDeleteFolderDialogRenderedFalse() {
		deleteFolderDialogRendered = false;
	}
}
