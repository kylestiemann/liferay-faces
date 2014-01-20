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
package com.liferay.faces.alloy.component.autocompletelist;

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
public abstract class AutoCompleteListRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-list";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		AutoCompleteList autoCompleteList = (AutoCompleteList) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var autoCompleteList = new A.AutoCompleteList");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActivateFirstItem(renderedAttributes, autoCompleteList);
		renderActiveItem(renderedAttributes, autoCompleteList);
		renderAlign(renderedAttributes, autoCompleteList);
		renderAlignOn(renderedAttributes, autoCompleteList);
		renderAlwaysShowList(renderedAttributes, autoCompleteList);
		renderAutoCompleteListBodyContent(renderedAttributes, autoCompleteList);
		renderBoundingBox(renderedAttributes, autoCompleteList);
		renderCentered(renderedAttributes, autoCompleteList);
		renderCircular(renderedAttributes, autoCompleteList);
		renderConstrain(renderedAttributes, autoCompleteList);
		renderContentBox(renderedAttributes, autoCompleteList);
		renderDestroyed(renderedAttributes, autoCompleteList);
		renderDisabled(renderedAttributes, autoCompleteList);
		renderFillHeight(renderedAttributes, autoCompleteList);
		renderFocused(renderedAttributes, autoCompleteList);
		renderFooterContent(renderedAttributes, autoCompleteList);
		renderHeaderContent(renderedAttributes, autoCompleteList);
		renderHeight(renderedAttributes, autoCompleteList);
		renderHideOn(renderedAttributes, autoCompleteList);
		renderHost(renderedAttributes, autoCompleteList);
		renderHoveredItem(renderedAttributes, autoCompleteList);
		renderAutoCompleteListId(renderedAttributes, autoCompleteList);
		renderInitialized(renderedAttributes, autoCompleteList);
		renderListNode(renderedAttributes, autoCompleteList);
		renderLoadingMessage(renderedAttributes, autoCompleteList);
		renderAutoCompleteListLocale(renderedAttributes, autoCompleteList);
		renderPreventOverlap(renderedAttributes, autoCompleteList);
		renderRender(renderedAttributes, autoCompleteList);
		renderRendered(renderedAttributes, autoCompleteList);
		renderResults(renderedAttributes, autoCompleteList);
		renderScrollIntoView(renderedAttributes, autoCompleteList);
		renderSelectedEntry(renderedAttributes, autoCompleteList);
		renderShim(renderedAttributes, autoCompleteList);
		renderSrcNode(renderedAttributes, autoCompleteList);
		renderStrings(renderedAttributes, autoCompleteList);
		renderTabIndex(renderedAttributes, autoCompleteList);
		renderTabSelect(renderedAttributes, autoCompleteList);
		renderVisible(renderedAttributes, autoCompleteList);
		renderWidth(renderedAttributes, autoCompleteList);
		renderX(renderedAttributes, autoCompleteList);
		renderXy(renderedAttributes, autoCompleteList);
		renderY(renderedAttributes, autoCompleteList);
		renderZIndex(renderedAttributes, autoCompleteList);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActivateFirstItemChange(renderedAfterEvents, autoCompleteList);
		renderAfterActiveItemChange(renderedAfterEvents, autoCompleteList);
		renderAfterAlignChange(renderedAfterEvents, autoCompleteList);
		renderAfterAlignOnChange(renderedAfterEvents, autoCompleteList);
		renderAfterAlwaysShowListChange(renderedAfterEvents, autoCompleteList);
		renderAfterBodyContentChange(renderedAfterEvents, autoCompleteList);
		renderAfterBoundingBoxChange(renderedAfterEvents, autoCompleteList);
		renderAfterCenteredChange(renderedAfterEvents, autoCompleteList);
		renderAfterCircularChange(renderedAfterEvents, autoCompleteList);
		renderAfterConstrainChange(renderedAfterEvents, autoCompleteList);
		renderAfterContentBoxChange(renderedAfterEvents, autoCompleteList);
		renderAfterDestroyedChange(renderedAfterEvents, autoCompleteList);
		renderAfterDisabledChange(renderedAfterEvents, autoCompleteList);
		renderAfterFillHeightChange(renderedAfterEvents, autoCompleteList);
		renderAfterFocusedChange(renderedAfterEvents, autoCompleteList);
		renderAfterFooterContentChange(renderedAfterEvents, autoCompleteList);
		renderAfterHeaderContentChange(renderedAfterEvents, autoCompleteList);
		renderAfterHeightChange(renderedAfterEvents, autoCompleteList);
		renderAfterHideOnChange(renderedAfterEvents, autoCompleteList);
		renderAfterHostChange(renderedAfterEvents, autoCompleteList);
		renderAfterHoveredItemChange(renderedAfterEvents, autoCompleteList);
		renderAfterIdChange(renderedAfterEvents, autoCompleteList);
		renderAfterInitializedChange(renderedAfterEvents, autoCompleteList);
		renderAfterListNodeChange(renderedAfterEvents, autoCompleteList);
		renderAfterLoadingMessageChange(renderedAfterEvents, autoCompleteList);
		renderAfterLocaleChange(renderedAfterEvents, autoCompleteList);
		renderAfterPreventOverlapChange(renderedAfterEvents, autoCompleteList);
		renderAfterRenderChange(renderedAfterEvents, autoCompleteList);
		renderAfterRenderedChange(renderedAfterEvents, autoCompleteList);
		renderAfterResultsChange(renderedAfterEvents, autoCompleteList);
		renderAfterScrollIntoViewChange(renderedAfterEvents, autoCompleteList);
		renderAfterSelectedEntryChange(renderedAfterEvents, autoCompleteList);
		renderAfterShimChange(renderedAfterEvents, autoCompleteList);
		renderAfterSrcNodeChange(renderedAfterEvents, autoCompleteList);
		renderAfterStringsChange(renderedAfterEvents, autoCompleteList);
		renderAfterTabIndexChange(renderedAfterEvents, autoCompleteList);
		renderAfterTabSelectChange(renderedAfterEvents, autoCompleteList);
		renderAfterVisibleChange(renderedAfterEvents, autoCompleteList);
		renderAfterWidthChange(renderedAfterEvents, autoCompleteList);
		renderAfterXChange(renderedAfterEvents, autoCompleteList);
		renderAfterXyChange(renderedAfterEvents, autoCompleteList);
		renderAfterYChange(renderedAfterEvents, autoCompleteList);
		renderAfterZIndexChange(renderedAfterEvents, autoCompleteList);

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

		renderOnActivateFirstItemChange(renderedOnEvents, autoCompleteList);
		renderOnActiveItemChange(renderedOnEvents, autoCompleteList);
		renderOnAlignChange(renderedOnEvents, autoCompleteList);
		renderOnAlignOnChange(renderedOnEvents, autoCompleteList);
		renderOnAlwaysShowListChange(renderedOnEvents, autoCompleteList);
		renderOnBodyContentChange(renderedOnEvents, autoCompleteList);
		renderOnBoundingBoxChange(renderedOnEvents, autoCompleteList);
		renderOnCenteredChange(renderedOnEvents, autoCompleteList);
		renderOnCircularChange(renderedOnEvents, autoCompleteList);
		renderOnConstrainChange(renderedOnEvents, autoCompleteList);
		renderOnContentBoxChange(renderedOnEvents, autoCompleteList);
		renderOnDestroyedChange(renderedOnEvents, autoCompleteList);
		renderOnDisabledChange(renderedOnEvents, autoCompleteList);
		renderOnFillHeightChange(renderedOnEvents, autoCompleteList);
		renderOnFocusedChange(renderedOnEvents, autoCompleteList);
		renderOnFooterContentChange(renderedOnEvents, autoCompleteList);
		renderOnHeaderContentChange(renderedOnEvents, autoCompleteList);
		renderOnHeightChange(renderedOnEvents, autoCompleteList);
		renderOnHideOnChange(renderedOnEvents, autoCompleteList);
		renderOnHostChange(renderedOnEvents, autoCompleteList);
		renderOnHoveredItemChange(renderedOnEvents, autoCompleteList);
		renderOnIdChange(renderedOnEvents, autoCompleteList);
		renderOnInitializedChange(renderedOnEvents, autoCompleteList);
		renderOnListNodeChange(renderedOnEvents, autoCompleteList);
		renderOnLoadingMessageChange(renderedOnEvents, autoCompleteList);
		renderOnLocaleChange(renderedOnEvents, autoCompleteList);
		renderOnPreventOverlapChange(renderedOnEvents, autoCompleteList);
		renderOnRenderChange(renderedOnEvents, autoCompleteList);
		renderOnRenderedChange(renderedOnEvents, autoCompleteList);
		renderOnResultsChange(renderedOnEvents, autoCompleteList);
		renderOnScrollIntoViewChange(renderedOnEvents, autoCompleteList);
		renderOnSelectedEntryChange(renderedOnEvents, autoCompleteList);
		renderOnShimChange(renderedOnEvents, autoCompleteList);
		renderOnSrcNodeChange(renderedOnEvents, autoCompleteList);
		renderOnStringsChange(renderedOnEvents, autoCompleteList);
		renderOnTabIndexChange(renderedOnEvents, autoCompleteList);
		renderOnTabSelectChange(renderedOnEvents, autoCompleteList);
		renderOnVisibleChange(renderedOnEvents, autoCompleteList);
		renderOnWidthChange(renderedOnEvents, autoCompleteList);
		renderOnXChange(renderedOnEvents, autoCompleteList);
		renderOnXyChange(renderedOnEvents, autoCompleteList);
		renderOnYChange(renderedOnEvents, autoCompleteList);
		renderOnZIndexChange(renderedOnEvents, autoCompleteList);

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

	protected void renderActivateFirstItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean activateFirstItem = autoCompleteList.getActivateFirstItem();

		if (activateFirstItem != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.ACTIVATE_FIRST_ITEM, activateFirstItem));
		}
	}

	protected void renderActiveItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object activeItem = autoCompleteList.getActiveItem();

		if (activeItem != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ACTIVE_ITEM, activeItem));
		}
	}

	protected void renderAlign(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object align = autoCompleteList.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(AutoCompleteList.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object alignOn = autoCompleteList.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(AutoCompleteList.ALIGN_ON, alignOn));
		}
	}

	protected void renderAlwaysShowList(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean alwaysShowList = autoCompleteList.getAlwaysShowList();

		if (alwaysShowList != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.ALWAYS_SHOW_LIST, alwaysShowList));
		}
	}

	protected void renderAutoCompleteListBodyContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object autoCompleteListBodyContent = autoCompleteList.getAutoCompleteListBodyContent();

		if (autoCompleteListBodyContent != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_BODY_CONTENT, autoCompleteListBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String boundingBox = autoCompleteList.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(AutoCompleteList.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object centered = autoCompleteList.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(AutoCompleteList.CENTERED, centered));
		}
	}

	protected void renderCircular(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean circular = autoCompleteList.getCircular();

		if (circular != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.CIRCULAR, circular));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object constrain = autoCompleteList.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(AutoCompleteList.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String contentBox = autoCompleteList.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(AutoCompleteList.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean destroyed = autoCompleteList.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean disabled = autoCompleteList.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object fillHeight = autoCompleteList.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(AutoCompleteList.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean focused = autoCompleteList.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object footerContent = autoCompleteList.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(AutoCompleteList.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object headerContent = autoCompleteList.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(AutoCompleteList.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object height = autoCompleteList.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(AutoCompleteList.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object hideOn = autoCompleteList.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(AutoCompleteList.HIDE_ON, hideOn));
		}
	}

	protected void renderHost(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object host = autoCompleteList.getHost();

		if (host != null) {
			renderedAttributes.add(renderObject(AutoCompleteList.HOST, host));
		}
	}

	protected void renderHoveredItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object hoveredItem = autoCompleteList.getHoveredItem();

		if (hoveredItem != null) {
			renderedAttributes.add(renderString(AutoCompleteList.HOVERED_ITEM, hoveredItem));
		}
	}

	protected void renderAutoCompleteListId(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String autoCompleteListId = autoCompleteList.getAutoCompleteListId();

		if (autoCompleteListId != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_ID, autoCompleteListId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean initialized = autoCompleteList.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.INITIALIZED, initialized));
		}
	}

	protected void renderListNode(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object listNode = autoCompleteList.getListNode();

		if (listNode != null) {
			renderedAttributes.add(renderString(AutoCompleteList.LIST_NODE, listNode));
		}
	}

	protected void renderLoadingMessage(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String loadingMessage = autoCompleteList.getLoadingMessage();

		if (loadingMessage != null) {
			renderedAttributes.add(renderString(AutoCompleteList.LOADING_MESSAGE, loadingMessage));
		}
	}

	protected void renderAutoCompleteListLocale(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String autoCompleteListLocale = autoCompleteList.getAutoCompleteListLocale();

		if (autoCompleteListLocale != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_LOCALE, autoCompleteListLocale));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean preventOverlap = autoCompleteList.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object render = autoCompleteList.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(AutoCompleteList.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean rendered = autoCompleteList.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.RENDERED, rendered));
		}
	}

	protected void renderResults(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object results = autoCompleteList.getResults();

		if (results != null) {
			renderedAttributes.add(renderArray(AutoCompleteList.RESULTS, results));
		}
	}

	protected void renderScrollIntoView(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean scrollIntoView = autoCompleteList.getScrollIntoView();

		if (scrollIntoView != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.SCROLL_INTO_VIEW, scrollIntoView));
		}
	}

	protected void renderSelectedEntry(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String selectedEntry = autoCompleteList.getSelectedEntry();

		if (selectedEntry != null) {
			renderedAttributes.add(renderString(AutoCompleteList.SELECTED_ENTRY, selectedEntry));
		}
	}

	protected void renderShim(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean shim = autoCompleteList.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String srcNode = autoCompleteList.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(AutoCompleteList.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object strings = autoCompleteList.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(AutoCompleteList.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object tabIndex = autoCompleteList.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(AutoCompleteList.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTabSelect(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean tabSelect = autoCompleteList.getTabSelect();

		if (tabSelect != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.TAB_SELECT, tabSelect));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean visible = autoCompleteList.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(AutoCompleteList.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object width = autoCompleteList.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(AutoCompleteList.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object x = autoCompleteList.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(AutoCompleteList.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object xy = autoCompleteList.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(AutoCompleteList.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object y = autoCompleteList.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(AutoCompleteList.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object zIndex = autoCompleteList.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(AutoCompleteList.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterActivateFirstItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterActivateFirstItemChange = autoCompleteList.getAfterActivateFirstItemChange();

		if (afterActivateFirstItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ACTIVATE_FIRST_ITEM_CHANGE, afterActivateFirstItemChange));
		}
	}

	protected void renderAfterActiveItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterActiveItemChange = autoCompleteList.getAfterActiveItemChange();

		if (afterActiveItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ACTIVE_ITEM_CHANGE, afterActiveItemChange));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlignChange = autoCompleteList.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlignOnChange = autoCompleteList.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterAlwaysShowListChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlwaysShowListChange = autoCompleteList.getAfterAlwaysShowListChange();

		if (afterAlwaysShowListChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALWAYS_SHOW_LIST_CHANGE, afterAlwaysShowListChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterBodyContentChange = autoCompleteList.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterBoundingBoxChange = autoCompleteList.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterCenteredChange = autoCompleteList.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterCircularChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterCircularChange = autoCompleteList.getAfterCircularChange();

		if (afterCircularChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_CIRCULAR_CHANGE, afterCircularChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterConstrainChange = autoCompleteList.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterContentBoxChange = autoCompleteList.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterDestroyedChange = autoCompleteList.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterDisabledChange = autoCompleteList.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFillHeightChange = autoCompleteList.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFocusedChange = autoCompleteList.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFooterContentChange = autoCompleteList.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHeaderContentChange = autoCompleteList.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHeightChange = autoCompleteList.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHideOnChange = autoCompleteList.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHostChange = autoCompleteList.getAfterHostChange();

		if (afterHostChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_HOST_CHANGE, afterHostChange));
		}
	}

	protected void renderAfterHoveredItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHoveredItemChange = autoCompleteList.getAfterHoveredItemChange();

		if (afterHoveredItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_HOVERED_ITEM_CHANGE, afterHoveredItemChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterIdChange = autoCompleteList.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterInitializedChange = autoCompleteList.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterListNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterListNodeChange = autoCompleteList.getAfterListNodeChange();

		if (afterListNodeChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_LIST_NODE_CHANGE, afterListNodeChange));
		}
	}

	protected void renderAfterLoadingMessageChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterLoadingMessageChange = autoCompleteList.getAfterLoadingMessageChange();

		if (afterLoadingMessageChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_LOADING_MESSAGE_CHANGE, afterLoadingMessageChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterLocaleChange = autoCompleteList.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterPreventOverlapChange = autoCompleteList.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterRenderChange = autoCompleteList.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterRenderedChange = autoCompleteList.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResultsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterResultsChange = autoCompleteList.getAfterResultsChange();

		if (afterResultsChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_RESULTS_CHANGE, afterResultsChange));
		}
	}

	protected void renderAfterScrollIntoViewChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterScrollIntoViewChange = autoCompleteList.getAfterScrollIntoViewChange();

		if (afterScrollIntoViewChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_SCROLL_INTO_VIEW_CHANGE, afterScrollIntoViewChange));
		}
	}

	protected void renderAfterSelectedEntryChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterSelectedEntryChange = autoCompleteList.getAfterSelectedEntryChange();

		if (afterSelectedEntryChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_SELECTED_ENTRY_CHANGE, afterSelectedEntryChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterShimChange = autoCompleteList.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterSrcNodeChange = autoCompleteList.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterStringsChange = autoCompleteList.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterTabIndexChange = autoCompleteList.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTabSelectChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterTabSelectChange = autoCompleteList.getAfterTabSelectChange();

		if (afterTabSelectChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_TAB_SELECT_CHANGE, afterTabSelectChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterVisibleChange = autoCompleteList.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterWidthChange = autoCompleteList.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterXChange = autoCompleteList.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterXyChange = autoCompleteList.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterYChange = autoCompleteList.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterZIndexChange = autoCompleteList.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnActivateFirstItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onActivateFirstItemChange = autoCompleteList.getOnActivateFirstItemChange();

		if (onActivateFirstItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ACTIVATE_FIRST_ITEM_CHANGE, onActivateFirstItemChange));
		}
	}

	protected void renderOnActiveItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onActiveItemChange = autoCompleteList.getOnActiveItemChange();

		if (onActiveItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ACTIVE_ITEM_CHANGE, onActiveItemChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlignChange = autoCompleteList.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlignOnChange = autoCompleteList.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnAlwaysShowListChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlwaysShowListChange = autoCompleteList.getOnAlwaysShowListChange();

		if (onAlwaysShowListChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ALWAYS_SHOW_LIST_CHANGE, onAlwaysShowListChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onBodyContentChange = autoCompleteList.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onBoundingBoxChange = autoCompleteList.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onCenteredChange = autoCompleteList.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnCircularChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onCircularChange = autoCompleteList.getOnCircularChange();

		if (onCircularChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_CIRCULAR_CHANGE, onCircularChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onConstrainChange = autoCompleteList.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onContentBoxChange = autoCompleteList.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onDestroyedChange = autoCompleteList.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onDisabledChange = autoCompleteList.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFillHeightChange = autoCompleteList.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFocusedChange = autoCompleteList.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFooterContentChange = autoCompleteList.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHeaderContentChange = autoCompleteList.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHeightChange = autoCompleteList.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHideOnChange = autoCompleteList.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnHostChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHostChange = autoCompleteList.getOnHostChange();

		if (onHostChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_HOST_CHANGE, onHostChange));
		}
	}

	protected void renderOnHoveredItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHoveredItemChange = autoCompleteList.getOnHoveredItemChange();

		if (onHoveredItemChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_HOVERED_ITEM_CHANGE, onHoveredItemChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onIdChange = autoCompleteList.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onInitializedChange = autoCompleteList.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnListNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onListNodeChange = autoCompleteList.getOnListNodeChange();

		if (onListNodeChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_LIST_NODE_CHANGE, onListNodeChange));
		}
	}

	protected void renderOnLoadingMessageChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onLoadingMessageChange = autoCompleteList.getOnLoadingMessageChange();

		if (onLoadingMessageChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_LOADING_MESSAGE_CHANGE, onLoadingMessageChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onLocaleChange = autoCompleteList.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onPreventOverlapChange = autoCompleteList.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onRenderChange = autoCompleteList.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onRenderedChange = autoCompleteList.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResultsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onResultsChange = autoCompleteList.getOnResultsChange();

		if (onResultsChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_RESULTS_CHANGE, onResultsChange));
		}
	}

	protected void renderOnScrollIntoViewChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onScrollIntoViewChange = autoCompleteList.getOnScrollIntoViewChange();

		if (onScrollIntoViewChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_SCROLL_INTO_VIEW_CHANGE, onScrollIntoViewChange));
		}
	}

	protected void renderOnSelectedEntryChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onSelectedEntryChange = autoCompleteList.getOnSelectedEntryChange();

		if (onSelectedEntryChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_SELECTED_ENTRY_CHANGE, onSelectedEntryChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onShimChange = autoCompleteList.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onSrcNodeChange = autoCompleteList.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onStringsChange = autoCompleteList.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onTabIndexChange = autoCompleteList.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTabSelectChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onTabSelectChange = autoCompleteList.getOnTabSelectChange();

		if (onTabSelectChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_TAB_SELECT_CHANGE, onTabSelectChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onVisibleChange = autoCompleteList.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onWidthChange = autoCompleteList.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onXChange = autoCompleteList.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onXyChange = autoCompleteList.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onYChange = autoCompleteList.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onZIndexChange = autoCompleteList.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(AutoCompleteList.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}