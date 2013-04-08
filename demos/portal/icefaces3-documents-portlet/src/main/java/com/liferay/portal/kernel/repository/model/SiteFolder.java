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
package com.liferay.portal.kernel.repository.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;

import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.expando.model.ExpandoBridge;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class SiteFolder implements Folder {

	private static final long serialVersionUID = 2991646827589745577L;

	String name;
	private long groupId;
	private long repositoryId;

	public SiteFolder(String name, long groupId, long repositoryId) {
		this.name = name;
		this.groupId = groupId;
		this.repositoryId = repositoryId;
	}

	public boolean containsPermission(PermissionChecker permissionChecker, String actionId) throws PortalException,
		SystemException {
		throw new UnsupportedOperationException();
	}

	public boolean hasInheritableLock() {
		throw new UnsupportedOperationException();
	}

	public boolean hasLock() {
		throw new UnsupportedOperationException();
	}

	public Folder toEscapedModel() {
		throw new UnsupportedOperationException();
	}

	public boolean isSupportsMetadata() {
		throw new UnsupportedOperationException();
	}

	public List<Folder> getAncestors() throws PortalException, SystemException {
		throw new UnsupportedOperationException();
	}

	public Map<String, Serializable> getAttributes() {
		throw new UnsupportedOperationException();
	}

	public long getCompanyId() {
		throw new UnsupportedOperationException();
	}

	public void setCompanyId(long companyId) {
		throw new UnsupportedOperationException();
	}

	public Date getCreateDate() {
		throw new UnsupportedOperationException();
	}

	public void setCreateDate(Date date) {
		throw new UnsupportedOperationException();
	}

	public boolean isLocked() {
		throw new UnsupportedOperationException();
	}

	public boolean isSupportsMultipleUpload() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public ExpandoBridge getExpandoBridge() {
		throw new UnsupportedOperationException();
	}

	public long getFolderId() {
		return DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	}

	public boolean isSupportsLocking() {
		throw new UnsupportedOperationException();
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		throw new UnsupportedOperationException();
	}

	public boolean isEscapedModel() {
		throw new UnsupportedOperationException();
	}

	public boolean isSupportsSocial() {
		throw new UnsupportedOperationException();
	}

	public Date getLastPostDate() {
		throw new UnsupportedOperationException();
	}

	public Object getModel() {
		throw new UnsupportedOperationException();
	}

	public Class<?> getModelClass() {
		throw new UnsupportedOperationException();
	}

	public String getModelClassName() {
		throw new UnsupportedOperationException();
	}

	public Date getModifiedDate() {
		throw new UnsupportedOperationException();
	}

	public void setModifiedDate(Date date) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public Folder getParentFolder() throws PortalException, SystemException {
		throw new UnsupportedOperationException();
	}

	public long getParentFolderId() {
		throw new UnsupportedOperationException();
	}

	public long getPrimaryKey() {
		throw new UnsupportedOperationException();
	}

	public Serializable getPrimaryKeyObj() {
		throw new UnsupportedOperationException();
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		throw new UnsupportedOperationException();
	}

	public long getRepositoryId() {
		return repositoryId;
	}

	public boolean isSupportsShortcuts() {
		throw new UnsupportedOperationException();
	}

	public boolean isMountPoint() {
		throw new UnsupportedOperationException();
	}

	public boolean isRoot() {
		throw new UnsupportedOperationException();
	}

	public long getUserId() {
		throw new UnsupportedOperationException();
	}

	public void setUserId(long userId) {
		throw new UnsupportedOperationException();
	}

	public String getUserName() {
		throw new UnsupportedOperationException();
	}

	public void setUserName(String userName) {
		throw new UnsupportedOperationException();
	}

	public String getUserUuid() throws SystemException {
		throw new UnsupportedOperationException();
	}

	public void setUserUuid(String userUuid) {
		throw new UnsupportedOperationException();
	}

	public String getUuid() {
		throw new UnsupportedOperationException();
	}

	public boolean isDefaultRepository() {
		throw new UnsupportedOperationException();
	}
}
