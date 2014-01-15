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
package com.liferay.faces.alloy.component.aceeditor;

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
public abstract class AceEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-editor";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		AceEditor aceEditor = (AceEditor) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var aceEditor = new A.AceEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, aceEditor);
		renderContentBox(renrederedAttributes, aceEditor);
		renderDestroyed(renrederedAttributes, aceEditor);
		renderDisabled(renrederedAttributes, aceEditor);
		renderFocused(renrederedAttributes, aceEditor);
		renderHeight(renrederedAttributes, aceEditor);
		renderHighlightActiveLine(renrederedAttributes, aceEditor);
		renderAceeditorId(renrederedAttributes, aceEditor);
		renderInitialized(renrederedAttributes, aceEditor);
		renderAceeditorLocale(renrederedAttributes, aceEditor);
		renderMode(renrederedAttributes, aceEditor);
		renderReadOnly(renrederedAttributes, aceEditor);
		renderRender(renrederedAttributes, aceEditor);
		renderRendered(renrederedAttributes, aceEditor);
		renderShowPrintMargin(renrederedAttributes, aceEditor);
		renderSrcNode(renrederedAttributes, aceEditor);
		renderStrings(renrederedAttributes, aceEditor);
		renderTabIndex(renrederedAttributes, aceEditor);
		renderTabSize(renrederedAttributes, aceEditor);
		renderUseSoftTabs(renrederedAttributes, aceEditor);
		renderUseWrapMode(renrederedAttributes, aceEditor);
		renderAceeditorValue(renrederedAttributes, aceEditor);
		renderVisible(renrederedAttributes, aceEditor);
		renderWidth(renrederedAttributes, aceEditor);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", aceEditor.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", aceEditor.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", aceEditor.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", aceEditor.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", aceEditor.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", aceEditor.getHeight()));
		}
	}

	protected void renderHighlightActiveLine(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getHighlightActiveLine() != null) {
			renrederedAttributes.add(renderBoolean("highlightActiveLine", aceEditor.getHighlightActiveLine()));
		}
	}

	protected void renderAceeditorId(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getAceeditorId() != null) {
			renrederedAttributes.add(renderString("aceeditorId", aceEditor.getAceeditorId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", aceEditor.getInitialized()));
		}
	}

	protected void renderAceeditorLocale(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getAceeditorLocale() != null) {
			renrederedAttributes.add(renderString("aceeditorLocale", aceEditor.getAceeditorLocale()));
		}
	}

	protected void renderMode(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getMode() != null) {
			renrederedAttributes.add(renderString("mode", aceEditor.getMode()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", aceEditor.getReadOnly()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getRender() != null) {
			renrederedAttributes.add(renderString("render", aceEditor.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", aceEditor.getRendered()));
		}
	}

	protected void renderShowPrintMargin(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getShowPrintMargin() != null) {
			renrederedAttributes.add(renderBoolean("showPrintMargin", aceEditor.getShowPrintMargin()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", aceEditor.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", aceEditor.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", aceEditor.getTabIndex()));
		}
	}

	protected void renderTabSize(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getTabSize() != null) {
			renrederedAttributes.add(renderNumber("tabSize", aceEditor.getTabSize()));
		}
	}

	protected void renderUseSoftTabs(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getUseSoftTabs() != null) {
			renrederedAttributes.add(renderBoolean("useSoftTabs", aceEditor.getUseSoftTabs()));
		}
	}

	protected void renderUseWrapMode(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getUseWrapMode() != null) {
			renrederedAttributes.add(renderBoolean("useWrapMode", aceEditor.getUseWrapMode()));
		}
	}

	protected void renderAceeditorValue(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getAceeditorValue() != null) {
			renrederedAttributes.add(renderString("aceeditorValue", aceEditor.getAceeditorValue()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", aceEditor.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, AceEditor aceEditor) throws IOException {
		if (aceEditor.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", aceEditor.getWidth()));
		}
	}

}