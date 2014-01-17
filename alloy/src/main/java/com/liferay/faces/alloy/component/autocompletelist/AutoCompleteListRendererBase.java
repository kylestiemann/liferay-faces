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

}