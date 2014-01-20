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

		if (aceEditor.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getContentBox() != null) {
			renderContentBox(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getDisabled() != null) {
			renderDisabled(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getFocused() != null) {
			renderFocused(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getHeight() != null) {
			renderHeight(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getHighlightActiveLine() != null) {
			renderHighlightActiveLine(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getAceEditorId() != null) {
			renderAceEditorId(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getInitialized() != null) {
			renderInitialized(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getAceEditorLocale() != null) {
			renderAceEditorLocale(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getMode() != null) {
			renderMode(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getRender() != null) {
			renderRender(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getRendered() != null) {
			renderRendered(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getShowPrintMargin() != null) {
			renderShowPrintMargin(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getStrings() != null) {
			renderStrings(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getTabSize() != null) {
			renderTabSize(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getUseSoftTabs() != null) {
			renderUseSoftTabs(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getUseWrapMode() != null) {
			renderUseWrapMode(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getAceEditorValue() != null) {
			renderAceEditorValue(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getVisible() != null) {
			renderVisible(renderedAttributes, aceEditor);
		}
		
		if (aceEditor.getWidth() != null) {
			renderWidth(renderedAttributes, aceEditor);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (aceEditor.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterHighlightActiveLineChange() != null) {
			renderAfterHighlightActiveLineChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterModeChange() != null) {
			renderAfterModeChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterShowPrintMarginChange() != null) {
			renderAfterShowPrintMarginChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterTabSizeChange() != null) {
			renderAfterTabSizeChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterUseSoftTabsChange() != null) {
			renderAfterUseSoftTabsChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterUseWrapModeChange() != null) {
			renderAfterUseWrapModeChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterValueChange() != null) {
			renderAfterValueChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, aceEditor);
		}
		
		if (aceEditor.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, aceEditor);
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

		if (aceEditor.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnHighlightActiveLineChange() != null) {
			renderOnHighlightActiveLineChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnModeChange() != null) {
			renderOnModeChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnShowPrintMarginChange() != null) {
			renderOnShowPrintMarginChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnTabSizeChange() != null) {
			renderOnTabSizeChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnUseSoftTabsChange() != null) {
			renderOnUseSoftTabsChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnUseWrapModeChange() != null) {
			renderOnUseWrapModeChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnValueChange() != null) {
			renderOnValueChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, aceEditor);
		}
		
		if (aceEditor.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, aceEditor);
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

	protected void renderBoundingBox(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String boundingBox = aceEditor.getBoundingBox();
		renderedAttributes.add(renderString(AceEditor.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String contentBox = aceEditor.getContentBox();
		renderedAttributes.add(renderString(AceEditor.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean destroyed = aceEditor.getDestroyed();
		renderedAttributes.add(renderBoolean(AceEditor.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean disabled = aceEditor.getDisabled();
		renderedAttributes.add(renderBoolean(AceEditor.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean focused = aceEditor.getFocused();
		renderedAttributes.add(renderBoolean(AceEditor.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object height = aceEditor.getHeight();
		renderedAttributes.add(renderNumber(AceEditor.HEIGHT, height));
	}

	protected void renderHighlightActiveLine(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean highlightActiveLine = aceEditor.getHighlightActiveLine();
		renderedAttributes.add(renderBoolean(AceEditor.HIGHLIGHT_ACTIVE_LINE, highlightActiveLine));
	}

	protected void renderAceEditorId(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorId = aceEditor.getAceEditorId();
		renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_ID, aceEditorId));
	}

	protected void renderInitialized(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean initialized = aceEditor.getInitialized();
		renderedAttributes.add(renderBoolean(AceEditor.INITIALIZED, initialized));
	}

	protected void renderAceEditorLocale(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorLocale = aceEditor.getAceEditorLocale();
		renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_LOCALE, aceEditorLocale));
	}

	protected void renderMode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String mode = aceEditor.getMode();
		renderedAttributes.add(renderString(AceEditor.MODE, mode));
	}

	protected void renderReadOnly(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean readOnly = aceEditor.getReadOnly();
		renderedAttributes.add(renderBoolean(AceEditor.READ_ONLY, readOnly));
	}

	protected void renderRender(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object render = aceEditor.getRender();
		renderedAttributes.add(renderString(AceEditor.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean rendered = aceEditor.getRendered();
		renderedAttributes.add(renderBoolean(AceEditor.RENDERED, rendered));
	}

	protected void renderShowPrintMargin(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean showPrintMargin = aceEditor.getShowPrintMargin();
		renderedAttributes.add(renderBoolean(AceEditor.SHOW_PRINT_MARGIN, showPrintMargin));
	}

	protected void renderSrcNode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String srcNode = aceEditor.getSrcNode();
		renderedAttributes.add(renderString(AceEditor.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object strings = aceEditor.getStrings();
		renderedAttributes.add(renderObject(AceEditor.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object tabIndex = aceEditor.getTabIndex();
		renderedAttributes.add(renderNumber(AceEditor.TAB_INDEX, tabIndex));
	}

	protected void renderTabSize(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object tabSize = aceEditor.getTabSize();
		renderedAttributes.add(renderNumber(AceEditor.TAB_SIZE, tabSize));
	}

	protected void renderUseSoftTabs(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean useSoftTabs = aceEditor.getUseSoftTabs();
		renderedAttributes.add(renderBoolean(AceEditor.USE_SOFT_TABS, useSoftTabs));
	}

	protected void renderUseWrapMode(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean useWrapMode = aceEditor.getUseWrapMode();
		renderedAttributes.add(renderBoolean(AceEditor.USE_WRAP_MODE, useWrapMode));
	}

	protected void renderAceEditorValue(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String aceEditorValue = aceEditor.getAceEditorValue();
		renderedAttributes.add(renderString(AceEditor.ACE_EDITOR_VALUE, aceEditorValue));
	}

	protected void renderVisible(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Boolean visible = aceEditor.getVisible();
		renderedAttributes.add(renderBoolean(AceEditor.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.Object width = aceEditor.getWidth();
		renderedAttributes.add(renderNumber(AceEditor.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterBoundingBoxChange = aceEditor.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterContentBoxChange = aceEditor.getAfterContentBoxChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterDestroyedChange = aceEditor.getAfterDestroyedChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterDisabledChange = aceEditor.getAfterDisabledChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterFocusedChange = aceEditor.getAfterFocusedChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterHeightChange = aceEditor.getAfterHeightChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightActiveLineChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterHighlightActiveLineChange = aceEditor.getAfterHighlightActiveLineChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, afterHighlightActiveLineChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterIdChange = aceEditor.getAfterIdChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterInitializedChange = aceEditor.getAfterInitializedChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterLocaleChange = aceEditor.getAfterLocaleChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterModeChange = aceEditor.getAfterModeChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_MODE_CHANGE, afterModeChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterReadOnlyChange = aceEditor.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterRenderChange = aceEditor.getAfterRenderChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterRenderedChange = aceEditor.getAfterRenderedChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShowPrintMarginChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterShowPrintMarginChange = aceEditor.getAfterShowPrintMarginChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_SHOW_PRINT_MARGIN_CHANGE, afterShowPrintMarginChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterSrcNodeChange = aceEditor.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterStringsChange = aceEditor.getAfterStringsChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterTabIndexChange = aceEditor.getAfterTabIndexChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTabSizeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterTabSizeChange = aceEditor.getAfterTabSizeChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_TAB_SIZE_CHANGE, afterTabSizeChange));
	}

	protected void renderAfterUseSoftTabsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterUseSoftTabsChange = aceEditor.getAfterUseSoftTabsChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_USE_SOFT_TABS_CHANGE, afterUseSoftTabsChange));
	}

	protected void renderAfterUseWrapModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterUseWrapModeChange = aceEditor.getAfterUseWrapModeChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_USE_WRAP_MODE_CHANGE, afterUseWrapModeChange));
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterValueChange = aceEditor.getAfterValueChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_VALUE_CHANGE, afterValueChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterVisibleChange = aceEditor.getAfterVisibleChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterWidthChange = aceEditor.getAfterWidthChange();
		renderedAttributes.add(renderString(AceEditor.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onBoundingBoxChange = aceEditor.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(AceEditor.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onContentBoxChange = aceEditor.getOnContentBoxChange();
		renderedAttributes.add(renderString(AceEditor.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onDestroyedChange = aceEditor.getOnDestroyedChange();
		renderedAttributes.add(renderString(AceEditor.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onDisabledChange = aceEditor.getOnDisabledChange();
		renderedAttributes.add(renderString(AceEditor.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onFocusedChange = aceEditor.getOnFocusedChange();
		renderedAttributes.add(renderString(AceEditor.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onHeightChange = aceEditor.getOnHeightChange();
		renderedAttributes.add(renderString(AceEditor.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightActiveLineChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onHighlightActiveLineChange = aceEditor.getOnHighlightActiveLineChange();
		renderedAttributes.add(renderString(AceEditor.ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, onHighlightActiveLineChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onIdChange = aceEditor.getOnIdChange();
		renderedAttributes.add(renderString(AceEditor.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onInitializedChange = aceEditor.getOnInitializedChange();
		renderedAttributes.add(renderString(AceEditor.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onLocaleChange = aceEditor.getOnLocaleChange();
		renderedAttributes.add(renderString(AceEditor.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onModeChange = aceEditor.getOnModeChange();
		renderedAttributes.add(renderString(AceEditor.ON_MODE_CHANGE, onModeChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onReadOnlyChange = aceEditor.getOnReadOnlyChange();
		renderedAttributes.add(renderString(AceEditor.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onRenderChange = aceEditor.getOnRenderChange();
		renderedAttributes.add(renderString(AceEditor.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onRenderedChange = aceEditor.getOnRenderedChange();
		renderedAttributes.add(renderString(AceEditor.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShowPrintMarginChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onShowPrintMarginChange = aceEditor.getOnShowPrintMarginChange();
		renderedAttributes.add(renderString(AceEditor.ON_SHOW_PRINT_MARGIN_CHANGE, onShowPrintMarginChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onSrcNodeChange = aceEditor.getOnSrcNodeChange();
		renderedAttributes.add(renderString(AceEditor.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onStringsChange = aceEditor.getOnStringsChange();
		renderedAttributes.add(renderString(AceEditor.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onTabIndexChange = aceEditor.getOnTabIndexChange();
		renderedAttributes.add(renderString(AceEditor.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTabSizeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onTabSizeChange = aceEditor.getOnTabSizeChange();
		renderedAttributes.add(renderString(AceEditor.ON_TAB_SIZE_CHANGE, onTabSizeChange));
	}

	protected void renderOnUseSoftTabsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onUseSoftTabsChange = aceEditor.getOnUseSoftTabsChange();
		renderedAttributes.add(renderString(AceEditor.ON_USE_SOFT_TABS_CHANGE, onUseSoftTabsChange));
	}

	protected void renderOnUseWrapModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onUseWrapModeChange = aceEditor.getOnUseWrapModeChange();
		renderedAttributes.add(renderString(AceEditor.ON_USE_WRAP_MODE_CHANGE, onUseWrapModeChange));
	}

	protected void renderOnValueChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onValueChange = aceEditor.getOnValueChange();
		renderedAttributes.add(renderString(AceEditor.ON_VALUE_CHANGE, onValueChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onVisibleChange = aceEditor.getOnVisibleChange();
		renderedAttributes.add(renderString(AceEditor.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onWidthChange = aceEditor.getOnWidthChange();
		renderedAttributes.add(renderString(AceEditor.ON_WIDTH_CHANGE, onWidthChange));
	}

}