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

import javax.swing.tree.DefaultMutableTreeNode;

import com.liferay.portal.kernel.repository.model.Folder;


/**
 * @author  Neil Griffin
 * @author  Kyle Stiemann
 */
public class FolderTreeNode extends DefaultMutableTreeNode {

	// serialVersionUID
	private static final long serialVersionUID = 7306498294791319916L;

	Folder folder;
	
	//TODO, I removed the need to pass in allowschildren because all nodes allow children. but ask neil
	public FolderTreeNode(Folder folder) {
		super(folder);
		this.folder = folder;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		FolderTreeNode folderTreeNode = (FolderTreeNode) obj;
		Folder other = (Folder) folderTreeNode.getUserObject();
		
		if (folder == null) {

			if (other != null)
				return false;
		}
		else if (!folder.equals(other)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		
		final int prime = 43;
		int result = 1;
		result = (prime * result) + ((folder == null) ? 0 : folder.hashCode());

		return result;
	}	
}
