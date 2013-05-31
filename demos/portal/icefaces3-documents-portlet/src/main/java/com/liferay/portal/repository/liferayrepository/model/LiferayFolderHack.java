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

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.expando.model.ExpandoBridge;


/**
 * @author  Kyle Stiemann
 */
public class LiferayFolderHack implements Folder {

	// serialVersionUID
	private static final long serialVersionUID = 7200655218367546146L;

	// Private Data Members
	private Folder liferayFolder;

	public LiferayFolderHack(Folder liferayFolder) {
		this.liferayFolder = liferayFolder;
	}
	
	public boolean containsPermission(PermissionChecker permissionChecker, String actionId) throws PortalException,
		SystemException {
		return liferayFolder.containsPermission(permissionChecker, actionId);
	}

	@Override
	public boolean equals(Object obj) {

		
		Folder other = (Folder) obj;
//		System.err.println(((DLFolder)liferayFolder.getModel()).getFolderId() == ((DLFolder)other.getModel()).getFolderId());
//		System.err.println(liferayFolder.getModel().equals(other.getModel()));
		return liferayFolder.getModel().equals(other.getModel());
	}

	@Override
	public int hashCode() {
//		System.err.println("!@#$ ehashcode()");
		return liferayFolder.getModel().hashCode();
	}

	public boolean hasInheritableLock() {
		return liferayFolder.hasInheritableLock();
	}

	public boolean hasLock() {
		return liferayFolder.hasLock();
	}

	public Folder toEscapedModel() {
		return liferayFolder.toEscapedModel();
	}

	public boolean isSupportsMetadata() {
		return liferayFolder.isSupportsMetadata();
	}

	public List<Folder> getAncestors() throws PortalException, SystemException {
		return liferayFolder.getAncestors();
	}

	public Map<String, Serializable> getAttributes() {
		return liferayFolder.getAttributes();
	}

	public long getCompanyId() {
		return liferayFolder.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		liferayFolder.setCompanyId(companyId);
	}

	public Date getCreateDate() {
		return liferayFolder.getCreateDate();
	}

	public void setCreateDate(Date date) {
		liferayFolder.setCreateDate(date);
	}

	public boolean isLocked() {
		return liferayFolder.isLocked();
	}

	public boolean isSupportsMultipleUpload() {
		return liferayFolder.isSupportsMultipleUpload();
	}

	public String getDescription() {
		return liferayFolder.getDescription();
	}

	public ExpandoBridge getExpandoBridge() {
		return liferayFolder.getExpandoBridge();
	}

	public long getFolderId() {
		return liferayFolder.getFolderId();
	}

	public boolean isSupportsLocking() {
		return liferayFolder.isSupportsLocking();
	}

	public long getGroupId() {
		return liferayFolder.getGroupId();
	}

	public void setGroupId(long groupId) {
		liferayFolder.setGroupId(groupId);
	}

	public boolean isEscapedModel() {
		return liferayFolder.isEscapedModel();
	}

	public boolean isSupportsSocial() {
		return liferayFolder.isSupportsSocial();
	}

	public Date getLastPostDate() {
		return liferayFolder.getLastPostDate();
	}

	public Object getModel() {
		return liferayFolder.getModel();
	}

	public Class<?> getModelClass() {
		return liferayFolder.getModelClass();
	}

	public String getModelClassName() {
		return liferayFolder.getModelClassName();
	}

	public Date getModifiedDate() {
		return liferayFolder.getModifiedDate();
	}

	public void setModifiedDate(Date date) {
		liferayFolder.setModifiedDate(date);
	}

	public String getName() {
		return liferayFolder.getName();
	}

	public Folder getParentFolder() throws PortalException, SystemException {
		return liferayFolder.getParentFolder();
	}

	public long getParentFolderId() {
		return liferayFolder.getParentFolderId();
	}

	public long getPrimaryKey() {
		return liferayFolder.getPrimaryKey();
	}

	public Serializable getPrimaryKeyObj() {
		return liferayFolder.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		liferayFolder.setPrimaryKeyObj(primaryKeyObj);
	}

	public long getRepositoryId() {
		return liferayFolder.getRepositoryId();
	}

	public boolean isSupportsShortcuts() {
		return liferayFolder.isSupportsShortcuts();
	}

	public boolean isMountPoint() {
		return liferayFolder.isMountPoint();
	}

	public boolean isRoot() {
		return liferayFolder.isRoot();
	}

	public long getUserId() {
		return liferayFolder.getUserId();
	}

	public void setUserId(long userId) {
		liferayFolder.setUserId(userId);
	}

	public String getUserName() {
		return liferayFolder.getUserName();
	}

	public void setUserName(String userName) {
		liferayFolder.setUserName(userName);
	}

	public String getUserUuid() throws SystemException {
		return liferayFolder.getUserUuid();
	}

	public void setUserUuid(String userUuid) {
		liferayFolder.setUserUuid(userUuid);
	}

	public String getUuid() {
		return liferayFolder.getUuid();
	}

	public Folder getWrappedModel() {
		return liferayFolder;
	}

	public boolean isDefaultRepository() {
		return liferayFolder.isDefaultRepository();
	}
}
