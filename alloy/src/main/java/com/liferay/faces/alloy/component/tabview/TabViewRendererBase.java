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
package com.liferay.faces.alloy.component.tabview;

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
public abstract class TabViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TabView tabView = (TabView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tabView = new A.TabView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (tabView.getActiveDescendant() != null) {
			renderActiveDescendant(renderedAttributes, tabView);
		}

		if (tabView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, tabView);
		}

		if (tabView.getContentBox() != null) {
			renderContentBox(renderedAttributes, tabView);
		}

		if (tabView.getDefaultChildType() != null) {
			renderDefaultChildType(renderedAttributes, tabView);
		}

		if (tabView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, tabView);
		}

		if (tabView.getDisabled() != null) {
			renderDisabled(renderedAttributes, tabView);
		}

		if (tabView.getFocused() != null) {
			renderFocused(renderedAttributes, tabView);
		}

		if (tabView.getHeight() != null) {
			renderHeight(renderedAttributes, tabView);
		}

		if (tabView.getTabViewId() != null) {
			renderTabViewId(renderedAttributes, tabView);
		}

		if (tabView.getInitialized() != null) {
			renderInitialized(renderedAttributes, tabView);
		}

		if (tabView.getTabViewLocale() != null) {
			renderTabViewLocale(renderedAttributes, tabView);
		}

		if (tabView.getMultiple() != null) {
			renderMultiple(renderedAttributes, tabView);
		}

		if (tabView.getRender() != null) {
			renderRender(renderedAttributes, tabView);
		}

		if (tabView.getRendered() != null) {
			renderRendered(renderedAttributes, tabView);
		}

		if (tabView.getSelection() != null) {
			renderSelection(renderedAttributes, tabView);
		}

		if (tabView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, tabView);
		}

		if (tabView.getStacked() != null) {
			renderStacked(renderedAttributes, tabView);
		}

		if (tabView.getStrings() != null) {
			renderStrings(renderedAttributes, tabView);
		}

		if (tabView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, tabView);
		}

		if (tabView.getType() != null) {
			renderType(renderedAttributes, tabView);
		}

		if (tabView.getVisible() != null) {
			renderVisible(renderedAttributes, tabView);
		}

		if (tabView.getWidth() != null) {
			renderWidth(renderedAttributes, tabView);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (tabView.getAfterActiveDescendantChange() != null) {
			renderAfterActiveDescendantChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterDefaultChildTypeChange() != null) {
			renderAfterDefaultChildTypeChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterMultipleChange() != null) {
			renderAfterMultipleChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterSelectionChange() != null) {
			renderAfterSelectionChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterStackedChange() != null) {
			renderAfterStackedChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, tabView);
		}

		if (tabView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, tabView);
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

		if (tabView.getOnActiveDescendantChange() != null) {
			renderOnActiveDescendantChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnDefaultChildTypeChange() != null) {
			renderOnDefaultChildTypeChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnMultipleChange() != null) {
			renderOnMultipleChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnSelectionChange() != null) {
			renderOnSelectionChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnStackedChange() != null) {
			renderOnStackedChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, tabView);
		}

		if (tabView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, tabView);
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

	protected void renderActiveDescendant(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object activeDescendant = tabView.getActiveDescendant();
		renderedAttributes.add(renderString(TabView.ACTIVE_DESCENDANT, activeDescendant));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String boundingBox = tabView.getBoundingBox();
		renderedAttributes.add(renderString(TabView.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String contentBox = tabView.getContentBox();
		renderedAttributes.add(renderString(TabView.CONTENT_BOX, contentBox));
	}

	protected void renderDefaultChildType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object defaultChildType = tabView.getDefaultChildType();
		renderedAttributes.add(renderString(TabView.DEFAULT_CHILD_TYPE, defaultChildType));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean destroyed = tabView.getDestroyed();
		renderedAttributes.add(renderBoolean(TabView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean disabled = tabView.getDisabled();
		renderedAttributes.add(renderBoolean(TabView.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean focused = tabView.getFocused();
		renderedAttributes.add(renderBoolean(TabView.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object height = tabView.getHeight();
		renderedAttributes.add(renderString(TabView.HEIGHT, height));
	}

	protected void renderTabViewId(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabViewId = tabView.getTabViewId();
		renderedAttributes.add(renderString(TabView.TAB_VIEW_ID, tabViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean initialized = tabView.getInitialized();
		renderedAttributes.add(renderBoolean(TabView.INITIALIZED, initialized));
	}

	protected void renderTabViewLocale(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabViewLocale = tabView.getTabViewLocale();
		renderedAttributes.add(renderString(TabView.TAB_VIEW_LOCALE, tabViewLocale));
	}

	protected void renderMultiple(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean multiple = tabView.getMultiple();
		renderedAttributes.add(renderBoolean(TabView.MULTIPLE, multiple));
	}

	protected void renderRender(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object render = tabView.getRender();
		renderedAttributes.add(renderString(TabView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean rendered = tabView.getRendered();
		renderedAttributes.add(renderBoolean(TabView.RENDERED, rendered));
	}

	protected void renderSelection(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object selection = tabView.getSelection();
		renderedAttributes.add(renderString(TabView.SELECTION, selection));
	}

	protected void renderSrcNode(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String srcNode = tabView.getSrcNode();
		renderedAttributes.add(renderString(TabView.SRC_NODE, srcNode));
	}

	protected void renderStacked(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object stacked = tabView.getStacked();
		renderedAttributes.add(renderString(TabView.STACKED, stacked));
	}

	protected void renderStrings(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object strings = tabView.getStrings();
		renderedAttributes.add(renderObject(TabView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object tabIndex = tabView.getTabIndex();
		renderedAttributes.add(renderNumber(TabView.TAB_INDEX, tabIndex));
	}

	protected void renderType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object type = tabView.getType();
		renderedAttributes.add(renderString(TabView.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean visible = tabView.getVisible();
		renderedAttributes.add(renderBoolean(TabView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object width = tabView.getWidth();
		renderedAttributes.add(renderString(TabView.WIDTH, width));
	}

	protected void renderAfterActiveDescendantChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterActiveDescendantChange = tabView.getAfterActiveDescendantChange();
		renderedAttributes.add(renderString(TabView.AFTER_ACTIVE_DESCENDANT_CHANGE, afterActiveDescendantChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterBoundingBoxChange = tabView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TabView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterContentBoxChange = tabView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TabView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDefaultChildTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDefaultChildTypeChange = tabView.getAfterDefaultChildTypeChange();
		renderedAttributes.add(renderString(TabView.AFTER_DEFAULT_CHILD_TYPE_CHANGE, afterDefaultChildTypeChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDestroyedChange = tabView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TabView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDisabledChange = tabView.getAfterDisabledChange();
		renderedAttributes.add(renderString(TabView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterFocusedChange = tabView.getAfterFocusedChange();
		renderedAttributes.add(renderString(TabView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterHeightChange = tabView.getAfterHeightChange();
		renderedAttributes.add(renderString(TabView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterIdChange = tabView.getAfterIdChange();
		renderedAttributes.add(renderString(TabView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterInitializedChange = tabView.getAfterInitializedChange();
		renderedAttributes.add(renderString(TabView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterLocaleChange = tabView.getAfterLocaleChange();
		renderedAttributes.add(renderString(TabView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMultipleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterMultipleChange = tabView.getAfterMultipleChange();
		renderedAttributes.add(renderString(TabView.AFTER_MULTIPLE_CHANGE, afterMultipleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterRenderChange = tabView.getAfterRenderChange();
		renderedAttributes.add(renderString(TabView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterRenderedChange = tabView.getAfterRenderedChange();
		renderedAttributes.add(renderString(TabView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectionChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterSelectionChange = tabView.getAfterSelectionChange();
		renderedAttributes.add(renderString(TabView.AFTER_SELECTION_CHANGE, afterSelectionChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterSrcNodeChange = tabView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(TabView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStackedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterStackedChange = tabView.getAfterStackedChange();
		renderedAttributes.add(renderString(TabView.AFTER_STACKED_CHANGE, afterStackedChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterStringsChange = tabView.getAfterStringsChange();
		renderedAttributes.add(renderString(TabView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterTabIndexChange = tabView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TabView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterTypeChange = tabView.getAfterTypeChange();
		renderedAttributes.add(renderString(TabView.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterVisibleChange = tabView.getAfterVisibleChange();
		renderedAttributes.add(renderString(TabView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterWidthChange = tabView.getAfterWidthChange();
		renderedAttributes.add(renderString(TabView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnActiveDescendantChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onActiveDescendantChange = tabView.getOnActiveDescendantChange();
		renderedAttributes.add(renderString(TabView.ON_ACTIVE_DESCENDANT_CHANGE, onActiveDescendantChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onBoundingBoxChange = tabView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TabView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onContentBoxChange = tabView.getOnContentBoxChange();
		renderedAttributes.add(renderString(TabView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDefaultChildTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDefaultChildTypeChange = tabView.getOnDefaultChildTypeChange();
		renderedAttributes.add(renderString(TabView.ON_DEFAULT_CHILD_TYPE_CHANGE, onDefaultChildTypeChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDestroyedChange = tabView.getOnDestroyedChange();
		renderedAttributes.add(renderString(TabView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDisabledChange = tabView.getOnDisabledChange();
		renderedAttributes.add(renderString(TabView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onFocusedChange = tabView.getOnFocusedChange();
		renderedAttributes.add(renderString(TabView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onHeightChange = tabView.getOnHeightChange();
		renderedAttributes.add(renderString(TabView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onIdChange = tabView.getOnIdChange();
		renderedAttributes.add(renderString(TabView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onInitializedChange = tabView.getOnInitializedChange();
		renderedAttributes.add(renderString(TabView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onLocaleChange = tabView.getOnLocaleChange();
		renderedAttributes.add(renderString(TabView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMultipleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onMultipleChange = tabView.getOnMultipleChange();
		renderedAttributes.add(renderString(TabView.ON_MULTIPLE_CHANGE, onMultipleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onRenderChange = tabView.getOnRenderChange();
		renderedAttributes.add(renderString(TabView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onRenderedChange = tabView.getOnRenderedChange();
		renderedAttributes.add(renderString(TabView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectionChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onSelectionChange = tabView.getOnSelectionChange();
		renderedAttributes.add(renderString(TabView.ON_SELECTION_CHANGE, onSelectionChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onSrcNodeChange = tabView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(TabView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStackedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onStackedChange = tabView.getOnStackedChange();
		renderedAttributes.add(renderString(TabView.ON_STACKED_CHANGE, onStackedChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onStringsChange = tabView.getOnStringsChange();
		renderedAttributes.add(renderString(TabView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onTabIndexChange = tabView.getOnTabIndexChange();
		renderedAttributes.add(renderString(TabView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onTypeChange = tabView.getOnTypeChange();
		renderedAttributes.add(renderString(TabView.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onVisibleChange = tabView.getOnVisibleChange();
		renderedAttributes.add(renderString(TabView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onWidthChange = tabView.getOnWidthChange();
		renderedAttributes.add(renderString(TabView.ON_WIDTH_CHANGE, onWidthChange));
	}

}