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

import java.io.File;
import java.io.FileInputStream;
import java.text.MessageFormat;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.component.fileentry.FileEntry;
import org.icefaces.ace.component.fileentry.FileEntryEvent;
import org.icefaces.ace.component.fileentry.FileEntryResults;
import org.icefaces.ace.component.tree.Tree;
import org.icefaces.ace.model.tree.NodeState;

import com.liferay.faces.bridge.model.UploadedFile;
import com.liferay.faces.demos.dto.UploadedFileWrapper;
import com.liferay.faces.demos.tree.FolderTreeNode;
import com.liferay.faces.demos.util.DataTableUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.DuplicateFolderNameException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.FolderNameException;
import com.liferay.portlet.documentlibrary.SourceFileNameException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
@ManagedBean(name = "docLibBackingBean")
@RequestScoped
public class DocLibBackingBean {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(DocLibBackingBean.class);

	// Private Constants
	private static final long DEFAULT_REPOSITORY_ID = 0L;
	private static final String JAVA_IO_TMPDIR = "java.io.tmpdir";

	// Injections
	@ManagedProperty(name = "docLibModelBean", value = "#{docLibModelBean}")
	private DocLibModelBean docLibModelBean;

	@ManagedProperty(name = "docLibViewBean", value = "#{docLibViewBean}")
	private DocLibViewBean docLibViewBean;

	// Private Data Members
	private String fileUploadAbsolutePath;
	private String folderName;
	private String folderDescription;
	private String maxFileSizeKB;

	public void addFolder(ActionEvent actionEvent) throws AbortProcessingException {

		Folder parentFolder = docLibModelBean.getSelectedFolder();
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		long repositoryId = parentFolder.getRepositoryId();

		if (repositoryId == DEFAULT_REPOSITORY_ID) {
			repositoryId = liferayFacesContext.getScopeGroupId();
		}

		long parentFolderId = parentFolder.getFolderId();
		ServiceContext serviceContext = new ServiceContext();

		// Set the permissions such that community members can view the
		// file.
		serviceContext.setAddGroupPermissions(true);

		boolean folderDialogRendered = false;
		
		Folder childFolder = null;

		try {
			childFolder = DLAppServiceUtil.addFolder(repositoryId, parentFolderId, folderName, folderDescription, serviceContext);
		}
		catch (DuplicateFolderNameException e) {
			liferayFacesContext.addGlobalErrorMessage("please-enter-a-unique-folder-name");
			folderDialogRendered = true;
		}
		catch (DuplicateFileException e) {
			liferayFacesContext.addGlobalErrorMessage("please-enter-a-unique-folder-name");
			folderDialogRendered = true;
		}
		catch (FolderNameException e) {
			liferayFacesContext.addGlobalErrorMessage("please-enter-a-valid-name");
			e.printStackTrace();
			folderDialogRendered = true;
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			liferayFacesContext.addGlobalUnexpectedErrorMessage();
		}

		docLibViewBean.setAddFolderDialogRendered(folderDialogRendered);
		docLibViewBean.setPopupRendered(folderDialogRendered);

		FolderTreeNode childFolderTreeNode = new FolderTreeNode(childFolder, true);
		NodeState childTreeNodeState = new NodeState(); 
		childTreeNodeState.setExpansionEnabled(true); 
		childTreeNodeState.setSelectionEnabled(true); 
		childTreeNodeState.setSelected(false);
		docLibViewBean.getTreeNodeStateMap().put(childFolderTreeNode, childTreeNodeState);

//		FolderTreeNode folderTreeNode = new FolderTreeNode(parentFolder, true);
//		List<FolderTreeNode> children = docLibModelBean.getLazyNodeDataModel().loadChildrenForNode(folderTreeNode);
//		
//		for(FolderTreeNode child : children) {
//			Folder childFolder = (Folder)child.getUserObject();
//			if(childFolder.getName() == folderName) {
////				try {
////					System.err.println(((Folder)child.getUserObject()).getParentFolder().getName());
////				} catch (PortalException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				} catch (SystemException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
//				NodeState childTreeNodeState = new NodeState(); 
//				childTreeNodeState.setExpansionEnabled(true); 
//				childTreeNodeState.setSelectionEnabled(true); 
//				childTreeNodeState.setSelected(false);
//				docLibViewBean.getTreeNodeStateMap().put(child, childTreeNodeState); 
//			}
//				
//		}

		logger.debug("Added folderName=[{0}] description=[{1}]", folderName, folderDescription);

	}

	public void delete(ActionEvent actionEvent) {

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
		DataTable dataTable = (DataTable) uiViewRoot.findComponent(DataTableUtil.DOCUMENTS_TABLE_PATH);
		@SuppressWarnings("unchecked")
		List<DLFileEntry> dlFileEntries = (List<DLFileEntry>) dataTable.getStateMap().getSelected();

		try {

			int i = 0;

			for (DLFileEntry dlFileEntry : dlFileEntries) {
				DLFileEntryServiceUtil.deleteFileEntry(dlFileEntry.getFileEntryId());
			}

			dataTable.getStateMap().setAllSelected(false);

		}
		catch (Exception e) {
			logger.error(e);
			liferayFacesContext.addGlobalUnexpectedErrorMessage();
		}

		docLibModelBean.forceDocumentRequery();
		docLibViewBean.setSelectedFilesToZero();
	}

	public void handleFileUpload(FileEntryEvent fileEntryEvent) {

		boolean fileDialogRendered = false;

		try {
			FileEntry fileEntry = (FileEntry) fileEntryEvent.getSource();
			FileEntryResults results = fileEntry.getResults();
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();

			for (FileEntryResults.FileInfo fileInfo : results.getFiles()) {

				UploadedFileWrapper uploadedFile = new UploadedFileWrapper(fileInfo);

				if (uploadedFile.getStatus() == UploadedFile.Status.FILE_SAVED) {

					try {

						Folder folder = docLibModelBean.getSelectedFolder();

						String name = stripInvalidFileNameCharacters(uploadedFile.getName());
						String title = name;
						String description = null;
						String changeLog = null;
						File file = new File(uploadedFile.getAbsolutePath());
						ServiceContext serviceContext = new ServiceContext();
						serviceContext.setWorkflowAction(WorkflowConstants.ACTION_PUBLISH);

						// Temporary: Make the default setting be that community
						// members can view the file. Need to
						// develop a "Viewable By" permissions Facelet composite
						// component UI similar to
						// portal-web/docroot/html/taglib/ui/input_permissions/page.jsp
						serviceContext.setAddGroupPermissions(true);

						try {
							FileInputStream inputStream = new FileInputStream(file);
							DLAppServiceUtil.addFileEntry(folder.getRepositoryId(), folder.getFolderId(), title,
								uploadedFile.getContentType(), title, description, changeLog, inputStream,
								file.length(), serviceContext);
							docLibModelBean.forceDocumentRequery();
							inputStream.close();
							file.delete();
						}
						catch (DuplicateFileException e) {
							liferayFacesContext.addGlobalErrorMessage("please-enter-a-unique-document-name");
							fileDialogRendered = true;
						}
						catch (FileNameException e) {

							String extensions = StringUtil.merge(PrefsPropsUtil.getStringArray(
										PropsKeys.DL_FILE_EXTENSIONS, StringPool.COMMA), StringPool.COMMA_AND_SPACE);
							String message = liferayFacesContext.getMessage(
									"document-names-must-end-with-one-of-the-following-extensions");
							message = message + extensions;
							liferayFacesContext.addGlobalErrorMessage(message);
							fileDialogRendered = true;
						}
						catch (FileSizeException e) {

							String message = liferayFacesContext.getMessage(
									"please-enter-a-file-with-a-valid-file-size");
							message = message + " (" + getMaxFileSizeKB() + "k max)";
							liferayFacesContext.addGlobalErrorMessage(message);
							fileDialogRendered = true;
						}
						catch (SourceFileNameException e) {
							liferayFacesContext.addGlobalErrorMessage(
								"the-source-file-does-not-have-the-same-extension-as-the-original-file");
							fileDialogRendered = true;
						}

					}
					catch (Exception e) {
						logger.error(e.getMessage(), e);
						liferayFacesContext.addGlobalUnexpectedErrorMessage();
						fileDialogRendered = true;
					}
				}
			}
		}
		catch (Exception e) {
			logger.error(e);
		}

		docLibViewBean.setAddFileDialogRendered(fileDialogRendered);
		docLibViewBean.setPopupRendered(fileDialogRendered);
	}

	public void selectFolder(Folder folder) {

		try {

			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
			DataTable dataTable = (DataTable) uiViewRoot.findComponent(DataTableUtil.DOCUMENTS_TABLE_PATH);
			dataTable.resetSorting();
			dataTable.getStateMap().setAllSelected(false);
			docLibViewBean.breadcrumbSelectFolder(folder);
			docLibViewBean.setSelectedFilesToZero();
			docLibModelBean.setSelectedFolder(folder);
			docLibModelBean.forceBreadcrumbRequery();
			docLibModelBean.forceDocumentRequery();
		}
		catch (Exception e) {
			logger.error(e);
		}
	}

	public void treeNodeSelected(AjaxBehaviorEvent ajaxBehaviorEvent) {

		// TODO ask Neil
		Tree<?> tree = (Tree<?>) ajaxBehaviorEvent.getSource();
		tree.getStateMap();

		FolderTreeNode folderTreeNode = (FolderTreeNode) tree.getStateMap().getSelected().get(0);
		Folder folder = (Folder) folderTreeNode.getUserObject();
		docLibModelBean.setSelectedFolder(folder);

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
		DataTable dataTable = (DataTable) uiViewRoot.findComponent(DataTableUtil.DOCUMENTS_TABLE_PATH);
		dataTable.resetSorting();
		dataTable.getStateMap().setAllSelected(false);
		docLibModelBean.forceBreadcrumbRequery();
		docLibModelBean.forceDocumentRequery();
		docLibViewBean.setSelectedFilesToZero();

	}

	protected String stripInvalidFileNameCharacters(String fileName) {

		String strippedFileName = fileName;

		if (strippedFileName != null) {
			strippedFileName = strippedFileName.replaceAll("[\\\\]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[/]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[:]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[*]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[?]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[\"]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[<]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[>]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[|]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[\\[]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[\\]]", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[']", StringPool.SPACE);
			strippedFileName = strippedFileName.replaceAll("[.][.]", StringPool.SPACE);
		}

		return strippedFileName;
	}

	public void setAddFileDialogRenderedFalse() {
		docLibViewBean.setAddFileDialogRendered(false);
		docLibViewBean.setPopupRendered(false);
	}

	public void setAddFileDialogRenderedTrue() {
		docLibViewBean.setAddFileDialogRendered(true);
		docLibViewBean.setPopupRendered(true);
	}

	public void setAddFolderDialogRenderedFalse() {
		docLibViewBean.setAddFolderDialogRendered(false);
		docLibViewBean.setPopupRendered(false);
	}

	public void setAddFolderDialogRenderedTrue() {
		docLibViewBean.setAddFolderDialogRendered(true);
		docLibViewBean.setPopupRendered(true);
	}

	public void setDocLibModelBean(DocLibModelBean docLibModelBean) {

		// Injected via ManagedProperty annotation
		this.docLibModelBean = docLibModelBean;
	}

	public void setDocLibViewBean(DocLibViewBean docLibViewBean) {
		this.docLibViewBean = docLibViewBean;
	}

	public String getFileUploadAbsolutePath() {

		if (fileUploadAbsolutePath == null) {
			fileUploadAbsolutePath = System.getProperty(JAVA_IO_TMPDIR);
		}

		return fileUploadAbsolutePath;
	}

	public String getFolderDescription() {
		return folderDescription;
	}

	public void setFolderDescription(String folderDescription) {
		this.folderDescription = folderDescription;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public String getMaxFileSizeKB() {

		if (maxFileSizeKB == null) {

			try {
				long maxFileSizeBytes = GetterUtil.getLong(PrefsPropsUtil.getString(PropsKeys.DL_FILE_MAX_SIZE));
				maxFileSizeKB = MessageFormat.format("{0}", (maxFileSizeBytes / 1024L));
			}
			catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		return maxFileSizeKB;
	}
}
