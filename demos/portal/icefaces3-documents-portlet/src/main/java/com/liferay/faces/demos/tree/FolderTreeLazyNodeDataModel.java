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
import java.util.Vector;

import org.icefaces.ace.model.tree.KeySegmentConverter;
import org.icefaces.ace.model.tree.LazyNodeDataModel;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.Group;
import com.liferay.portal.repository.liferayrepository.model.LiferayFolderHack;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

/**
 * @author Neil Griffin
 * @author Kyle Stiemann
 */
public class FolderTreeLazyNodeDataModel extends
		LazyNodeDataModel<FolderTreeNode> {

	// Logger
	private static final Logger logger = LoggerFactory
			.getLogger(FolderTreeLazyNodeDataModel.class);

	// Private Data Members
	private FolderTreeRootNode folderTreeRootNode;

	public FolderTreeLazyNodeDataModel(Group group) {
		folderTreeRootNode = new FolderTreeRootNode(group);
	}

	@Override
	public List<FolderTreeNode> loadChildrenForNode(
			FolderTreeNode folderTreeNode) {

		// TODO uncomment to see exception
		// new Exception().printStackTrace();

		if (folderTreeNode == null) {
			List<FolderTreeNode> root = new ArrayList<FolderTreeNode>();
			root.add(folderTreeRootNode);
//			System.err.println("NULL");
			return root;
		} else {
//			System.err.println(((Folder) folderTreeNode.getUserObject())
//					.getName());
			Folder folder = (Folder) folderTreeNode.getUserObject();
			List<Folder> childFolders = Collections.emptyList();

			try {
				childFolders = DLAppServiceUtil.getFolders(
						folder.getRepositoryId(), folder.getFolderId());
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}

			if (childFolders != null) {
				List<FolderTreeNode> children = new ArrayList<FolderTreeNode>();

				for (Folder childFolder : childFolders) {
					children.add(new FolderTreeNode(new LiferayFolderHack(
							childFolder)));
				}

				return children;
			}

			return Collections.emptyList();
		}
	}

//	List<Integer> oldIndexes = new ArrayList<Integer>();
//	FolderTreeNode oldData;
//
//	@Override
//	public FolderTreeNode navToChild(Object keySegment) {
//
//		if(getData() != null)
//		System.err.println("data " + ((Folder)getData().getUserObject()).getName());
//		else
//			System.err.println("null");
//		if(oldData != null)
//		System.err.println(((Folder)oldData.getUserObject()).getName());
//		else
//			System.err.println("null");
//		KeySegmentConverter converter = getConverter();
//		setConverter(null);
//		System.err.println("keysegment " + keySegment);
//		if (converter == getConverter()) {
//			Integer index = (Integer) keySegment;
//
//			if (index == -1) {
//				index = oldIndexes.get(oldIndexes.size() - 1) + 1;
//				
//					navToNode(oldData);
//				
//				
//				super.navToChild(index);
//				getData().removeAllChildren();
//				
//				System.err.println("ASDFASDFASDFASDFASDF" + getChildList(getData()));
//				navToNode(oldData);
////				getData().removeAllChildren();
////				getChildList(getData());
//			
//				
//			}
//			
//			oldIndexes.add(index);
//			System.err.println("index ASDFASDFASDFASDF " + index);
//			
//			if (index >= getChildList(getData()).size()) {
//				navToNode(oldData);
//				navToParent();
//			}
////			while(index >= getChildList(getData()).size()) {
////				System.err.println("ASDFASDFASDFASDFASDFASDF");
////				oldIndexes.remove(oldIndexes.size() - 1);
////				index = oldIndexes.get(oldIndexes.size() - 1) + 1;
////				if(oldData == null) {
////					return null;
////				}
////				oldData = (FolderTreeNode) oldData.getParent();
////				
////				
////				navToNode(oldData);
////				
////				if(getData() == null) {
////					return null;
////				}
////			}
//			
//			System.err.println("index " + index);
//			
//			oldData=getData();
//			return super.navToChild(index);
//		} else {
//			setConverter(converter);
//			oldData=getData();
//			return super.navToChild(keySegment);
//		}
//	}
//	
//	public void navToNode(FolderTreeNode node) {
//		if(node == null){
//			while(getData() != null) {
//				navToParent();
//			}
//			System.err.println("1");
//		}
//		else if(node.getParent() == null) {
//			while(getData() != null) {
//				navToParent();
//			}
//			super.navToChild(0);
//			if(node != getData()){
//				System.err.println("3");
//				navToChild(node.getParent().getIndex(node));
//			}
//			System.err.println("2");
//		}
//		else {
//			System.err.println("3");
//			navToNode((FolderTreeNode)node.getParent());
//			navToChild(node.getParent().getIndex(node));
//		}
//		System.err.println("navtonode = " + ((Folder)getData().getUserObject()).getName() + " node = " + ((Folder)node.getUserObject()).getName());
//	}

	public FolderTreeRootNode getFolderTreeRootNode() {
		return folderTreeRootNode;
	}
}
