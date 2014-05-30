/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.row;

import javax.faces.component.FacesComponent;

import com.liferay.faces.util.lang.StringPool;


/**
 * @author  Kyle Stiemann
 */
@FacesComponent(value = Row.COMPONENT_TYPE)
public class Row extends RowBase {

	// Public Constants
	public static final String COMPONENT_TYPE = "com.liferay.faces.alloy.component.row.Row";
	public static final String FLUID = "fluid";
	public static final String RENDERER_TYPE = "com.liferay.faces.alloy.component.row.RowRenderer";
	public static final String STYLE_CLASS_NAME = "alloy-row";

	public Row() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	@Override
	public Boolean isFluid() {
		return (Boolean) getStateHelper().eval(FLUID, true);
	}

	@Override
	public String getStyleClass() {

		String styleClass = super.getStyleClass();

		if (styleClass == null) {
			styleClass = STYLE_CLASS_NAME;
		}
		else {
			styleClass = styleClass + StringPool.SPACE + STYLE_CLASS_NAME;
		}

		return styleClass;
	}
}