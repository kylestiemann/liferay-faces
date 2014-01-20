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

		if (textCellEditor.getAlign() != null) {
			renderAlign(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getTextCellEditorBodyContent() != null) {
			renderTextCellEditorBodyContent(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getCentered() != null) {
			renderCentered(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getConstrain() != null) {
			renderConstrain(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getContentBox() != null) {
			renderContentBox(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getDisabled() != null) {
			renderDisabled(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getEditable() != null) {
			renderEditable(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getElementName() != null) {
			renderElementName(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getFocused() != null) {
			renderFocused(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getHeight() != null) {
			renderHeight(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getHideOnSave() != null) {
			renderHideOnSave(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getTextCellEditorId() != null) {
			renderTextCellEditorId(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getInitialized() != null) {
			renderInitialized(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getInputFormatter() != null) {
			renderInputFormatter(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getTextCellEditorLocale() != null) {
			renderTextCellEditorLocale(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getOutputFormatter() != null) {
			renderOutputFormatter(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getRender() != null) {
			renderRender(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getRendered() != null) {
			renderRendered(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getShim() != null) {
			renderShim(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getShowToolbar() != null) {
			renderShowToolbar(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getStrings() != null) {
			renderStrings(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getToolbar() != null) {
			renderToolbar(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getUnescapeValue() != null) {
			renderUnescapeValue(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getValidator() != null) {
			renderValidator(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getTextCellEditorValue() != null) {
			renderTextCellEditorValue(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getVisible() != null) {
			renderVisible(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getWidth() != null) {
			renderWidth(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getX() != null) {
			renderX(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getXy() != null) {
			renderXy(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getY() != null) {
			renderY(renderedAttributes, textCellEditor);
		}
		
		if (textCellEditor.getZIndex() != null) {
			renderZIndex(renderedAttributes, textCellEditor);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (textCellEditor.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterEditableChange() != null) {
			renderAfterEditableChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterElementNameChange() != null) {
			renderAfterElementNameChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterHideOnSaveChange() != null) {
			renderAfterHideOnSaveChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterInputFormatterChange() != null) {
			renderAfterInputFormatterChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterOutputFormatterChange() != null) {
			renderAfterOutputFormatterChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterShowToolbarChange() != null) {
			renderAfterShowToolbarChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterToolbarChange() != null) {
			renderAfterToolbarChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterUnescapeValueChange() != null) {
			renderAfterUnescapeValueChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterValidatorChange() != null) {
			renderAfterValidatorChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterValueChange() != null) {
			renderAfterValueChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, textCellEditor);
		}
		
		if (textCellEditor.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, textCellEditor);
		}
		

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

		if (textCellEditor.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnEditableChange() != null) {
			renderOnEditableChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnElementNameChange() != null) {
			renderOnElementNameChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnHideOnSaveChange() != null) {
			renderOnHideOnSaveChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnInputFormatterChange() != null) {
			renderOnInputFormatterChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnOutputFormatterChange() != null) {
			renderOnOutputFormatterChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnShowToolbarChange() != null) {
			renderOnShowToolbarChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnToolbarChange() != null) {
			renderOnToolbarChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnUnescapeValueChange() != null) {
			renderOnUnescapeValueChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnValidatorChange() != null) {
			renderOnValidatorChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnValueChange() != null) {
			renderOnValueChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, textCellEditor);
		}
		
		if (textCellEditor.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, textCellEditor);
		}
		

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
		renderedAttributes.add(renderObject(TextCellEditor.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object alignOn = textCellEditor.getAlignOn();
		renderedAttributes.add(renderArray(TextCellEditor.ALIGN_ON, alignOn));
	}

	protected void renderTextCellEditorBodyContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object textCellEditorBodyContent = textCellEditor.getTextCellEditorBodyContent();
		renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_BODY_CONTENT, textCellEditorBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String boundingBox = textCellEditor.getBoundingBox();
		renderedAttributes.add(renderString(TextCellEditor.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object centered = textCellEditor.getCentered();
		renderedAttributes.add(renderString(TextCellEditor.CENTERED, centered));
	}

	protected void renderConstrain(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object constrain = textCellEditor.getConstrain();
		renderedAttributes.add(renderString(TextCellEditor.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String contentBox = textCellEditor.getContentBox();
		renderedAttributes.add(renderString(TextCellEditor.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean destroyed = textCellEditor.getDestroyed();
		renderedAttributes.add(renderBoolean(TextCellEditor.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean disabled = textCellEditor.getDisabled();
		renderedAttributes.add(renderBoolean(TextCellEditor.DISABLED, disabled));
	}

	protected void renderEditable(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean editable = textCellEditor.getEditable();
		renderedAttributes.add(renderBoolean(TextCellEditor.EDITABLE, editable));
	}

	protected void renderElementName(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String elementName = textCellEditor.getElementName();
		renderedAttributes.add(renderString(TextCellEditor.ELEMENT_NAME, elementName));
	}

	protected void renderFillHeight(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object fillHeight = textCellEditor.getFillHeight();
		renderedAttributes.add(renderString(TextCellEditor.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean focused = textCellEditor.getFocused();
		renderedAttributes.add(renderBoolean(TextCellEditor.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String footerContent = textCellEditor.getFooterContent();
		renderedAttributes.add(renderString(TextCellEditor.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object headerContent = textCellEditor.getHeaderContent();
		renderedAttributes.add(renderString(TextCellEditor.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object height = textCellEditor.getHeight();
		renderedAttributes.add(renderString(TextCellEditor.HEIGHT, height));
	}

	protected void renderHideOnSave(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean hideOnSave = textCellEditor.getHideOnSave();
		renderedAttributes.add(renderBoolean(TextCellEditor.HIDE_ON_SAVE, hideOnSave));
	}

	protected void renderTextCellEditorId(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorId = textCellEditor.getTextCellEditorId();
		renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_ID, textCellEditorId));
	}

	protected void renderInitialized(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean initialized = textCellEditor.getInitialized();
		renderedAttributes.add(renderBoolean(TextCellEditor.INITIALIZED, initialized));
	}

	protected void renderInputFormatter(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object inputFormatter = textCellEditor.getInputFormatter();
		renderedAttributes.add(renderString(TextCellEditor.INPUT_FORMATTER, inputFormatter));
	}

	protected void renderTextCellEditorLocale(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorLocale = textCellEditor.getTextCellEditorLocale();
		renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_LOCALE, textCellEditorLocale));
	}

	protected void renderOutputFormatter(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object outputFormatter = textCellEditor.getOutputFormatter();
		renderedAttributes.add(renderString(TextCellEditor.OUTPUT_FORMATTER, outputFormatter));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean preventOverlap = textCellEditor.getPreventOverlap();
		renderedAttributes.add(renderBoolean(TextCellEditor.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object render = textCellEditor.getRender();
		renderedAttributes.add(renderString(TextCellEditor.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean rendered = textCellEditor.getRendered();
		renderedAttributes.add(renderBoolean(TextCellEditor.RENDERED, rendered));
	}

	protected void renderShim(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean shim = textCellEditor.getShim();
		renderedAttributes.add(renderBoolean(TextCellEditor.SHIM, shim));
	}

	protected void renderShowToolbar(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean showToolbar = textCellEditor.getShowToolbar();
		renderedAttributes.add(renderBoolean(TextCellEditor.SHOW_TOOLBAR, showToolbar));
	}

	protected void renderSrcNode(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String srcNode = textCellEditor.getSrcNode();
		renderedAttributes.add(renderString(TextCellEditor.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object strings = textCellEditor.getStrings();
		renderedAttributes.add(renderObject(TextCellEditor.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object tabIndex = textCellEditor.getTabIndex();
		renderedAttributes.add(renderNumber(TextCellEditor.TAB_INDEX, tabIndex));
	}

	protected void renderToolbar(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object toolbar = textCellEditor.getToolbar();
		renderedAttributes.add(renderObject(TextCellEditor.TOOLBAR, toolbar));
	}

	protected void renderUnescapeValue(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean unescapeValue = textCellEditor.getUnescapeValue();
		renderedAttributes.add(renderBoolean(TextCellEditor.UNESCAPE_VALUE, unescapeValue));
	}

	protected void renderValidator(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object validator = textCellEditor.getValidator();
		renderedAttributes.add(renderObject(TextCellEditor.VALIDATOR, validator));
	}

	protected void renderTextCellEditorValue(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String textCellEditorValue = textCellEditor.getTextCellEditorValue();
		renderedAttributes.add(renderString(TextCellEditor.TEXT_CELL_EDITOR_VALUE, textCellEditorValue));
	}

	protected void renderVisible(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Boolean visible = textCellEditor.getVisible();
		renderedAttributes.add(renderBoolean(TextCellEditor.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object width = textCellEditor.getWidth();
		renderedAttributes.add(renderString(TextCellEditor.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object x = textCellEditor.getX();
		renderedAttributes.add(renderNumber(TextCellEditor.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object xy = textCellEditor.getXy();
		renderedAttributes.add(renderArray(TextCellEditor.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object y = textCellEditor.getY();
		renderedAttributes.add(renderNumber(TextCellEditor.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.Object zIndex = textCellEditor.getZIndex();
		renderedAttributes.add(renderNumber(TextCellEditor.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterAlignChange = textCellEditor.getAfterAlignChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterAlignOnChange = textCellEditor.getAfterAlignOnChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterBodyContentChange = textCellEditor.getAfterBodyContentChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterBoundingBoxChange = textCellEditor.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterCenteredChange = textCellEditor.getAfterCenteredChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterConstrainChange = textCellEditor.getAfterConstrainChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterContentBoxChange = textCellEditor.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterDestroyedChange = textCellEditor.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterDisabledChange = textCellEditor.getAfterDisabledChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEditableChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterEditableChange = textCellEditor.getAfterEditableChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_EDITABLE_CHANGE, afterEditableChange));
	}

	protected void renderAfterElementNameChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterElementNameChange = textCellEditor.getAfterElementNameChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_ELEMENT_NAME_CHANGE, afterElementNameChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFillHeightChange = textCellEditor.getAfterFillHeightChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFocusedChange = textCellEditor.getAfterFocusedChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterFooterContentChange = textCellEditor.getAfterFooterContentChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHeaderContentChange = textCellEditor.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHeightChange = textCellEditor.getAfterHeightChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnSaveChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterHideOnSaveChange = textCellEditor.getAfterHideOnSaveChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_HIDE_ON_SAVE_CHANGE, afterHideOnSaveChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterIdChange = textCellEditor.getAfterIdChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterInitializedChange = textCellEditor.getAfterInitializedChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterInputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterInputFormatterChange = textCellEditor.getAfterInputFormatterChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterLocaleChange = textCellEditor.getAfterLocaleChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterOutputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterOutputFormatterChange = textCellEditor.getAfterOutputFormatterChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterPreventOverlapChange = textCellEditor.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterRenderChange = textCellEditor.getAfterRenderChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterRenderedChange = textCellEditor.getAfterRenderedChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterShimChange = textCellEditor.getAfterShimChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterShowToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterShowToolbarChange = textCellEditor.getAfterShowToolbarChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_SHOW_TOOLBAR_CHANGE, afterShowToolbarChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterSrcNodeChange = textCellEditor.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterStringsChange = textCellEditor.getAfterStringsChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterTabIndexChange = textCellEditor.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterToolbarChange = textCellEditor.getAfterToolbarChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
	}

	protected void renderAfterUnescapeValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterUnescapeValueChange = textCellEditor.getAfterUnescapeValueChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_UNESCAPE_VALUE_CHANGE, afterUnescapeValueChange));
	}

	protected void renderAfterValidatorChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterValidatorChange = textCellEditor.getAfterValidatorChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_VALIDATOR_CHANGE, afterValidatorChange));
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterValueChange = textCellEditor.getAfterValueChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_VALUE_CHANGE, afterValueChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterVisibleChange = textCellEditor.getAfterVisibleChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterWidthChange = textCellEditor.getAfterWidthChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterXChange = textCellEditor.getAfterXChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterXyChange = textCellEditor.getAfterXyChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterYChange = textCellEditor.getAfterYChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String afterZIndexChange = textCellEditor.getAfterZIndexChange();
		renderedAttributes.add(renderString(TextCellEditor.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onAlignChange = textCellEditor.getOnAlignChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onAlignOnChange = textCellEditor.getOnAlignOnChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onBodyContentChange = textCellEditor.getOnBodyContentChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onBoundingBoxChange = textCellEditor.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onCenteredChange = textCellEditor.getOnCenteredChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onConstrainChange = textCellEditor.getOnConstrainChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onContentBoxChange = textCellEditor.getOnContentBoxChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onDestroyedChange = textCellEditor.getOnDestroyedChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onDisabledChange = textCellEditor.getOnDisabledChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEditableChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onEditableChange = textCellEditor.getOnEditableChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_EDITABLE_CHANGE, onEditableChange));
	}

	protected void renderOnElementNameChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onElementNameChange = textCellEditor.getOnElementNameChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_ELEMENT_NAME_CHANGE, onElementNameChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFillHeightChange = textCellEditor.getOnFillHeightChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFocusedChange = textCellEditor.getOnFocusedChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onFooterContentChange = textCellEditor.getOnFooterContentChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHeaderContentChange = textCellEditor.getOnHeaderContentChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHeightChange = textCellEditor.getOnHeightChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnSaveChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onHideOnSaveChange = textCellEditor.getOnHideOnSaveChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_HIDE_ON_SAVE_CHANGE, onHideOnSaveChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onIdChange = textCellEditor.getOnIdChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onInitializedChange = textCellEditor.getOnInitializedChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnInputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onInputFormatterChange = textCellEditor.getOnInputFormatterChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onLocaleChange = textCellEditor.getOnLocaleChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnOutputFormatterChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onOutputFormatterChange = textCellEditor.getOnOutputFormatterChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onPreventOverlapChange = textCellEditor.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onRenderChange = textCellEditor.getOnRenderChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onRenderedChange = textCellEditor.getOnRenderedChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onShimChange = textCellEditor.getOnShimChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnShowToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onShowToolbarChange = textCellEditor.getOnShowToolbarChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_SHOW_TOOLBAR_CHANGE, onShowToolbarChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onSrcNodeChange = textCellEditor.getOnSrcNodeChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onStringsChange = textCellEditor.getOnStringsChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onTabIndexChange = textCellEditor.getOnTabIndexChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onToolbarChange = textCellEditor.getOnToolbarChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_TOOLBAR_CHANGE, onToolbarChange));
	}

	protected void renderOnUnescapeValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onUnescapeValueChange = textCellEditor.getOnUnescapeValueChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_UNESCAPE_VALUE_CHANGE, onUnescapeValueChange));
	}

	protected void renderOnValidatorChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onValidatorChange = textCellEditor.getOnValidatorChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_VALIDATOR_CHANGE, onValidatorChange));
	}

	protected void renderOnValueChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onValueChange = textCellEditor.getOnValueChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_VALUE_CHANGE, onValueChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onVisibleChange = textCellEditor.getOnVisibleChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onWidthChange = textCellEditor.getOnWidthChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onXChange = textCellEditor.getOnXChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onXyChange = textCellEditor.getOnXyChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onYChange = textCellEditor.getOnYChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, TextCellEditor textCellEditor) throws IOException {
		java.lang.String onZIndexChange = textCellEditor.getOnZIndexChange();
		renderedAttributes.add(renderString(TextCellEditor.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}