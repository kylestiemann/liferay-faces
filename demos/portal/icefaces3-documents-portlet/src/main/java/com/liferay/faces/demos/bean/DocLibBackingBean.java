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

import com.liferay.faces.bridge.model.UploadedFile;
import com.liferay.faces.demos.dto.UploadedFileWrapper;
import com.liferay.faces.demos.kyle.FolderTreeNode;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.SourceFileNameException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil;


/**
 * @author  Neil Griffin
 * @author  KyleStiemann
 */
@ManagedBean(name = "docLibBackingBean")
@RequestScoped
public class DocLibBackingBean {

	private static final String DOCUMENTS_TABLE_PATH = ":f2:l1:c2:pc1:p1:documents";

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

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();

		try {
			DLFolder dlFolder = docLibModelBean.getSelectedDlFolder();
			long repositoryId = dlFolder.getRepositoryId();

			if (repositoryId == DEFAULT_REPOSITORY_ID) {
				repositoryId = liferayFacesContext.getScopeGroupId();
			}

			long parentFolderId = dlFolder.getFolderId();
			ServiceContext serviceContext = new ServiceContext();

			// Set the permissions such that community members can view the
			// file.
			serviceContext.setAddGroupPermissions(true);

			DLAppServiceUtil.addFolder(repositoryId, parentFolderId, folderName, folderDescription, serviceContext);

			docLibViewBean.setPopupRendered(false);
			logger.debug("Added folderName=[{0}] description=[{1}]", folderName, folderDescription);
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			liferayFacesContext.addGlobalUnexpectedErrorMessage();
		}
	}

	public void delete(ActionEvent actionEvent) {
		
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		UIViewRoot uiViewRoot = liferayFacesContext.getViewRoot();
		DataTable dataTable = (DataTable) uiViewRoot.findComponent(DOCUMENTS_TABLE_PATH);
		List<DLFileEntry> dlFileEntries = (List<DLFileEntry>) dataTable.getStateMap().getSelected();

		try {

			int i = 0;
			for (DLFileEntry dlFileEntry : dlFileEntries) {
				//DLFileEntryServiceUtil.deleteFileEntry(dlFileEntry.getFileEntryId());
				System.err.println("!@#$ dlFileEntry.name at " +  (i++) + " = " + dlFileEntry.getTitle() + " id = " + dlFileEntry.getFileEntryId());
			}

			//dataTable.getStateMap().setAllSelected(false);

		}
		catch (Exception e) {
			logger.error(e);
			liferayFacesContext.addGlobalUnexpectedErrorMessage();
		}

		//docLibModelBean.forceDocumentRequery();
		//docLibViewBean.setSelectedFilesToZero();
//		setDeleteEnabled(false);

	}

	public void handleFileUpload(FileEntryEvent fileEntryEvent) {

		try {
			FileEntry fileEntry = (FileEntry) fileEntryEvent.getSource();
			FileEntryResults results = fileEntry.getResults();
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();

			for (FileEntryResults.FileInfo fileInfo : results.getFiles()) {

				UploadedFileWrapper uploadedFile = new UploadedFileWrapper(fileInfo);

				if (uploadedFile.getStatus() == UploadedFile.Status.FILE_SAVED) {

					try {

						DLFolder dlFolder = docLibModelBean.getSelectedDlFolder();

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
							DLAppServiceUtil.addFileEntry(dlFolder.getRepositoryId(), dlFolder.getFolderId(), title,
								uploadedFile.getContentType(), title, description, changeLog, inputStream,
								file.length(), serviceContext);
							docLibModelBean.forceDocumentRequery();
							inputStream.close();
							file.delete();
						}
						catch (DuplicateFileException e) {
							liferayFacesContext.addGlobalErrorMessage("please-enter-a-unique-document-name");
						}
						catch (FileNameException e) {

							String extensions = StringUtil.merge(PrefsPropsUtil.getStringArray(
										PropsKeys.DL_FILE_EXTENSIONS, StringPool.COMMA), StringPool.COMMA_AND_SPACE);
							String message = liferayFacesContext.getMessage(
									"document-names-must-end-with-one-of-the-following-extensions");
							message = message + extensions;
							liferayFacesContext.addGlobalErrorMessage(message);
						}
						catch (FileSizeException e) {

							String message = liferayFacesContext.getMessage(
									"please-enter-a-file-with-a-valid-file-size");
							message = message + " (" + getMaxFileSizeKB() + "k max)";
							liferayFacesContext.addGlobalErrorMessage(message);
						}
						catch (SourceFileNameException e) {
							liferayFacesContext.addGlobalErrorMessage(
								"the-source-file-does-not-have-the-same-extension-as-the-original-file");
						}

					}
					catch (Exception e) {
						logger.error(e.getMessage(), e);
						liferayFacesContext.addGlobalUnexpectedErrorMessage();
					}
				}
			}
		}
		catch (Exception e) {
			logger.error(e);
		}

		docLibViewBean.setPopupRendered(false);
	}

	public void selectFolder(DLFolder dlFolder) {

		try {

			docLibViewBean.breadcrumbSelectFolder(dlFolder);
			docLibViewBean.setSelectedFilesToZero();
			docLibModelBean.setSelectedDlFolder(dlFolder);
			docLibModelBean.forceBreadcrumbRequery();
			docLibModelBean.forceDocumentRequery();
		}
		catch (Exception e) {
			logger.error(e);
		}
	}

	public void treeNodeSelected(AjaxBehaviorEvent ajaxBehaviorEvent) {

		Tree tree = (Tree) ajaxBehaviorEvent.getSource();
		tree.getStateMap();

		FolderTreeNode folderTreeNode = (FolderTreeNode) tree.getStateMap().getSelected().get(0);
		DLFolder dlFolder = (DLFolder) folderTreeNode.getUserObject();
		docLibModelBean.setSelectedDlFolder(dlFolder);
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
