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
package com.liferay.faces.alloy.component.toolbar;

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
public abstract class ToolbarRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toolbar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Toolbar toolbar = (Toolbar) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var toolbar = new A.Toolbar");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, toolbar);
		renderToolbarChildren(renderedAttributes, toolbar);
		renderContentBox(renderedAttributes, toolbar);
		renderCssClass(renderedAttributes, toolbar);
		renderDestroyed(renderedAttributes, toolbar);
		renderDisabled(renderedAttributes, toolbar);
		renderFocused(renderedAttributes, toolbar);
		renderHeight(renderedAttributes, toolbar);
		renderHideClass(renderedAttributes, toolbar);
		renderToolbarId(renderedAttributes, toolbar);
		renderInitialized(renderedAttributes, toolbar);
		renderToolbarLocale(renderedAttributes, toolbar);
		renderRender(renderedAttributes, toolbar);
		renderRendered(renderedAttributes, toolbar);
		renderSrcNode(renderedAttributes, toolbar);
		renderStrings(renderedAttributes, toolbar);
		renderTabIndex(renderedAttributes, toolbar);
		renderToolbarRenderer(renderedAttributes, toolbar);
		renderUseARIA(renderedAttributes, toolbar);
		renderVisible(renderedAttributes, toolbar);
		renderWidth(renderedAttributes, toolbar);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String boundingBox = toolbar.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Toolbar.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderToolbarChildren(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object toolbarChildren = toolbar.getToolbarChildren();

		if (toolbarChildren != null) {
			renderedAttributes.add(renderArray(Toolbar.TOOLBAR_CHILDREN, toolbarChildren));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String contentBox = toolbar.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Toolbar.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String cssClass = toolbar.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Toolbar.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean destroyed = toolbar.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Toolbar.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean disabled = toolbar.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Toolbar.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean focused = toolbar.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Toolbar.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object height = toolbar.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Toolbar.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String hideClass = toolbar.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Toolbar.HIDE_CLASS, hideClass));
		}
	}

	protected void renderToolbarId(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarId = toolbar.getToolbarId();

		if (toolbarId != null) {
			renderedAttributes.add(renderString(Toolbar.TOOLBAR_ID, toolbarId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean initialized = toolbar.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Toolbar.INITIALIZED, initialized));
		}
	}

	protected void renderToolbarLocale(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarLocale = toolbar.getToolbarLocale();

		if (toolbarLocale != null) {
			renderedAttributes.add(renderString(Toolbar.TOOLBAR_LOCALE, toolbarLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object render = toolbar.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Toolbar.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean rendered = toolbar.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Toolbar.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String srcNode = toolbar.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Toolbar.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object strings = toolbar.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Toolbar.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object tabIndex = toolbar.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Toolbar.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarRenderer(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarRenderer = toolbar.getToolbarRenderer();

		if (toolbarRenderer != null) {
			renderedAttributes.add(renderString(Toolbar.TOOLBAR_RENDERER, toolbarRenderer));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean useARIA = toolbar.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Toolbar.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean visible = toolbar.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Toolbar.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object width = toolbar.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Toolbar.WIDTH, width));
		}
	}

}