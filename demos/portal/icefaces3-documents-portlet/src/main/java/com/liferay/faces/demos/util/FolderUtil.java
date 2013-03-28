package com.liferay.faces.demos.util;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.Group;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderUtil;

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
	
	public static DLFolder getRootDLFolder(Group group) {
		DLFolder rootDlFolder = DLFolderUtil.create(DLFolderConstants.DEFAULT_PARENT_FOLDER_ID);
		long groupId = group.getGroupId();
		rootDlFolder.setGroupId(groupId);
		rootDlFolder.setName(getGroupName(group));
		rootDlFolder.setRepositoryId(groupId);

		return rootDlFolder;
	}

}
