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
public abstract class ToolbarRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toolbar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Toolbar toolbar = (Toolbar) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var toolbar = new A.Toolbar");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, toolbar);
		renderToolbarChildren(renrederedAttributes, toolbar);
		renderContentBox(renrederedAttributes, toolbar);
		renderCssClass(renrederedAttributes, toolbar);
		renderDestroyed(renrederedAttributes, toolbar);
		renderDisabled(renrederedAttributes, toolbar);
		renderFocused(renrederedAttributes, toolbar);
		renderHeight(renrederedAttributes, toolbar);
		renderHideClass(renrederedAttributes, toolbar);
		renderToolbarId(renrederedAttributes, toolbar);
		renderInitialized(renrederedAttributes, toolbar);
		renderToolbarLocale(renrederedAttributes, toolbar);
		renderRender(renrederedAttributes, toolbar);
		renderRendered(renrederedAttributes, toolbar);
		renderSrcNode(renrederedAttributes, toolbar);
		renderStrings(renrederedAttributes, toolbar);
		renderTabIndex(renrederedAttributes, toolbar);
		renderToolbarRenderer(renrederedAttributes, toolbar);
		renderUseARIA(renrederedAttributes, toolbar);
		renderVisible(renrederedAttributes, toolbar);
		renderWidth(renrederedAttributes, toolbar);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", toolbar.getBoundingBox()));
		}
	}

	protected void renderToolbarChildren(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getToolbarChildren() != null) {
			renrederedAttributes.add(renderArray("toolbarChildren", toolbar.getToolbarChildren()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", toolbar.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", toolbar.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", toolbar.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", toolbar.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", toolbar.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getHeight() != null) {
			renrederedAttributes.add(renderString("height", toolbar.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", toolbar.getHideClass()));
		}
	}

	protected void renderToolbarId(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getToolbarId() != null) {
			renrederedAttributes.add(renderString("toolbarId", toolbar.getToolbarId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", toolbar.getInitialized()));
		}
	}

	protected void renderToolbarLocale(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getToolbarLocale() != null) {
			renrederedAttributes.add(renderString("toolbarLocale", toolbar.getToolbarLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getRender() != null) {
			renrederedAttributes.add(renderString("render", toolbar.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", toolbar.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", toolbar.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", toolbar.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", toolbar.getTabIndex()));
		}
	}

	protected void renderToolbarRenderer(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getToolbarRenderer() != null) {
			renrederedAttributes.add(renderString("toolbarRenderer", toolbar.getToolbarRenderer()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", toolbar.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", toolbar.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Toolbar toolbar) throws IOException {
		if (toolbar.getWidth() != null) {
			renrederedAttributes.add(renderString("width", toolbar.getWidth()));
		}
	}

}