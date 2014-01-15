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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TabViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		TabView tabView = (TabView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var tabView = new A.TabView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveDescendant(renrederedAttributes, tabView);
		renderBoundingBox(renrederedAttributes, tabView);
		renderContentBox(renrederedAttributes, tabView);
		renderDefaultChildType(renrederedAttributes, tabView);
		renderDestroyed(renrederedAttributes, tabView);
		renderDisabled(renrederedAttributes, tabView);
		renderFocused(renrederedAttributes, tabView);
		renderHeight(renrederedAttributes, tabView);
		renderTabviewId(renrederedAttributes, tabView);
		renderInitialized(renrederedAttributes, tabView);
		renderTabviewLocale(renrederedAttributes, tabView);
		renderMultiple(renrederedAttributes, tabView);
		renderRender(renrederedAttributes, tabView);
		renderRendered(renrederedAttributes, tabView);
		renderSelection(renrederedAttributes, tabView);
		renderSrcNode(renrederedAttributes, tabView);
		renderStacked(renrederedAttributes, tabView);
		renderStrings(renrederedAttributes, tabView);
		renderTabIndex(renrederedAttributes, tabView);
		renderType(renrederedAttributes, tabView);
		renderVisible(renrederedAttributes, tabView);
		renderWidth(renrederedAttributes, tabView);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveDescendant(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getActiveDescendant() != null) {
			renrederedAttributes.add(renderString("activeDescendant", tabView.getActiveDescendant()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", tabView.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", tabView.getContentBox()));
		}
	}

	protected void renderDefaultChildType(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getDefaultChildType() != null) {
			renrederedAttributes.add(renderString("defaultChildType", tabView.getDefaultChildType()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", tabView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", tabView.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", tabView.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getHeight() != null) {
			renrederedAttributes.add(renderString("height", tabView.getHeight()));
		}
	}

	protected void renderTabviewId(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getTabviewId() != null) {
			renrederedAttributes.add(renderString("tabviewId", tabView.getTabviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", tabView.getInitialized()));
		}
	}

	protected void renderTabviewLocale(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getTabviewLocale() != null) {
			renrederedAttributes.add(renderString("tabviewLocale", tabView.getTabviewLocale()));
		}
	}

	protected void renderMultiple(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getMultiple() != null) {
			renrederedAttributes.add(renderBoolean("multiple", tabView.getMultiple()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getRender() != null) {
			renrederedAttributes.add(renderString("render", tabView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", tabView.getRendered()));
		}
	}

	protected void renderSelection(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getSelection() != null) {
			renrederedAttributes.add(renderString("selection", tabView.getSelection()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", tabView.getSrcNode()));
		}
	}

	protected void renderStacked(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getStacked() != null) {
			renrederedAttributes.add(renderString("stacked", tabView.getStacked()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", tabView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", tabView.getTabIndex()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getType() != null) {
			renrederedAttributes.add(renderString("type", tabView.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", tabView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, TabView tabView) throws IOException {
		if (tabView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", tabView.getWidth()));
		}
	}

}