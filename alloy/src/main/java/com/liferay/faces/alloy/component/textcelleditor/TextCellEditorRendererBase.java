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
package com.liferay.faces.alloy.component.textcelleditor;

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
public abstract class TextCellEditorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TextCellEditor textCellEditor = (TextCellEditor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var textCellEditor = new A.TextCellEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, textCellEditor);
		renderAlignOn(renderedAttributes, textCellEditor);
		renderTextcelleditorBodyContent(renderedAttributes, textCellEditor);
		renderBoundingBox(renderedAttributes, textCellEditor);
		renderCentered(renderedAttributes, textCellEditor);
		renderConstrain(renderedAttributes, textCellEditor);
		renderContentBox(renderedAttributes, textCellEditor);
		renderDestroyed(renderedAttributes, textCellEditor);
		renderDisabled(renderedAttributes, textCellEditor);
		renderEditable(renderedAttributes, textCellEditor);
		renderElementName(renderedAttributes, textCellEditor);
		renderFillHeight(renderedAttributes, textCellEditor);
		renderFocused(renderedAttributes, textCellEditor);
		renderFooterContent(renderedAttributes, textCellEditor);
		renderHeaderContent(renderedAttributes, textCellEditor);
		renderHeight(renderedAttributes, textCellEditor);
		renderHideOnSave(renderedAttributes, textCellEditor);
		renderTextcelleditorId(renderedAttributes, textCellEditor);
		renderInitialized(renderedAttributes, textCellEditor);
		renderInputFormatter(renderedAttributes, textCellEditor);
		renderTextcelleditorLocale(renderedAttributes, textCellEditor);
		renderOutputFormatter(renderedAttributes, textCellEditor);
		renderPreventOverlap(renderedAttributes, textCellEditor);
		renderRender(renderedAttributes, textCellEditor);
		renderRendered(renderedAttributes, textCellEditor);
		renderShim(renderedAttributes, textCellEditor);
		renderShowToolbar(renderedAttributes, textCellEditor);
		renderSrcNode(renderedAttributes, textCellEditor);
		renderStrings(renderedAttributes, textCellEditor);
		renderTabIndex(renderedAttributes, textCellEditor);
		renderToolbar(renderedAttributes, textCellEditor);
		renderUnescapeValue(renderedAttributes, textCellEditor);
		renderValidator(renderedAttributes, textCellEditor);
		renderTextcelleditorValue(renderedAttributes, textCellEditor);
		renderVisible(renderedAttributes, textCellEditor);
		renderWidth(renderedAttributes, textCellEditor);
		renderX(renderedAttributes, textCellEditor);
		renderXy(renderedAttributes, textCellEditor);
		renderY(renderedAttributes, textCellEditor);
		renderZIndex(renderedAttributes, textCellEditor);

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

	protected void renderAlign(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object align = textCellEditor.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(TextCellEditor.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object alignOn = textCellEditor.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(TextCellEditor.ALIGN_ON, alignOn));
		}
	}

	protected void renderTextcelleditorBodyContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object textcelleditorBodyContent = textCellEditor.getTextcelleditorBodyContent();

		if (textcelleditorBodyContent != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXTCELLEDITOR_BODY_CONTENT, textcelleditorBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String boundingBox = textCellEditor.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TextCellEditor.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object centered = textCellEditor.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(TextCellEditor.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object constrain = textCellEditor.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(TextCellEditor.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String contentBox = textCellEditor.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TextCellEditor.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean destroyed = textCellEditor.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean disabled = textCellEditor.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.DISABLED, disabled));
		}
	}

	protected void renderEditable(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean editable = textCellEditor.getEditable();

		if (editable != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.EDITABLE, editable));
		}
	}

	protected void renderElementName(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String elementName = textCellEditor.getElementName();

		if (elementName != null) {
			renderedAttributes.add(renderString(TextCellEditor.ELEMENT_NAME, elementName));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object fillHeight = textCellEditor.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(TextCellEditor.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean focused = textCellEditor.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String footerContent = textCellEditor.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(TextCellEditor.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object headerContent = textCellEditor.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(TextCellEditor.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object height = textCellEditor.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(TextCellEditor.HEIGHT, height));
		}
	}

	protected void renderHideOnSave(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean hideOnSave = textCellEditor.getHideOnSave();

		if (hideOnSave != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.HIDE_ON_SAVE, hideOnSave));
		}
	}

	protected void renderTextcelleditorId(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textcelleditorId = textCellEditor.getTextcelleditorId();

		if (textcelleditorId != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXTCELLEDITOR_ID, textcelleditorId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean initialized = textCellEditor.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.INITIALIZED, initialized));
		}
	}

	protected void renderInputFormatter(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object inputFormatter = textCellEditor.getInputFormatter();

		if (inputFormatter != null) {
			renderedAttributes.add(renderString(TextCellEditor.INPUT_FORMATTER, inputFormatter));
		}
	}

	protected void renderTextcelleditorLocale(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textcelleditorLocale = textCellEditor.getTextcelleditorLocale();

		if (textcelleditorLocale != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXTCELLEDITOR_LOCALE, textcelleditorLocale));
		}
	}

	protected void renderOutputFormatter(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object outputFormatter = textCellEditor.getOutputFormatter();

		if (outputFormatter != null) {
			renderedAttributes.add(renderString(TextCellEditor.OUTPUT_FORMATTER, outputFormatter));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean preventOverlap = textCellEditor.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object render = textCellEditor.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(TextCellEditor.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean rendered = textCellEditor.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean shim = textCellEditor.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.SHIM, shim));
		}
	}

	protected void renderShowToolbar(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean showToolbar = textCellEditor.getShowToolbar();

		if (showToolbar != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.SHOW_TOOLBAR, showToolbar));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String srcNode = textCellEditor.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(TextCellEditor.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object strings = textCellEditor.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(TextCellEditor.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object tabIndex = textCellEditor.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(TextCellEditor.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbar(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object toolbar = textCellEditor.getToolbar();

		if (toolbar != null) {
			renderedAttributes.add(renderObject(TextCellEditor.TOOLBAR, toolbar));
		}
	}

	protected void renderUnescapeValue(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean unescapeValue = textCellEditor.getUnescapeValue();

		if (unescapeValue != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.UNESCAPE_VALUE, unescapeValue));
		}
	}

	protected void renderValidator(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object validator = textCellEditor.getValidator();

		if (validator != null) {
			renderedAttributes.add(renderObject(TextCellEditor.VALIDATOR, validator));
		}
	}

	protected void renderTextcelleditorValue(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textcelleditorValue = textCellEditor.getTextcelleditorValue();

		if (textcelleditorValue != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXTCELLEDITOR_VALUE, textcelleditorValue));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean visible = textCellEditor.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(TextCellEditor.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object width = textCellEditor.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(TextCellEditor.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object x = textCellEditor.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(TextCellEditor.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object xy = textCellEditor.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(TextCellEditor.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object y = textCellEditor.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(TextCellEditor.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object zIndex = textCellEditor.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(TextCellEditor.Z_INDEX, zIndex));
		}
	}

}