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

import com.liferay.faces.util.lang.StringPool;

import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderWrapper;


/**
 * @author Kyle Stiemann
 */
public class UIFolder extends DLFolderWrapper {

	private static final long serialVersionUID = 662289118150723315L;

	private static final String FIRST = "first";
	private static final String LAST = "last";

	private boolean first;
	private boolean last;

	public UIFolder(DLFolder dlFolder, boolean first, boolean last) {
		super(dlFolder);
		this.first = first;
		this.last = last;
	}

	public String getStyleClass() {

		if (first) {
			return FIRST;
		}
		else if (last) {
			return LAST;
		}
		else {
			return StringPool.BLANK;
		}
	}

}
