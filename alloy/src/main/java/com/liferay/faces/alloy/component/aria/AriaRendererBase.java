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
package com.liferay.faces.alloy.component.aria;

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
public abstract class AriaRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-aria";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Aria aria = (Aria) uiComponent;
		encodeHTML(facesContext, aria);
		encodeJavaScript(facesContext, aria);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Aria aria) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Aria aria) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, aria);

		bufferedResponseWriter.write("var aria = new A.Aria");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAttributeNode(renrederedAttributes, aria);
		renderAttributeValueFormat(renrederedAttributes, aria);
		renderAriaAttributes(renrederedAttributes, aria);
		renderDestroyed(renrederedAttributes, aria);
		renderHost(renrederedAttributes, aria);
		renderInitialized(renrederedAttributes, aria);
		renderRoleName(renrederedAttributes, aria);
		renderRoleNode(renrederedAttributes, aria);
		renderValidateW3C(renrederedAttributes, aria);

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

		handleBuffer(facesContext, aria);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAttributeNode(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getAttributeNode() != null) {
			renrederedAttributes.add(renderString("attributeNode", aria.getAttributeNode()));
		}
	}

	protected void renderAttributeValueFormat(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getAttributeValueFormat() != null) {
			renrederedAttributes.add(renderString("attributeValueFormat", aria.getAttributeValueFormat()));
		}
	}

	protected void renderAriaAttributes(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getAriaAttributes() != null) {
			renrederedAttributes.add(renderObject("ariaAttributes", aria.getAriaAttributes()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", aria.getDestroyed()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getHost() != null) {
			renrederedAttributes.add(renderString("host", aria.getHost()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", aria.getInitialized()));
		}
	}

	protected void renderRoleName(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getRoleName() != null) {
			renrederedAttributes.add(renderString("roleName", aria.getRoleName()));
		}
	}

	protected void renderRoleNode(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getRoleNode() != null) {
			renrederedAttributes.add(renderString("roleNode", aria.getRoleNode()));
		}
	}

	protected void renderValidateW3C(ArrayList<String> renrederedAttributes, Aria aria) throws IOException {
		if (aria.getValidateW3C() != null) {
			renrederedAttributes.add(renderBoolean("validateW3C", aria.getValidateW3C()));
		}
	}

}