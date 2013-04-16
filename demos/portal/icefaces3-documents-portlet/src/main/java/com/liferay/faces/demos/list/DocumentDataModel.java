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
package com.liferay.faces.demos.list;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.model.table.LazyDataModel;
import org.icefaces.ace.model.table.SortCriteria;

import com.liferay.faces.demos.dto.UIFileEntry;
import com.liferay.faces.demos.kyle.DocumentComparatorFactory;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.repository.liferayrepository.model.LiferayFileEntryHack;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

//import com.liferay.faces.util.model.LazyDataModel;


/**
 * @author  Neil Griffin
 */
public class DocumentDataModel extends LazyDataModel<UIFileEntry> implements Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 4895165386116316346L;

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(DocumentDataModel.class);

	// Private Constants
	private static final String DEFAULT_SORT_CRITERIA = "title";

	// Private Data Members
	private Folder folder;
	private String portalURL;
	private String pathContext;
	private int rowsPerPage;

	public DocumentDataModel(Folder folder, int rowsPerPage, String portalURL, String pathContext) {

		this.folder = folder;
		this.portalURL = portalURL;
		this.pathContext = pathContext;
		setRowsPerPage(rowsPerPage);
		setRowCount(countRows());
	}

	public int countRows() {
//		List<FileEntry> files = new ArrayList<FileEntry>();

		int rows = 0;
		
		try {
//			long folderGroupId = folder.getGroupId();
//			long folderId = folder.getFolderId();
//
//			List<FileEntry> fileEntries = null;
//
//			OrderByComparator orderByComparator = DocumentComparatorFactory.getComparator(DEFAULT_SORT_CRITERIA, false);
//			System.err.println(folder.getGroupId() + ", " + folder.getFolderId());
//			System.err.println(rows);
			rows = DLAppServiceUtil.getFileEntriesCount(folder.getGroupId(), folder.getFolderId(), 0L);
//			System.err.println(rows);
//			if (fileEntries != null) {
//
//				for (FileEntry fileEntry : fileEntries) {
//
//					
//					files.add(new FileEntry(fileEntry, portalURL, pathContext, folderGroupId));
//				}
//			}
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		
		return rows;
		
	}

	public void deleteRow(Object primaryKey) throws IOException {
		long fileEntryId = (Long) primaryKey;

		try {
			FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
			DLAppServiceUtil.deleteFileEntryByTitle(folder.getGroupId(), folder.getFolderId(),
				fileEntry.getTitle());
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new IOException(e.getMessage());
		}
	}

	/**
	 * This method is called by the ICEfaces {@link DataTable} according to the rows specified in the currently
	 * displayed page of data.
	 *
	 * @param  first          The zero-relative first row index.
	 * @param  pageSize       The number of rows to fetch.
	 * @param  sortCriterias  The array of sort criteria objects. Note that since the Liferay API does not support
	 *                        multiple sort criterias, the length of this array will never be greater than one.
	 * @param  filters        The query criteria. Note that in order for the filtering to work with the Liferay API, the
	 *                        end-user must specify complete, matching words. Wildcards and partial matches are not
	 *                        supported.
	 */
	@Override
	public List<UIFileEntry> load(int first, int pageSize, SortCriteria[] sortCriterias,
		Map<String, String> filters) {

		List<UIFileEntry> files = new ArrayList<UIFileEntry>();

		String fieldName = DEFAULT_SORT_CRITERIA;
		boolean ascending = false;

		if ((sortCriterias != null) && (sortCriterias.length != 0)) {
			fieldName = sortCriterias[0].getPropertyName();
			ascending = sortCriterias[0].isAscending();
		}

		try {

			long folderGroupId = folder.getGroupId();
			long folderId = folder.getFolderId();

			List<FileEntry> fileEntries = null;
			OrderByComparator orderByComparator = DocumentComparatorFactory.getComparator(fieldName, !ascending);
			fileEntries = DLAppServiceUtil.getFileEntries(folderGroupId, folderId, first, first + pageSize,
					orderByComparator);

			for (FileEntry fileEntry : fileEntries) {
				
				if(fileEntry.getClass().getName().equals("com.liferay.portal.repository.liferayrepository.model.LiferayFileEntry")) {
					fileEntry = new LiferayFileEntryHack(fileEntry);
				}
				
				files.add(new UIFileEntry(fileEntry, portalURL, pathContext, folderGroupId));
			}

		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return files;

	}

	public int getRowsPerPage() {
		return rowsPerPage;
	}

	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
}
