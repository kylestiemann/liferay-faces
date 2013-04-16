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
package com.liferay.faces.demos.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.icefaces.ace.model.tree.LazyNodeDataModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.Group;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class FolderTreeLazyNodeDataModel extends LazyNodeDataModel<FolderTreeNode> {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(FolderTreeLazyNodeDataModel.class);

	// Private Data Members
	private FolderTreeRootNode folderTreeRootNode;

	public FolderTreeLazyNodeDataModel(Group group) {
		folderTreeRootNode = new FolderTreeRootNode(group);
	}

	@Override
	public List<FolderTreeNode> loadChildrenForNode(FolderTreeNode folderTreeNode) {

//		TODO uncomment to see exception
//		new Exception().printStackTrace();
		if (folderTreeNode == null) {
			List<FolderTreeNode> root = new ArrayList<FolderTreeNode>();
			root.add(folderTreeRootNode);

			return root;
		}
		else {
			Folder folder = (Folder) folderTreeNode.getUserObject();
			List<Folder> childFolders = Collections.emptyList();

			try {
				childFolders = DLAppServiceUtil.getFolders(folder.getRepositoryId(), folder.getFolderId());
			}
			catch (Exception e) {
				logger.error(e.getMessage(), e);
			}

			if (childFolders != null) {
				List<FolderTreeNode> children = new ArrayList<FolderTreeNode>();

				for (Folder childFolder : childFolders) {
					children.add(new FolderTreeNode(childFolder));
				}

				return children;
			}

			return Collections.emptyList();
		}
	}

//	
//	public List<FolderTreeNode> loadChildrenForNode(Folder folder) {
//
//		if (folder == null) {
//			Folder rootFolder = (Folder) folderTreeRootNode.getUserObject();
//			List<Folder> childFolders = Collections.emptyList();
//
//			try {
//				childFolders = DLAppServiceUtil.getFolders(rootFolder.getRepositoryId(), rootFolder.getFolderId());
//			}
//			catch (Exception e) {
//				logger.error(e.getMessage(), e);
//			}
//
//			if (childFolders != null) {
//				List<FolderTreeNode> children = new ArrayList<FolderTreeNode>();
//
//				for (Folder childFolder : childFolders) {
//					children.add(new FolderTreeNode(childFolder, true));
//				}
//
//				return children;
//			}
//
//			return Collections.emptyList();
//		}
//		else {
//
//			try {
//				// Folder folder = (Folder) folderTreeNode.getUserObject();
//				// List<Folder> childFolders =
//				// FolderUtil.findByR_P(folder.getGroupId(),
//				// folder.getFolderId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS,
//				// null);
//
//				List<Folder> childFolders = DLAppServiceUtil.getFolders(folder.getRepositoryId(), folder.getFolderId());
//
//				if (childFolders != null) {
//					List<FolderTreeNode> children = new ArrayList<FolderTreeNode>();
//
//					// int index = 0;
//					for (Folder childFolder : childFolders) {
//						// FolderTreeNode childFolderTreeNode = new FolderTreeNode(childFolder, true);
//
//						// folderTreeNode.insert(childFolderTreeNode, index);
//						children.add(new FolderTreeNode(childFolder, true));
//						// index++;
//					}
//
//					return children;
//				}
//			}
//			catch (Exception e) {
//				logger.error(e.getMessage(), e);
//			}
//
//			return Collections.emptyList();
//		}
//	}

	public FolderTreeRootNode getFolderTreeRootNode() {
		return folderTreeRootNode;
	}
}
