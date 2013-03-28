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
package com.liferay.faces.demos.kyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.icefaces.ace.model.tree.LazyNodeDataModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.model.Group;

import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFolderServiceUtil;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class FolderTreeLazyNodeDataModel extends LazyNodeDataModel<FolderTreeNode> {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(FolderTreeLazyNodeDataModel.class);

	private FolderTreeRootNode folderTreeRootNode;

	public FolderTreeLazyNodeDataModel(Group group) {
		folderTreeRootNode = new FolderTreeRootNode(group);
	}

	public FolderTreeNode findFolderTreeNode(long folderId) {

		FolderTreeNode folderTreeNode = null;
		FolderTreeRootNode folderTreeRootNode = (FolderTreeRootNode) getFolderTreeRootNode();
		loadChildrenForNode(folderTreeRootNode);

		@SuppressWarnings("unchecked")
		Enumeration<FolderTreeNode> folderTreeNodes = (Enumeration<FolderTreeNode>)
			folderTreeRootNode.depthFirstEnumeration();

		if (folderTreeNodes != null) {

			while (folderTreeNodes.hasMoreElements()) {
				FolderTreeNode curFolderTreeNode = folderTreeNodes.nextElement();

				DLFolder dlFolder = (DLFolder) curFolderTreeNode.getUserObject();

//				System.err.println("curFolderTreeNode = " + curFolderTreeNode + " dlFolder.getFolderId() = " +
//					dlFolder.getFolderId() + " folderId = " + folderId);

				if (dlFolder.getFolderId() == folderId) {
					folderTreeNode = curFolderTreeNode;
				}
			}
		}

		return folderTreeNode;
	}

	@Override
	public List<FolderTreeNode> loadChildrenForNode(FolderTreeNode folderTreeNode) {

		if (folderTreeNode == null) {

			List<FolderTreeNode> root = new ArrayList();
			root.add(folderTreeRootNode);

			return root;
		}
		else {

			try {
				DLFolder dlFolder = (DLFolder) folderTreeNode.getUserObject();
				List<DLFolder> childDlFolders = DLFolderServiceUtil.getFolders(dlFolder.getGroupId(),
						dlFolder.getFolderId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

				if (childDlFolders != null) {
					List<FolderTreeNode> children = new ArrayList();

					for (DLFolder childDlFolder : childDlFolders) {
						FolderTreeNode childFolderTreeNode = new FolderTreeNode(childDlFolder, true);

						children.add(childFolderTreeNode);
					}

					return children;
				}
			}
			catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		return Collections.emptyList();
	}

	public FolderTreeRootNode getFolderTreeRootNode() {
		return folderTreeRootNode;
	}
}
