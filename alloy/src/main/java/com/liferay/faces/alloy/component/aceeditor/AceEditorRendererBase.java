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
public abstract class AceEditorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-editor";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		AceEditor aceEditor = (AceEditor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var aceEditor = new A.AceEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, aceEditor);
		renderContentBox(renderedAttributes, aceEditor);
		renderDestroyed(renderedAttributes, aceEditor);
		renderDisabled(renderedAttributes, aceEditor);
		renderFocused(renderedAttributes, aceEditor);
		renderHeight(renderedAttributes, aceEditor);
		renderHighlightActiveLine(renderedAttributes, aceEditor);
		renderAceEditorId(renderedAttributes, aceEditor);
		renderInitialized(renderedAttributes, aceEditor);
		renderAceEditorLocale(renderedAttributes, aceEditor);
		renderMode(renderedAttributes, aceEditor);
		renderReadOnly(renderedAttributes, aceEditor);
		renderRender(renderedAttributes, aceEditor);
		renderRendered(renderedAttributes, aceEditor);
		renderShowPrintMargin(renderedAttributes, aceEditor);
		renderSrcNode(renderedAttributes, aceEditor);
		renderStrings(renderedAttributes, aceEditor);
		renderTabIndex(renderedAttributes, aceEditor);
		renderTabSize(renderedAttributes, aceEditor);
		renderUseSoftTabs(renderedAttributes, aceEditor);
		renderUseWrapMode(renderedAttributes, aceEditor);
		renderAceEditorValue(renderedAttributes, aceEditor);
		renderVisible(renderedAttributes, aceEditor);
		renderWidth(renderedAttributes, aceEditor);

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

	protected void renderBoundingBox(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String boundingBox = aceEditor.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(AceEditor.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String contentBox = aceEditor.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(AceEditor.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean destroyed = aceEditor.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(AceEditor.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean disabled = aceEditor.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(AceEditor.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean focused = aceEditor.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(AceEditor.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object height = aceEditor.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(AceEditor.HEIGHT, height));
		}
	}

	protected void renderHighlightActiveLine(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean highlightActiveLine = aceEditor.getHighlightActiveLine();

		if (highlightActiveLine != null) {
			renderedAttributes.add(renderBoolean(AceEditor.HIGHLIGHT_ACTIVE_LINE, highlightActiveLine));
		}
	}

	protected void renderAceEditorId(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorId = aceEditor.getAceEditorId();

		if (aceEditorId != null) {
			renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_ID, aceEditorId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean initialized = aceEditor.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(AceEditor.INITIALIZED, initialized));
		}
	}

	protected void renderAceEditorLocale(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorLocale = aceEditor.getAceEditorLocale();

		if (aceEditorLocale != null) {
			renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_LOCALE, aceEditorLocale));
		}
	}

	protected void renderMode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String mode = aceEditor.getMode();

		if (mode != null) {
			renderedAttributes.add(renderString(AceEditor.MODE, mode));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean readOnly = aceEditor.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(AceEditor.READ_ONLY, readOnly));
		}
	}

	protected void renderRender(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object render = aceEditor.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(AceEditor.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean rendered = aceEditor.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(AceEditor.RENDERED, rendered));
		}
	}

	protected void renderShowPrintMargin(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean showPrintMargin = aceEditor.getShowPrintMargin();

		if (showPrintMargin != null) {
			renderedAttributes.add(renderBoolean(AceEditor.SHOW_PRINT_MARGIN, showPrintMargin));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String srcNode = aceEditor.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(AceEditor.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object strings = aceEditor.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(AceEditor.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object tabIndex = aceEditor.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(AceEditor.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTabSize(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object tabSize = aceEditor.getTabSize();

		if (tabSize != null) {
			renderedAttributes.add(renderNumber(AceEditor.TAB_SIZE, tabSize));
		}
	}

	protected void renderUseSoftTabs(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean useSoftTabs = aceEditor.getUseSoftTabs();

		if (useSoftTabs != null) {
			renderedAttributes.add(renderBoolean(AceEditor.USE_SOFT_TABS, useSoftTabs));
		}
	}

	protected void renderUseWrapMode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean useWrapMode = aceEditor.getUseWrapMode();

		if (useWrapMode != null) {
			renderedAttributes.add(renderBoolean(AceEditor.USE_WRAP_MODE, useWrapMode));
		}
	}

	protected void renderAceEditorValue(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorValue = aceEditor.getAceEditorValue();

		if (aceEditorValue != null) {
			renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_VALUE, aceEditorValue));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean visible = aceEditor.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(AceEditor.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object width = aceEditor.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(AceEditor.WIDTH, width));
		}
	}

}