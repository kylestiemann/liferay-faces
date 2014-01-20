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

		renderActiveDescendant(renderedAttributes, tabView);
		renderBoundingBox(renderedAttributes, tabView);
		renderContentBox(renderedAttributes, tabView);
		renderDefaultChildType(renderedAttributes, tabView);
		renderDestroyed(renderedAttributes, tabView);
		renderDisabled(renderedAttributes, tabView);
		renderFocused(renderedAttributes, tabView);
		renderHeight(renderedAttributes, tabView);
		renderTabViewId(renderedAttributes, tabView);
		renderInitialized(renderedAttributes, tabView);
		renderTabViewLocale(renderedAttributes, tabView);
		renderMultiple(renderedAttributes, tabView);
		renderRender(renderedAttributes, tabView);
		renderRendered(renderedAttributes, tabView);
		renderSelection(renderedAttributes, tabView);
		renderSrcNode(renderedAttributes, tabView);
		renderStacked(renderedAttributes, tabView);
		renderStrings(renderedAttributes, tabView);
		renderTabIndex(renderedAttributes, tabView);
		renderType(renderedAttributes, tabView);
		renderVisible(renderedAttributes, tabView);
		renderWidth(renderedAttributes, tabView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveDescendantChange(renderedAfterEvents, tabView);
		renderAfterBoundingBoxChange(renderedAfterEvents, tabView);
		renderAfterContentBoxChange(renderedAfterEvents, tabView);
		renderAfterDefaultChildTypeChange(renderedAfterEvents, tabView);
		renderAfterDestroyedChange(renderedAfterEvents, tabView);
		renderAfterDisabledChange(renderedAfterEvents, tabView);
		renderAfterFocusedChange(renderedAfterEvents, tabView);
		renderAfterHeightChange(renderedAfterEvents, tabView);
		renderAfterIdChange(renderedAfterEvents, tabView);
		renderAfterInitializedChange(renderedAfterEvents, tabView);
		renderAfterLocaleChange(renderedAfterEvents, tabView);
		renderAfterMultipleChange(renderedAfterEvents, tabView);
		renderAfterRenderChange(renderedAfterEvents, tabView);
		renderAfterRenderedChange(renderedAfterEvents, tabView);
		renderAfterSelectionChange(renderedAfterEvents, tabView);
		renderAfterSrcNodeChange(renderedAfterEvents, tabView);
		renderAfterStackedChange(renderedAfterEvents, tabView);
		renderAfterStringsChange(renderedAfterEvents, tabView);
		renderAfterTabIndexChange(renderedAfterEvents, tabView);
		renderAfterTypeChange(renderedAfterEvents, tabView);
		renderAfterVisibleChange(renderedAfterEvents, tabView);
		renderAfterWidthChange(renderedAfterEvents, tabView);

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

		renderOnActiveDescendantChange(renderedOnEvents, tabView);
		renderOnBoundingBoxChange(renderedOnEvents, tabView);
		renderOnContentBoxChange(renderedOnEvents, tabView);
		renderOnDefaultChildTypeChange(renderedOnEvents, tabView);
		renderOnDestroyedChange(renderedOnEvents, tabView);
		renderOnDisabledChange(renderedOnEvents, tabView);
		renderOnFocusedChange(renderedOnEvents, tabView);
		renderOnHeightChange(renderedOnEvents, tabView);
		renderOnIdChange(renderedOnEvents, tabView);
		renderOnInitializedChange(renderedOnEvents, tabView);
		renderOnLocaleChange(renderedOnEvents, tabView);
		renderOnMultipleChange(renderedOnEvents, tabView);
		renderOnRenderChange(renderedOnEvents, tabView);
		renderOnRenderedChange(renderedOnEvents, tabView);
		renderOnSelectionChange(renderedOnEvents, tabView);
		renderOnSrcNodeChange(renderedOnEvents, tabView);
		renderOnStackedChange(renderedOnEvents, tabView);
		renderOnStringsChange(renderedOnEvents, tabView);
		renderOnTabIndexChange(renderedOnEvents, tabView);
		renderOnTypeChange(renderedOnEvents, tabView);
		renderOnVisibleChange(renderedOnEvents, tabView);
		renderOnWidthChange(renderedOnEvents, tabView);

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

		if (activeDescendant != null) {
			renderedAttributes.add(renderString(TabView.ACTIVE_DESCENDANT, activeDescendant));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String boundingBox = tabView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TabView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String contentBox = tabView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TabView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDefaultChildType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object defaultChildType = tabView.getDefaultChildType();

		if (defaultChildType != null) {
			renderedAttributes.add(renderString(TabView.DEFAULT_CHILD_TYPE, defaultChildType));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean destroyed = tabView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TabView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean disabled = tabView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(TabView.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean focused = tabView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(TabView.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object height = tabView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(TabView.HEIGHT, height));
		}
	}

	protected void renderTabViewId(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabViewId = tabView.getTabViewId();

		if (tabViewId != null) {
			renderedAttributes.add(renderString(TabView.TAB_VIEW_ID, tabViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean initialized = tabView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TabView.INITIALIZED, initialized));
		}
	}

	protected void renderTabViewLocale(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String tabViewLocale = tabView.getTabViewLocale();

		if (tabViewLocale != null) {
			renderedAttributes.add(renderString(TabView.TAB_VIEW_LOCALE, tabViewLocale));
		}
	}

	protected void renderMultiple(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean multiple = tabView.getMultiple();

		if (multiple != null) {
			renderedAttributes.add(renderBoolean(TabView.MULTIPLE, multiple));
		}
	}

	protected void renderRender(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object render = tabView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(TabView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean rendered = tabView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TabView.RENDERED, rendered));
		}
	}

	protected void renderSelection(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object selection = tabView.getSelection();

		if (selection != null) {
			renderedAttributes.add(renderString(TabView.SELECTION, selection));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String srcNode = tabView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(TabView.SRC_NODE, srcNode));
		}
	}

	protected void renderStacked(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object stacked = tabView.getStacked();

		if (stacked != null) {
			renderedAttributes.add(renderString(TabView.STACKED, stacked));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object strings = tabView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(TabView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object tabIndex = tabView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(TabView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderType(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object type = tabView.getType();

		if (type != null) {
			renderedAttributes.add(renderString(TabView.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Boolean visible = tabView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(TabView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.Object width = tabView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(TabView.WIDTH, width));
		}
	}

	protected void renderAfterActiveDescendantChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterActiveDescendantChange = tabView.getAfterActiveDescendantChange();

		if (afterActiveDescendantChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_ACTIVE_DESCENDANT_CHANGE, afterActiveDescendantChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterBoundingBoxChange = tabView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterContentBoxChange = tabView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDefaultChildTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDefaultChildTypeChange = tabView.getAfterDefaultChildTypeChange();

		if (afterDefaultChildTypeChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_DEFAULT_CHILD_TYPE_CHANGE, afterDefaultChildTypeChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDestroyedChange = tabView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterDisabledChange = tabView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterFocusedChange = tabView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterHeightChange = tabView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterIdChange = tabView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterInitializedChange = tabView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterLocaleChange = tabView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMultipleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterMultipleChange = tabView.getAfterMultipleChange();

		if (afterMultipleChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_MULTIPLE_CHANGE, afterMultipleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterRenderChange = tabView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterRenderedChange = tabView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectionChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterSelectionChange = tabView.getAfterSelectionChange();

		if (afterSelectionChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_SELECTION_CHANGE, afterSelectionChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterSrcNodeChange = tabView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStackedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterStackedChange = tabView.getAfterStackedChange();

		if (afterStackedChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_STACKED_CHANGE, afterStackedChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterStringsChange = tabView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterTabIndexChange = tabView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterTypeChange = tabView.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterVisibleChange = tabView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String afterWidthChange = tabView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(TabView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnActiveDescendantChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onActiveDescendantChange = tabView.getOnActiveDescendantChange();

		if (onActiveDescendantChange != null) {
			renderedAttributes.add(renderString(TabView.ON_ACTIVE_DESCENDANT_CHANGE, onActiveDescendantChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onBoundingBoxChange = tabView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TabView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onContentBoxChange = tabView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TabView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDefaultChildTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDefaultChildTypeChange = tabView.getOnDefaultChildTypeChange();

		if (onDefaultChildTypeChange != null) {
			renderedAttributes.add(renderString(TabView.ON_DEFAULT_CHILD_TYPE_CHANGE, onDefaultChildTypeChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDestroyedChange = tabView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TabView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onDisabledChange = tabView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(TabView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onFocusedChange = tabView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(TabView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onHeightChange = tabView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(TabView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onIdChange = tabView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TabView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onInitializedChange = tabView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TabView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onLocaleChange = tabView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(TabView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMultipleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onMultipleChange = tabView.getOnMultipleChange();

		if (onMultipleChange != null) {
			renderedAttributes.add(renderString(TabView.ON_MULTIPLE_CHANGE, onMultipleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onRenderChange = tabView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(TabView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onRenderedChange = tabView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TabView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectionChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onSelectionChange = tabView.getOnSelectionChange();

		if (onSelectionChange != null) {
			renderedAttributes.add(renderString(TabView.ON_SELECTION_CHANGE, onSelectionChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onSrcNodeChange = tabView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(TabView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStackedChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onStackedChange = tabView.getOnStackedChange();

		if (onStackedChange != null) {
			renderedAttributes.add(renderString(TabView.ON_STACKED_CHANGE, onStackedChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onStringsChange = tabView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(TabView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onTabIndexChange = tabView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TabView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onTypeChange = tabView.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(TabView.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onVisibleChange = tabView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(TabView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, TabView tabView) throws IOException {
		java.lang.String onWidthChange = tabView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(TabView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}