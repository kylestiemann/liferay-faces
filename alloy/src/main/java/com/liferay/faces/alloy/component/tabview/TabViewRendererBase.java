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
package com.liferay.faces.alloy.component.tabview;

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
public abstract class TabViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TabView tabView = (TabView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tabView = new A.TabView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveDescendant(renderedAttributes, tabView);
		renderBoundingBox(renderedAttributes, tabView);
		renderContentBox(renderedAttributes, tabView);
		renderDefaultChildType(renderedAttributes, tabView);
		renderDestroyed(renderedAttributes, tabView);
		renderDisabled(renderedAttributes, tabView);
		renderFocused(renderedAttributes, tabView);
		renderHeight(renderedAttributes, tabView);
		renderTabviewId(renderedAttributes, tabView);
		renderInitialized(renderedAttributes, tabView);
		renderTabviewLocale(renderedAttributes, tabView);
		renderMultiple(renderedAttributes, tabView);
		renderRender(renderedAttributes, tabView);
		renderRendered(renderedAttributes, tabView);
		renderSelection(renderedAttributes, tabView);
		renderSrcNode(renderedAttributes, tabView);
		renderStacked(renderedAttributes, tabView);
		renderStrings(renderedAttributes, tabView);
		renderTabIndex(renderedAttributes, tabView);
		renderType(renderedAttributes, tabView);
		renderVisible(renderedAttributes, tabView);
		renderWidth(renderedAttributes, tabView);

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

	protected void renderActiveDescendant(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object activeDescendant = tabView.getActiveDescendant();

		if (activeDescendant != null) {
			renderedAttributes.add(renderString(TabView.ACTIVE_DESCENDANT, activeDescendant));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String boundingBox = tabView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TabView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String contentBox = tabView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TabView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDefaultChildType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object defaultChildType = tabView.getDefaultChildType();

		if (defaultChildType != null) {
			renderedAttributes.add(renderString(TabView.DEFAULT_CHILD_TYPE, defaultChildType));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean destroyed = tabView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TabView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean disabled = tabView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(TabView.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean focused = tabView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(TabView.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object height = tabView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(TabView.HEIGHT, height));
		}
	}

	protected void renderTabviewId(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabviewId = tabView.getTabviewId();

		if (tabviewId != null) {
			renderedAttributes.add(renderString(TabView.TABVIEW_ID, tabviewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean initialized = tabView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TabView.INITIALIZED, initialized));
		}
	}

	protected void renderTabviewLocale(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabviewLocale = tabView.getTabviewLocale();

		if (tabviewLocale != null) {
			renderedAttributes.add(renderString(TabView.TABVIEW_LOCALE, tabviewLocale));
		}
	}

	protected void renderMultiple(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean multiple = tabView.getMultiple();

		if (multiple != null) {
			renderedAttributes.add(renderBoolean(TabView.MULTIPLE, multiple));
		}
	}

	protected void renderRender(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object render = tabView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(TabView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean rendered = tabView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TabView.RENDERED, rendered));
		}
	}

	protected void renderSelection(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object selection = tabView.getSelection();

		if (selection != null) {
			renderedAttributes.add(renderString(TabView.SELECTION, selection));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String srcNode = tabView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(TabView.SRC_NODE, srcNode));
		}
	}

	protected void renderStacked(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object stacked = tabView.getStacked();

		if (stacked != null) {
			renderedAttributes.add(renderString(TabView.STACKED, stacked));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object strings = tabView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(TabView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object tabIndex = tabView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(TabView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object type = tabView.getType();

		if (type != null) {
			renderedAttributes.add(renderString(TabView.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean visible = tabView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(TabView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object width = tabView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(TabView.WIDTH, width));
		}
	}

}