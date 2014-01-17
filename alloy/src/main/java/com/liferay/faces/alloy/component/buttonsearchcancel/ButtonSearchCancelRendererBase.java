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
package com.liferay.faces.alloy.component.buttonsearchcancel;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ButtonSearchCancelRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ButtonSearchCancel buttonSearchCancel = (ButtonSearchCancel) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var buttonSearchCancel = new A.ButtonSearchCancel");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderContainer(renderedAttributes, buttonSearchCancel);
		renderDestroyed(renderedAttributes, buttonSearchCancel);
		renderGutter(renderedAttributes, buttonSearchCancel);
		renderIconClass(renderedAttributes, buttonSearchCancel);
		renderInitialized(renderedAttributes, buttonSearchCancel);
		renderTrigger(renderedAttributes, buttonSearchCancel);
		renderZIndex(renderedAttributes, buttonSearchCancel);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderContainer(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String container = buttonSearchCancel.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(ButtonSearchCancel.CONTAINER, container));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Boolean destroyed = buttonSearchCancel.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ButtonSearchCancel.DESTROYED, destroyed));
		}
	}

	protected void renderGutter(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Object gutter = buttonSearchCancel.getGutter();

		if (gutter != null) {
			renderedAttributes.add(renderArray(ButtonSearchCancel.GUTTER, gutter));
		}
	}

	protected void renderIconClass(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String iconClass = buttonSearchCancel.getIconClass();

		if (iconClass != null) {
			renderedAttributes.add(renderString(ButtonSearchCancel.ICON_CLASS, iconClass));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Boolean initialized = buttonSearchCancel.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ButtonSearchCancel.INITIALIZED, initialized));
		}
	}

	protected void renderTrigger(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String trigger = buttonSearchCancel.getTrigger();

		if (trigger != null) {
			renderedAttributes.add(renderString(ButtonSearchCancel.TRIGGER, trigger));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Object zIndex = buttonSearchCancel.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(ButtonSearchCancel.Z_INDEX, zIndex));
		}
	}

}