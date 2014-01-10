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
package com.liferay.faces.alloy.component.mediaviewerplugin;

import javax.faces.context.FacesContext;
import javax.faces.render.FacesRenderer;

import java.io.IOException;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
@FacesRenderer(
	componentFamily = "javax.faces.Panel", rendererType = "com.liferay.faces.alloy.component.mediaviewerplugin.MediaViewerPluginRenderer"
)
public class MediaViewerPluginRenderer extends MediaViewerPluginRendererBase {

	@Override
	protected void encodeHTML(FacesContext facesContext, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		// TODO Auto-generated method stub
		
	}

}