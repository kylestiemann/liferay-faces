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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.demos.dto.UIFolder;
import com.liferay.faces.demos.list.DocumentDataModel;
import com.liferay.faces.demos.tree.FolderTreeLazyNodeDataModel;
import com.liferay.faces.demos.tree.FolderTreeRootNode;
import com.liferay.faces.demos.util.FolderUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.helper.LongHelper;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.NoSuchGroupException;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.Group;
import com.liferay.portal.service.GroupServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
@ManagedBean(name = "docLibModelBean")
@ViewScoped
public class DocLibModelBean implements Serializable {

	// serialVersionUID Note: This class implements Serializable only to avoid
	// extraneous stacktraces from being thrown
	// by Mojarra. All of the private data members are marked as transient,
	// because it's not possible to de-serialize
	// instances of Liferay's FolderImpl class due to classloader prolems.
	private static final long serialVersionUID = 6145332622204857486L;

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(DocLibModelBean.class);

	// Private Data Members
	private transient DocumentDataModel documentDataModel;
	private transient Folder selectedFolder;
	private transient FolderTreeLazyNodeDataModel lazyNodeDataModel;
	private transient List<UIFolder> breadcrumbFolders = null;
	private transient List<FileEntry> uploadedFileEntries;

	public void forceBreadcrumbRequery() {
		breadcrumbFolders = null;
	}

	public void forceDocumentRequery() {
		setDocumentDataModel(null);
	}

	public List<UIFolder> getBreadcrumbFolders() {

		if (breadcrumbFolders == null) {

			breadcrumbFolders = new ArrayList<UIFolder>();

			Folder folder = getSelectedFolder();

			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			Group scopeGroup = liferayFacesContext.getThemeDisplay().getScopeGroup();
			Folder rootFolder = FolderUtil.getRootFolder(scopeGroup);

			if (folder.getFolderId() == rootFolder.getFolderId()) {

				breadcrumbFolders.add(new UIFolder(folder, true, true));
			}
			else {

				Stack<Folder> folderStack = new Stack<Folder>();

				try {
					
					while (folder.getParentFolderId() != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID) {

						folderStack.push(folder);
						folder = folder.getParentFolder();
					}

					folderStack.push(folder);

					breadcrumbFolders.add(new UIFolder(rootFolder, true, false));

					while (!folderStack.empty()) {

						Folder poppedFolder = folderStack.pop();
						breadcrumbFolders.add(new UIFolder(poppedFolder, false, folderStack.empty()));
					}
				}
				catch (Exception e) {
					logger.error(e);
				}
			}
		}

		return breadcrumbFolders;
	}

	public DocumentDataModel getDocumentDataModel() {

		if (documentDataModel == null) {

			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			Folder folder = getSelectedFolder();
			int rowsPerPage = liferayFacesContext.getPortletPreferenceAsInt("rowsPerPage",
					SearchContainer.DEFAULT_DELTA);
			ThemeDisplay themeDisplay = liferayFacesContext.getThemeDisplay();
			String portalURL = themeDisplay.getPortalURL();
			String pathContext = themeDisplay.getPathContext();
			documentDataModel = new DocumentDataModel(folder, rowsPerPage, portalURL, pathContext);
		}

		return documentDataModel;
	}

	public void setDocumentDataModel(DocumentDataModel documentDataModel) {
		this.documentDataModel = documentDataModel;
	}

	public FolderTreeLazyNodeDataModel getLazyNodeDataModel() {

		if (lazyNodeDataModel == null) {

			try {
				LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
				Group scopeGroup = liferayFacesContext.getThemeDisplay().getScopeGroup();
				logger.debug("Querying folders for scopeGroupId=[" + scopeGroup.getGroupId() + "] scopeGroupName=[" +
					scopeGroup.getName() + "]");

				String scopeGroupIdPreference = (String) liferayFacesContext.getPortletPreference("scopeGroupId", null);

				if (scopeGroupIdPreference != null) {
					long scopeGroupId = LongHelper.toLong(scopeGroupIdPreference, 0L);

					if (scopeGroupId != 0L) {

						try {
							scopeGroup = GroupServiceUtil.getGroup(scopeGroupId);
							logger.debug("Overriding with preference scopeGroupId=[" + scopeGroup.getGroupId() +
								"] scopeGroupName=[" + scopeGroup.getName() + "]");
						}
						catch (NoSuchGroupException e) {
							logger.error(e.getMessage() + " using current group scopeId=[{0}]",
								scopeGroup.getGroupId());
						}
					}
				}

				lazyNodeDataModel = new FolderTreeLazyNodeDataModel(scopeGroup);

			}
			catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		return lazyNodeDataModel;
	}

	void setLazyNodeDataModel(FolderTreeLazyNodeDataModel lazyNodeDataModel) {
		this.lazyNodeDataModel = lazyNodeDataModel;
	}

	public Folder getSelectedFolder() {

		if (selectedFolder == null) {
			FolderTreeRootNode folderTreeRootNode = (FolderTreeRootNode) lazyNodeDataModel.getFolderTreeRootNode();
			selectedFolder = (Folder) folderTreeRootNode.getUserObject();
		}

		return selectedFolder;
	}

	public void setSelectedFolder(Folder selectedFolder) {
		this.selectedFolder = selectedFolder;
		forceDocumentRequery();
	}

	public List<FileEntry> getUploadedFileEntries() {
		return uploadedFileEntries;
	}

	public void setUploadedFileEntries(List<FileEntry> uploadedFileEntries) {
		this.uploadedFileEntries = uploadedFileEntries;
	}
}
