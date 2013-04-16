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
package com.liferay.faces.demos.dto;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileEntryWrapper;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.StringPool;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class UIFileEntry extends FileEntryWrapper {

	// serialVersionUID
	private static final long serialVersionUID = 1890897391510276691L;

	// Private Data Members
	private String kilobytes;
	private String url;
	private String userName;

	public UIFileEntry(FileEntry fileEntry, String portalURL, String pathContext, long scopeGroupId) {
		super(fileEntry);
		this.kilobytes = Long.toString(fileEntry.getSize() / 1024L) + " KB";
		this.setUrl(portalURL + pathContext + "/documents/" + Long.toString(scopeGroupId) + StringPool.SLASH +
			fileEntry.getFolderId() + StringPool.SLASH +
			HttpUtil.encodeURL(HtmlUtil.unescape(fileEntry.getTitle())));
		this.userName = fileEntry.getUserName();

		// this.url = portalURL + pathContext + "/documents/" + Long.toString(scopeGroupId) + StringPool.SLASH +
		// dlDLFileEntry.getUuid();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		UIFileEntry other = (UIFileEntry) obj;
		FileEntry fileEntry = getWrappedModel();

		if (fileEntry == null) {

			if (other.getWrappedModel() != null)
				return false;
		}
		else if (!fileEntry.equals(other.getWrappedModel())) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		
		FileEntry fileEntry = getWrappedModel();
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((fileEntry == null) ? 0 : fileEntry.hashCode());

		return result;
	}

	public String getKilobytes() {
		return kilobytes;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
