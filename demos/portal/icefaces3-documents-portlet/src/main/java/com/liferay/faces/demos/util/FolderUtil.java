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
package com.liferay.faces.demos.util;

import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.repository.model.SiteFolder;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Group;


/**
 * @author  Neil Griffin
 */
public class FolderUtil {

	public static String getGroupName(Group group) {

		String groupName = group.getName();
		boolean longValue = true;

		try {
			Long.parseLong(groupName);
		}
		catch (NumberFormatException e) {
			longValue = false;
		}

		if (longValue) {
			String friendlyURL = group.getFriendlyURL();

			if (friendlyURL != null) {
				groupName = friendlyURL.replace(StringPool.SLASH, StringPool.BLANK);
			}
		}

		return groupName;
	}

	public static Folder getRootFolder(Group group) {

		long groupId = group.getGroupId();
		Folder rootFolder = new SiteFolder(getGroupName(group), groupId, groupId);

		return rootFolder;
	}
	
}
