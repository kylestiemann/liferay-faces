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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, aceEditor);
		renderAfterContentBoxChange(renderedAfterEvents, aceEditor);
		renderAfterDestroyedChange(renderedAfterEvents, aceEditor);
		renderAfterDisabledChange(renderedAfterEvents, aceEditor);
		renderAfterFocusedChange(renderedAfterEvents, aceEditor);
		renderAfterHeightChange(renderedAfterEvents, aceEditor);
		renderAfterHighlightActiveLineChange(renderedAfterEvents, aceEditor);
		renderAfterIdChange(renderedAfterEvents, aceEditor);
		renderAfterInitializedChange(renderedAfterEvents, aceEditor);
		renderAfterLocaleChange(renderedAfterEvents, aceEditor);
		renderAfterModeChange(renderedAfterEvents, aceEditor);
		renderAfterReadOnlyChange(renderedAfterEvents, aceEditor);
		renderAfterRenderChange(renderedAfterEvents, aceEditor);
		renderAfterRenderedChange(renderedAfterEvents, aceEditor);
		renderAfterShowPrintMarginChange(renderedAfterEvents, aceEditor);
		renderAfterSrcNodeChange(renderedAfterEvents, aceEditor);
		renderAfterStringsChange(renderedAfterEvents, aceEditor);
		renderAfterTabIndexChange(renderedAfterEvents, aceEditor);
		renderAfterTabSizeChange(renderedAfterEvents, aceEditor);
		renderAfterUseSoftTabsChange(renderedAfterEvents, aceEditor);
		renderAfterUseWrapModeChange(renderedAfterEvents, aceEditor);
		renderAfterValueChange(renderedAfterEvents, aceEditor);
		renderAfterVisibleChange(renderedAfterEvents, aceEditor);
		renderAfterWidthChange(renderedAfterEvents, aceEditor);

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

		renderOnBoundingBoxChange(renderedOnEvents, aceEditor);
		renderOnContentBoxChange(renderedOnEvents, aceEditor);
		renderOnDestroyedChange(renderedOnEvents, aceEditor);
		renderOnDisabledChange(renderedOnEvents, aceEditor);
		renderOnFocusedChange(renderedOnEvents, aceEditor);
		renderOnHeightChange(renderedOnEvents, aceEditor);
		renderOnHighlightActiveLineChange(renderedOnEvents, aceEditor);
		renderOnIdChange(renderedOnEvents, aceEditor);
		renderOnInitializedChange(renderedOnEvents, aceEditor);
		renderOnLocaleChange(renderedOnEvents, aceEditor);
		renderOnModeChange(renderedOnEvents, aceEditor);
		renderOnReadOnlyChange(renderedOnEvents, aceEditor);
		renderOnRenderChange(renderedOnEvents, aceEditor);
		renderOnRenderedChange(renderedOnEvents, aceEditor);
		renderOnShowPrintMarginChange(renderedOnEvents, aceEditor);
		renderOnSrcNodeChange(renderedOnEvents, aceEditor);
		renderOnStringsChange(renderedOnEvents, aceEditor);
		renderOnTabIndexChange(renderedOnEvents, aceEditor);
		renderOnTabSizeChange(renderedOnEvents, aceEditor);
		renderOnUseSoftTabsChange(renderedOnEvents, aceEditor);
		renderOnUseWrapModeChange(renderedOnEvents, aceEditor);
		renderOnValueChange(renderedOnEvents, aceEditor);
		renderOnVisibleChange(renderedOnEvents, aceEditor);
		renderOnWidthChange(renderedOnEvents, aceEditor);

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

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterBoundingBoxChange = aceEditor.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterContentBoxChange = aceEditor.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterDestroyedChange = aceEditor.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterDisabledChange = aceEditor.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterFocusedChange = aceEditor.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterHeightChange = aceEditor.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightActiveLineChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterHighlightActiveLineChange = aceEditor.getAfterHighlightActiveLineChange();

		if (afterHighlightActiveLineChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, afterHighlightActiveLineChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterIdChange = aceEditor.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterInitializedChange = aceEditor.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterLocaleChange = aceEditor.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterModeChange = aceEditor.getAfterModeChange();

		if (afterModeChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_MODE_CHANGE, afterModeChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterReadOnlyChange = aceEditor.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterRenderChange = aceEditor.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterRenderedChange = aceEditor.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShowPrintMarginChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterShowPrintMarginChange = aceEditor.getAfterShowPrintMarginChange();

		if (afterShowPrintMarginChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_SHOW_PRINT_MARGIN_CHANGE, afterShowPrintMarginChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterSrcNodeChange = aceEditor.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterStringsChange = aceEditor.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterTabIndexChange = aceEditor.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTabSizeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterTabSizeChange = aceEditor.getAfterTabSizeChange();

		if (afterTabSizeChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_TAB_SIZE_CHANGE, afterTabSizeChange));
		}
	}

	protected void renderAfterUseSoftTabsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterUseSoftTabsChange = aceEditor.getAfterUseSoftTabsChange();

		if (afterUseSoftTabsChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_USE_SOFT_TABS_CHANGE, afterUseSoftTabsChange));
		}
	}

	protected void renderAfterUseWrapModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterUseWrapModeChange = aceEditor.getAfterUseWrapModeChange();

		if (afterUseWrapModeChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_USE_WRAP_MODE_CHANGE, afterUseWrapModeChange));
		}
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterValueChange = aceEditor.getAfterValueChange();

		if (afterValueChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_VALUE_CHANGE, afterValueChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterVisibleChange = aceEditor.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String afterWidthChange = aceEditor.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(AceEditor.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onBoundingBoxChange = aceEditor.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onContentBoxChange = aceEditor.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onDestroyedChange = aceEditor.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onDisabledChange = aceEditor.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onFocusedChange = aceEditor.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onHeightChange = aceEditor.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightActiveLineChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onHighlightActiveLineChange = aceEditor.getOnHighlightActiveLineChange();

		if (onHighlightActiveLineChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, onHighlightActiveLineChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onIdChange = aceEditor.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onInitializedChange = aceEditor.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onLocaleChange = aceEditor.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onModeChange = aceEditor.getOnModeChange();

		if (onModeChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_MODE_CHANGE, onModeChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onReadOnlyChange = aceEditor.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onRenderChange = aceEditor.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onRenderedChange = aceEditor.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShowPrintMarginChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onShowPrintMarginChange = aceEditor.getOnShowPrintMarginChange();

		if (onShowPrintMarginChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_SHOW_PRINT_MARGIN_CHANGE, onShowPrintMarginChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onSrcNodeChange = aceEditor.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onStringsChange = aceEditor.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onTabIndexChange = aceEditor.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTabSizeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onTabSizeChange = aceEditor.getOnTabSizeChange();

		if (onTabSizeChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_TAB_SIZE_CHANGE, onTabSizeChange));
		}
	}

	protected void renderOnUseSoftTabsChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onUseSoftTabsChange = aceEditor.getOnUseSoftTabsChange();

		if (onUseSoftTabsChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_USE_SOFT_TABS_CHANGE, onUseSoftTabsChange));
		}
	}

	protected void renderOnUseWrapModeChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onUseWrapModeChange = aceEditor.getOnUseWrapModeChange();

		if (onUseWrapModeChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_USE_WRAP_MODE_CHANGE, onUseWrapModeChange));
		}
	}

	protected void renderOnValueChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onValueChange = aceEditor.getOnValueChange();

		if (onValueChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_VALUE_CHANGE, onValueChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onVisibleChange = aceEditor.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, AceEditor aceEditor) throws IOException {
		java.lang.String onWidthChange = aceEditor.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(AceEditor.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}