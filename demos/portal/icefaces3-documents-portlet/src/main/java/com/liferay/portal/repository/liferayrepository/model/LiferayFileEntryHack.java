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
package com.liferay.portal.repository.liferayrepository.model;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.Lock;
import com.liferay.portal.security.permission.PermissionChecker;

import com.liferay.portlet.expando.model.ExpandoBridge;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class LiferayFileEntryHack implements FileEntry {

	// serialVersionUID
	private static final long serialVersionUID = 1029418018671254253L;

	// Private Data Members
	private FileEntry liferayFileEntry;

	public LiferayFileEntryHack(FileEntry liferayFileEntry) {
		this.liferayFileEntry = liferayFileEntry;
	}

	public boolean containsPermission(PermissionChecker permissionChecker, String actionId) throws PortalException,
		SystemException {
		return liferayFileEntry.containsPermission(permissionChecker, actionId);
	}

	@Override
	public boolean equals(Object obj) {

		FileEntry other = (FileEntry) obj;
		return liferayFileEntry.getModel().equals(other.getModel());
	}

	@Override
	public int hashCode() {
		return liferayFileEntry.getModel().hashCode();
	}

	public boolean hasLock() {
		return liferayFileEntry.hasLock();
	}

	public FileEntry toEscapedModel() {
		return liferayFileEntry.toEscapedModel();
	}

	public boolean isSupportsMetadata() {
		return liferayFileEntry.isSupportsMetadata();
	}

	public Map<String, Serializable> getAttributes() {
		return liferayFileEntry.getAttributes();
	}

	public long getCompanyId() {
		return liferayFileEntry.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		liferayFileEntry.setCompanyId(companyId);
	}

	public InputStream getContentStream() throws PortalException, SystemException {
		return liferayFileEntry.getContentStream();
	}

	public InputStream getContentStream(String version) throws PortalException, SystemException {
		return liferayFileEntry.getContentStream();
	}

	public Date getCreateDate() {
		return liferayFileEntry.getCreateDate();
	}

	public void setCreateDate(Date date) {
		liferayFileEntry.setCreateDate(date);
	}

	public String getDescription() {
		return liferayFileEntry.getDescription();
	}

	public ExpandoBridge getExpandoBridge() {
		return liferayFileEntry.getExpandoBridge();
	}

	public String getExtension() {
		return liferayFileEntry.getExtension();
	}

	public long getFileEntryId() {
		return liferayFileEntry.getFileEntryId();
	}

	public FileVersion getFileVersion() throws PortalException, SystemException {
		return liferayFileEntry.getFileVersion();
	}

	public FileVersion getFileVersion(String version) throws PortalException, SystemException {
		return liferayFileEntry.getFileVersion();
	}

	public List<FileVersion> getFileVersions(int status) throws SystemException {
		return liferayFileEntry.getFileVersions(status);
	}

	public Folder getFolder() {
		return liferayFileEntry.getFolder();
	}

	public long getFolderId() {
		return liferayFileEntry.getFolderId();
	}

	public boolean isSupportsLocking() {
		return liferayFileEntry.isSupportsLocking();
	}

	public long getGroupId() {
		return liferayFileEntry.getGroupId();
	}

	public void setGroupId(long groupId) {
		liferayFileEntry.setGroupId(groupId);
	}

	public String getIcon() {
		return liferayFileEntry.getIcon();
	}

	public boolean isEscapedModel() {
		return liferayFileEntry.isEscapedModel();
	}

	public boolean isSupportsSocial() {
		return liferayFileEntry.isSupportsSocial();
	}

	public FileVersion getLatestFileVersion() throws PortalException, SystemException {
		return liferayFileEntry.getLatestFileVersion();
	}

	public Lock getLock() {
		return liferayFileEntry.getLock();
	}

	public String getMimeType() {
		return liferayFileEntry.getMimeType();
	}

	public String getMimeType(String version) {
		return liferayFileEntry.getMimeType(version);
	}

	public Object getModel() {
		return liferayFileEntry.getModel();
	}

	public Class<?> getModelClass() {
		return liferayFileEntry.getModelClass();
	}

	public String getModelClassName() {
		return liferayFileEntry.getModelClassName();
	}

	public Date getModifiedDate() {
		return liferayFileEntry.getModifiedDate();
	}

	public void setModifiedDate(Date date) {
		liferayFileEntry.setModifiedDate(date);
	}

	public long getPrimaryKey() {
		return liferayFileEntry.getPrimaryKey();
	}

	public Serializable getPrimaryKeyObj() {
		return liferayFileEntry.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		liferayFileEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	public int getReadCount() {
		return liferayFileEntry.getReadCount();
	}

	public long getRepositoryId() {
		return liferayFileEntry.getRepositoryId();
	}

	public long getSize() {
		return liferayFileEntry.getSize();
	}

	public boolean isCheckedOut() {
		return liferayFileEntry.isCheckedOut();
	}

	public String getTitle() {
		return liferayFileEntry.getTitle();
	}

	public long getUserId() {
		return liferayFileEntry.getUserId();
	}

	public void setUserId(long userId) {
		liferayFileEntry.setUserId(userId);
	}

	public String getUserName() {
		return liferayFileEntry.getUserName();
	}

	public void setUserName(String userName) {
		liferayFileEntry.setUserName(userName);
	}

	public String getUserUuid() throws SystemException {
		return liferayFileEntry.getUserUuid();
	}

	public void setUserUuid(String userUuid) {
		liferayFileEntry.setUserUuid(userUuid);
	}

	public String getUuid() {
		return liferayFileEntry.getUuid();
	}

	public String getVersion() {
		return liferayFileEntry.getVersion();
	}

	public long getVersionUserId() {
		return liferayFileEntry.getVersionUserId();
	}

	public String getVersionUserName() {
		return liferayFileEntry.getVersionUserName();
	}

	public String getVersionUserUuid() throws SystemException {
		return liferayFileEntry.getVersionUserUuid();
	}

	public FileEntry getWrappedModel() {
		return liferayFileEntry;
	}

	public boolean isDefaultRepository() {
		return liferayFileEntry.isDefaultRepository();
	}
}
