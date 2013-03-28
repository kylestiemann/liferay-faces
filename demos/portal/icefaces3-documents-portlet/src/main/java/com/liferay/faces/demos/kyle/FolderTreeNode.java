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

import javax.swing.tree.DefaultMutableTreeNode;

import com.liferay.portlet.documentlibrary.model.DLFolder;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class FolderTreeNode extends DefaultMutableTreeNode {

	// serialVersionUID
	private static final long serialVersionUID = -7306498294791319916L;

	public FolderTreeNode(DLFolder dlFolder, boolean allowsChildren) {
		super(dlFolder, allowsChildren);
	}
}
