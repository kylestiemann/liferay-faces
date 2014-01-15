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
package com.liferay.faces.alloy.component.tab;

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
public abstract class TabRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Tab tab = (Tab) uiComponent;
		encodeHTML(facesContext, tab);
		encodeJavaScript(facesContext, tab);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Tab tab) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Tab tab) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, tab);

		bufferedResponseWriter.write("var tab = new A.Tab");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderContent(renrederedAttributes, tab);
		renderDisabled(renrederedAttributes, tab);
		renderLabel(renrederedAttributes, tab);
		renderPanelNode(renrederedAttributes, tab);
		renderTriggerEvent(renrederedAttributes, tab);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, tab);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, Tab tab) throws IOException {
		if (tab.getContent() != null) {
			renrederedAttributes.add(renderString("content", tab.getContent()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Tab tab) throws IOException {
		if (tab.getDisabled() != null) {
			renrederedAttributes.add(renderString("disabled", tab.getDisabled()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, Tab tab) throws IOException {
		if (tab.getLabel() != null) {
			renrederedAttributes.add(renderString("label", tab.getLabel()));
		}
	}

	protected void renderPanelNode(ArrayList<String> renrederedAttributes, Tab tab) throws IOException {
		if (tab.getPanelNode() != null) {
			renrederedAttributes.add(renderString("panelNode", tab.getPanelNode()));
		}
	}

	protected void renderTriggerEvent(ArrayList<String> renrederedAttributes, Tab tab) throws IOException {
		if (tab.getTriggerEvent() != null) {
			renrederedAttributes.add(renderString("triggerEvent", tab.getTriggerEvent()));
		}
	}

}