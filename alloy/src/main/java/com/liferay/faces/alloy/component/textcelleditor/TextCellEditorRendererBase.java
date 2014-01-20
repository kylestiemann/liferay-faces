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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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
		renderTextCellEditorBodyContent(renderedAttributes, textCellEditor);
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
		renderTextCellEditorId(renderedAttributes, textCellEditor);
		renderInitialized(renderedAttributes, textCellEditor);
		renderInputFormatter(renderedAttributes, textCellEditor);
		renderTextCellEditorLocale(renderedAttributes, textCellEditor);
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
		renderTextCellEditorValue(renderedAttributes, textCellEditor);
		renderVisible(renderedAttributes, textCellEditor);
		renderWidth(renderedAttributes, textCellEditor);
		renderX(renderedAttributes, textCellEditor);
		renderXy(renderedAttributes, textCellEditor);
		renderY(renderedAttributes, textCellEditor);
		renderZIndex(renderedAttributes, textCellEditor);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, textCellEditor);
		renderAfterAlignOnChange(renderedAfterEvents, textCellEditor);
		renderAfterBodyContentChange(renderedAfterEvents, textCellEditor);
		renderAfterBoundingBoxChange(renderedAfterEvents, textCellEditor);
		renderAfterCenteredChange(renderedAfterEvents, textCellEditor);
		renderAfterConstrainChange(renderedAfterEvents, textCellEditor);
		renderAfterContentBoxChange(renderedAfterEvents, textCellEditor);
		renderAfterDestroyedChange(renderedAfterEvents, textCellEditor);
		renderAfterDisabledChange(renderedAfterEvents, textCellEditor);
		renderAfterEditableChange(renderedAfterEvents, textCellEditor);
		renderAfterElementNameChange(renderedAfterEvents, textCellEditor);
		renderAfterFillHeightChange(renderedAfterEvents, textCellEditor);
		renderAfterFocusedChange(renderedAfterEvents, textCellEditor);
		renderAfterFooterContentChange(renderedAfterEvents, textCellEditor);
		renderAfterHeaderContentChange(renderedAfterEvents, textCellEditor);
		renderAfterHeightChange(renderedAfterEvents, textCellEditor);
		renderAfterHideOnSaveChange(renderedAfterEvents, textCellEditor);
		renderAfterIdChange(renderedAfterEvents, textCellEditor);
		renderAfterInitializedChange(renderedAfterEvents, textCellEditor);
		renderAfterInputFormatterChange(renderedAfterEvents, textCellEditor);
		renderAfterLocaleChange(renderedAfterEvents, textCellEditor);
		renderAfterOutputFormatterChange(renderedAfterEvents, textCellEditor);
		renderAfterPreventOverlapChange(renderedAfterEvents, textCellEditor);
		renderAfterRenderChange(renderedAfterEvents, textCellEditor);
		renderAfterRenderedChange(renderedAfterEvents, textCellEditor);
		renderAfterShimChange(renderedAfterEvents, textCellEditor);
		renderAfterShowToolbarChange(renderedAfterEvents, textCellEditor);
		renderAfterSrcNodeChange(renderedAfterEvents, textCellEditor);
		renderAfterStringsChange(renderedAfterEvents, textCellEditor);
		renderAfterTabIndexChange(renderedAfterEvents, textCellEditor);
		renderAfterToolbarChange(renderedAfterEvents, textCellEditor);
		renderAfterUnescapeValueChange(renderedAfterEvents, textCellEditor);
		renderAfterValidatorChange(renderedAfterEvents, textCellEditor);
		renderAfterValueChange(renderedAfterEvents, textCellEditor);
		renderAfterVisibleChange(renderedAfterEvents, textCellEditor);
		renderAfterWidthChange(renderedAfterEvents, textCellEditor);
		renderAfterXChange(renderedAfterEvents, textCellEditor);
		renderAfterXyChange(renderedAfterEvents, textCellEditor);
		renderAfterYChange(renderedAfterEvents, textCellEditor);
		renderAfterZIndexChange(renderedAfterEvents, textCellEditor);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAlignChange(renderedOnEvents, textCellEditor);
		renderOnAlignOnChange(renderedOnEvents, textCellEditor);
		renderOnBodyContentChange(renderedOnEvents, textCellEditor);
		renderOnBoundingBoxChange(renderedOnEvents, textCellEditor);
		renderOnCenteredChange(renderedOnEvents, textCellEditor);
		renderOnConstrainChange(renderedOnEvents, textCellEditor);
		renderOnContentBoxChange(renderedOnEvents, textCellEditor);
		renderOnDestroyedChange(renderedOnEvents, textCellEditor);
		renderOnDisabledChange(renderedOnEvents, textCellEditor);
		renderOnEditableChange(renderedOnEvents, textCellEditor);
		renderOnElementNameChange(renderedOnEvents, textCellEditor);
		renderOnFillHeightChange(renderedOnEvents, textCellEditor);
		renderOnFocusedChange(renderedOnEvents, textCellEditor);
		renderOnFooterContentChange(renderedOnEvents, textCellEditor);
		renderOnHeaderContentChange(renderedOnEvents, textCellEditor);
		renderOnHeightChange(renderedOnEvents, textCellEditor);
		renderOnHideOnSaveChange(renderedOnEvents, textCellEditor);
		renderOnIdChange(renderedOnEvents, textCellEditor);
		renderOnInitializedChange(renderedOnEvents, textCellEditor);
		renderOnInputFormatterChange(renderedOnEvents, textCellEditor);
		renderOnLocaleChange(renderedOnEvents, textCellEditor);
		renderOnOutputFormatterChange(renderedOnEvents, textCellEditor);
		renderOnPreventOverlapChange(renderedOnEvents, textCellEditor);
		renderOnRenderChange(renderedOnEvents, textCellEditor);
		renderOnRenderedChange(renderedOnEvents, textCellEditor);
		renderOnShimChange(renderedOnEvents, textCellEditor);
		renderOnShowToolbarChange(renderedOnEvents, textCellEditor);
		renderOnSrcNodeChange(renderedOnEvents, textCellEditor);
		renderOnStringsChange(renderedOnEvents, textCellEditor);
		renderOnTabIndexChange(renderedOnEvents, textCellEditor);
		renderOnToolbarChange(renderedOnEvents, textCellEditor);
		renderOnUnescapeValueChange(renderedOnEvents, textCellEditor);
		renderOnValidatorChange(renderedOnEvents, textCellEditor);
		renderOnValueChange(renderedOnEvents, textCellEditor);
		renderOnVisibleChange(renderedOnEvents, textCellEditor);
		renderOnWidthChange(renderedOnEvents, textCellEditor);
		renderOnXChange(renderedOnEvents, textCellEditor);
		renderOnXyChange(renderedOnEvents, textCellEditor);
		renderOnYChange(renderedOnEvents, textCellEditor);
		renderOnZIndexChange(renderedOnEvents, textCellEditor);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderTextCellEditorBodyContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object textCellEditorBodyContent = textCellEditor.getTextCellEditorBodyContent();

		if (textCellEditorBodyContent != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_BODY_CONTENT, textCellEditorBodyContent));
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

	protected void renderTextCellEditorId(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorId = textCellEditor.getTextCellEditorId();

		if (textCellEditorId != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_ID, textCellEditorId));
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

	protected void renderTextCellEditorLocale(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorLocale = textCellEditor.getTextCellEditorLocale();

		if (textCellEditorLocale != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_LOCALE, textCellEditorLocale));
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

	protected void renderTextCellEditorValue(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorValue = textCellEditor.getTextCellEditorValue();

		if (textCellEditorValue != null) {
			renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_VALUE, textCellEditorValue));
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

	protected void renderAfterAlignChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterAlignChange = textCellEditor.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterAlignOnChange = textCellEditor.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterBodyContentChange = textCellEditor.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterBoundingBoxChange = textCellEditor.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterCenteredChange = textCellEditor.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterConstrainChange = textCellEditor.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterContentBoxChange = textCellEditor.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterDestroyedChange = textCellEditor.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterDisabledChange = textCellEditor.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEditableChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterEditableChange = textCellEditor.getAfterEditableChange();

		if (afterEditableChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_EDITABLE_CHANGE, afterEditableChange));
		}
	}

	protected void renderAfterElementNameChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterElementNameChange = textCellEditor.getAfterElementNameChange();

		if (afterElementNameChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_ELEMENT_NAME_CHANGE, afterElementNameChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFillHeightChange = textCellEditor.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFocusedChange = textCellEditor.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFooterContentChange = textCellEditor.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHeaderContentChange = textCellEditor.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHeightChange = textCellEditor.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnSaveChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHideOnSaveChange = textCellEditor.getAfterHideOnSaveChange();

		if (afterHideOnSaveChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_HIDE_ON_SAVE_CHANGE, afterHideOnSaveChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterIdChange = textCellEditor.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterInitializedChange = textCellEditor.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterInputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterInputFormatterChange = textCellEditor.getAfterInputFormatterChange();

		if (afterInputFormatterChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterLocaleChange = textCellEditor.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterOutputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterOutputFormatterChange = textCellEditor.getAfterOutputFormatterChange();

		if (afterOutputFormatterChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterPreventOverlapChange = textCellEditor.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterRenderChange = textCellEditor.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterRenderedChange = textCellEditor.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterShimChange = textCellEditor.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterShowToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterShowToolbarChange = textCellEditor.getAfterShowToolbarChange();

		if (afterShowToolbarChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_SHOW_TOOLBAR_CHANGE, afterShowToolbarChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterSrcNodeChange = textCellEditor.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterStringsChange = textCellEditor.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterTabIndexChange = textCellEditor.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterToolbarChange = textCellEditor.getAfterToolbarChange();

		if (afterToolbarChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
		}
	}

	protected void renderAfterUnescapeValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterUnescapeValueChange = textCellEditor.getAfterUnescapeValueChange();

		if (afterUnescapeValueChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_UNESCAPE_VALUE_CHANGE, afterUnescapeValueChange));
		}
	}

	protected void renderAfterValidatorChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterValidatorChange = textCellEditor.getAfterValidatorChange();

		if (afterValidatorChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_VALIDATOR_CHANGE, afterValidatorChange));
		}
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterValueChange = textCellEditor.getAfterValueChange();

		if (afterValueChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_VALUE_CHANGE, afterValueChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterVisibleChange = textCellEditor.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterWidthChange = textCellEditor.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterXChange = textCellEditor.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterXyChange = textCellEditor.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterYChange = textCellEditor.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterZIndexChange = textCellEditor.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onAlignChange = textCellEditor.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onAlignOnChange = textCellEditor.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onBodyContentChange = textCellEditor.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onBoundingBoxChange = textCellEditor.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onCenteredChange = textCellEditor.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onConstrainChange = textCellEditor.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onContentBoxChange = textCellEditor.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onDestroyedChange = textCellEditor.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onDisabledChange = textCellEditor.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEditableChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onEditableChange = textCellEditor.getOnEditableChange();

		if (onEditableChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_EDITABLE_CHANGE, onEditableChange));
		}
	}

	protected void renderOnElementNameChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onElementNameChange = textCellEditor.getOnElementNameChange();

		if (onElementNameChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_ELEMENT_NAME_CHANGE, onElementNameChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFillHeightChange = textCellEditor.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFocusedChange = textCellEditor.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFooterContentChange = textCellEditor.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHeaderContentChange = textCellEditor.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHeightChange = textCellEditor.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnSaveChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHideOnSaveChange = textCellEditor.getOnHideOnSaveChange();

		if (onHideOnSaveChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_HIDE_ON_SAVE_CHANGE, onHideOnSaveChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onIdChange = textCellEditor.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onInitializedChange = textCellEditor.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnInputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onInputFormatterChange = textCellEditor.getOnInputFormatterChange();

		if (onInputFormatterChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onLocaleChange = textCellEditor.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnOutputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onOutputFormatterChange = textCellEditor.getOnOutputFormatterChange();

		if (onOutputFormatterChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onPreventOverlapChange = textCellEditor.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onRenderChange = textCellEditor.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onRenderedChange = textCellEditor.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onShimChange = textCellEditor.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnShowToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onShowToolbarChange = textCellEditor.getOnShowToolbarChange();

		if (onShowToolbarChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_SHOW_TOOLBAR_CHANGE, onShowToolbarChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onSrcNodeChange = textCellEditor.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onStringsChange = textCellEditor.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onTabIndexChange = textCellEditor.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onToolbarChange = textCellEditor.getOnToolbarChange();

		if (onToolbarChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_TOOLBAR_CHANGE, onToolbarChange));
		}
	}

	protected void renderOnUnescapeValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onUnescapeValueChange = textCellEditor.getOnUnescapeValueChange();

		if (onUnescapeValueChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_UNESCAPE_VALUE_CHANGE, onUnescapeValueChange));
		}
	}

	protected void renderOnValidatorChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onValidatorChange = textCellEditor.getOnValidatorChange();

		if (onValidatorChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_VALIDATOR_CHANGE, onValidatorChange));
		}
	}

	protected void renderOnValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onValueChange = textCellEditor.getOnValueChange();

		if (onValueChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_VALUE_CHANGE, onValueChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onVisibleChange = textCellEditor.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onWidthChange = textCellEditor.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onXChange = textCellEditor.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onXyChange = textCellEditor.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onYChange = textCellEditor.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onZIndexChange = textCellEditor.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(TextCellEditor.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}