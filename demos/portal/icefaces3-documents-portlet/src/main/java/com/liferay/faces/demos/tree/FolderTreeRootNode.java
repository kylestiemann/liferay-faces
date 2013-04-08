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

import com.liferay.faces.demos.util.FolderUtil;

import com.liferay.portal.model.Group;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class FolderTreeRootNode extends FolderTreeNode {

	// serialVersionUID
	private static final long serialVersionUID = 4051524313215059547L;

	public FolderTreeRootNode(Group group) {
		super(FolderUtil.getRootFolder(group), true);
	}
}
