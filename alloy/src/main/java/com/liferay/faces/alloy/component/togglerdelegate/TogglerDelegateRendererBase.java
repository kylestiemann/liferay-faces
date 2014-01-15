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
package com.liferay.faces.alloy.component.togglerdelegate;

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
public abstract class TogglerDelegateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TogglerDelegate togglerDelegate = (TogglerDelegate) uiComponent;
		encodeHTML(facesContext, togglerDelegate);
		encodeJavaScript(facesContext, togglerDelegate);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TogglerDelegate togglerDelegate) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TogglerDelegate togglerDelegate) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, togglerDelegate);

		bufferedResponseWriter.write("var togglerDelegate = new A.TogglerDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAnimated(renrederedAttributes, togglerDelegate);
		renderCloseAllOnExpand(renrederedAttributes, togglerDelegate);
		renderContainer(renrederedAttributes, togglerDelegate);
		renderContent(renrederedAttributes, togglerDelegate);
		renderDestroyed(renrederedAttributes, togglerDelegate);
		renderExpanded(renrederedAttributes, togglerDelegate);
		renderHeader(renrederedAttributes, togglerDelegate);
		renderInitialized(renrederedAttributes, togglerDelegate);
		renderTransition(renrederedAttributes, togglerDelegate);

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

		handleBuffer(facesContext, togglerDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnimated(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getAnimated() != null) {
			renrederedAttributes.add(renderBoolean("animated", togglerDelegate.getAnimated()));
		}
	}

	protected void renderCloseAllOnExpand(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getCloseAllOnExpand() != null) {
			renrederedAttributes.add(renderBoolean("closeAllOnExpand", togglerDelegate.getCloseAllOnExpand()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getContainer() != null) {
			renrederedAttributes.add(renderString("container", togglerDelegate.getContainer()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getContent() != null) {
			renrederedAttributes.add(renderString("content", togglerDelegate.getContent()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", togglerDelegate.getDestroyed()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", togglerDelegate.getExpanded()));
		}
	}

	protected void renderHeader(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getHeader() != null) {
			renrederedAttributes.add(renderString("header", togglerDelegate.getHeader()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", togglerDelegate.getInitialized()));
		}
	}

	protected void renderTransition(ArrayList<String> renrederedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		if (togglerDelegate.getTransition() != null) {
			renrederedAttributes.add(renderObject("transition", togglerDelegate.getTransition()));
		}
	}

}