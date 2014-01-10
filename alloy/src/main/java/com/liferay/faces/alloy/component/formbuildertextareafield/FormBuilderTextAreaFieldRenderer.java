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
package com.liferay.faces.alloy.component.formbuildertextareafield;

import javax.faces.context.FacesContext;
import javax.faces.render.FacesRenderer;

import java.io.IOException;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
@FacesRenderer(
	componentFamily = "javax.faces.Panel", rendererType = "com.liferay.faces.alloy.component.formbuildertextareafield.FormBuilderTextAreaFieldRenderer"
)
public class FormBuilderTextAreaFieldRenderer extends FormBuilderTextAreaFieldRendererBase {

	@Override
	protected void encodeHTML(FacesContext facesContext, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		// TODO Auto-generated method stub
		
	}

}