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

		if (autoCompleteList.getActivateFirstItem() != null) {
			renderActivateFirstItem(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getActiveItem() != null) {
			renderActiveItem(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAlign() != null) {
			renderAlign(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAlwaysShowList() != null) {
			renderAlwaysShowList(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAutoCompleteListBodyContent() != null) {
			renderAutoCompleteListBodyContent(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getCentered() != null) {
			renderCentered(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getCircular() != null) {
			renderCircular(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getConstrain() != null) {
			renderConstrain(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getContentBox() != null) {
			renderContentBox(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getDisabled() != null) {
			renderDisabled(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getFocused() != null) {
			renderFocused(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getHeight() != null) {
			renderHeight(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getHideOn() != null) {
			renderHideOn(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getHost() != null) {
			renderHost(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getHoveredItem() != null) {
			renderHoveredItem(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAutoCompleteListId() != null) {
			renderAutoCompleteListId(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getInitialized() != null) {
			renderInitialized(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getListNode() != null) {
			renderListNode(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getLoadingMessage() != null) {
			renderLoadingMessage(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getAutoCompleteListLocale() != null) {
			renderAutoCompleteListLocale(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getRender() != null) {
			renderRender(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getRendered() != null) {
			renderRendered(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getResults() != null) {
			renderResults(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getScrollIntoView() != null) {
			renderScrollIntoView(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getSelectedEntry() != null) {
			renderSelectedEntry(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getShim() != null) {
			renderShim(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getStrings() != null) {
			renderStrings(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getTabSelect() != null) {
			renderTabSelect(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getVisible() != null) {
			renderVisible(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getWidth() != null) {
			renderWidth(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getX() != null) {
			renderX(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getXy() != null) {
			renderXy(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getY() != null) {
			renderY(renderedAttributes, autoCompleteList);
		}
		
		if (autoCompleteList.getZIndex() != null) {
			renderZIndex(renderedAttributes, autoCompleteList);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (autoCompleteList.getAfterActivateFirstItemChange() != null) {
			renderAfterActivateFirstItemChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterActiveItemChange() != null) {
			renderAfterActiveItemChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterAlwaysShowListChange() != null) {
			renderAfterAlwaysShowListChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterCircularChange() != null) {
			renderAfterCircularChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterHoveredItemChange() != null) {
			renderAfterHoveredItemChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterListNodeChange() != null) {
			renderAfterListNodeChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterLoadingMessageChange() != null) {
			renderAfterLoadingMessageChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterResultsChange() != null) {
			renderAfterResultsChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterScrollIntoViewChange() != null) {
			renderAfterScrollIntoViewChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterSelectedEntryChange() != null) {
			renderAfterSelectedEntryChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterTabSelectChange() != null) {
			renderAfterTabSelectChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, autoCompleteList);
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

		if (autoCompleteList.getOnActivateFirstItemChange() != null) {
			renderOnActivateFirstItemChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnActiveItemChange() != null) {
			renderOnActiveItemChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnAlwaysShowListChange() != null) {
			renderOnAlwaysShowListChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnCircularChange() != null) {
			renderOnCircularChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnHoveredItemChange() != null) {
			renderOnHoveredItemChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnListNodeChange() != null) {
			renderOnListNodeChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnLoadingMessageChange() != null) {
			renderOnLoadingMessageChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnResultsChange() != null) {
			renderOnResultsChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnScrollIntoViewChange() != null) {
			renderOnScrollIntoViewChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnSelectedEntryChange() != null) {
			renderOnSelectedEntryChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnTabSelectChange() != null) {
			renderOnTabSelectChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, autoCompleteList);
		}
		
		if (autoCompleteList.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, autoCompleteList);
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

	protected void renderActivateFirstItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean activateFirstItem = autoCompleteList.getActivateFirstItem();
		renderedAttributes.add(renderBoolean(AutoCompleteList.ACTIVATE_FIRST_ITEM, activateFirstItem));
	}

	protected void renderActiveItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object activeItem = autoCompleteList.getActiveItem();
		renderedAttributes.add(renderString(AutoCompleteList.ACTIVE_ITEM, activeItem));
	}

	protected void renderAlign(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object align = autoCompleteList.getAlign();
		renderedAttributes.add(renderObject(AutoCompleteList.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object alignOn = autoCompleteList.getAlignOn();
		renderedAttributes.add(renderArray(AutoCompleteList.ALIGN_ON, alignOn));
	}

	protected void renderAlwaysShowList(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean alwaysShowList = autoCompleteList.getAlwaysShowList();
		renderedAttributes.add(renderBoolean(AutoCompleteList.ALWAYS_SHOW_LIST, alwaysShowList));
	}

	protected void renderAutoCompleteListBodyContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object autoCompleteListBodyContent = autoCompleteList.getAutoCompleteListBodyContent();
		renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_BODY_CONTENT, autoCompleteListBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String boundingBox = autoCompleteList.getBoundingBox();
		renderedAttributes.add(renderString(AutoCompleteList.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object centered = autoCompleteList.getCentered();
		renderedAttributes.add(renderString(AutoCompleteList.CENTERED, centered));
	}

	protected void renderCircular(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean circular = autoCompleteList.getCircular();
		renderedAttributes.add(renderBoolean(AutoCompleteList.CIRCULAR, circular));
	}

	protected void renderConstrain(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object constrain = autoCompleteList.getConstrain();
		renderedAttributes.add(renderString(AutoCompleteList.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String contentBox = autoCompleteList.getContentBox();
		renderedAttributes.add(renderString(AutoCompleteList.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean destroyed = autoCompleteList.getDestroyed();
		renderedAttributes.add(renderBoolean(AutoCompleteList.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean disabled = autoCompleteList.getDisabled();
		renderedAttributes.add(renderBoolean(AutoCompleteList.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object fillHeight = autoCompleteList.getFillHeight();
		renderedAttributes.add(renderString(AutoCompleteList.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean focused = autoCompleteList.getFocused();
		renderedAttributes.add(renderBoolean(AutoCompleteList.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object footerContent = autoCompleteList.getFooterContent();
		renderedAttributes.add(renderString(AutoCompleteList.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object headerContent = autoCompleteList.getHeaderContent();
		renderedAttributes.add(renderString(AutoCompleteList.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object height = autoCompleteList.getHeight();
		renderedAttributes.add(renderString(AutoCompleteList.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object hideOn = autoCompleteList.getHideOn();
		renderedAttributes.add(renderArray(AutoCompleteList.HIDE_ON, hideOn));
	}

	protected void renderHost(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object host = autoCompleteList.getHost();
		renderedAttributes.add(renderObject(AutoCompleteList.HOST, host));
	}

	protected void renderHoveredItem(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object hoveredItem = autoCompleteList.getHoveredItem();
		renderedAttributes.add(renderString(AutoCompleteList.HOVERED_ITEM, hoveredItem));
	}

	protected void renderAutoCompleteListId(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String autoCompleteListId = autoCompleteList.getAutoCompleteListId();
		renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_ID, autoCompleteListId));
	}

	protected void renderInitialized(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean initialized = autoCompleteList.getInitialized();
		renderedAttributes.add(renderBoolean(AutoCompleteList.INITIALIZED, initialized));
	}

	protected void renderListNode(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object listNode = autoCompleteList.getListNode();
		renderedAttributes.add(renderString(AutoCompleteList.LIST_NODE, listNode));
	}

	protected void renderLoadingMessage(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String loadingMessage = autoCompleteList.getLoadingMessage();
		renderedAttributes.add(renderString(AutoCompleteList.LOADING_MESSAGE, loadingMessage));
	}

	protected void renderAutoCompleteListLocale(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String autoCompleteListLocale = autoCompleteList.getAutoCompleteListLocale();
		renderedAttributes.add(renderString(AutoCompleteList.AUTO_COMPLETE_LIST_LOCALE, autoCompleteListLocale));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean preventOverlap = autoCompleteList.getPreventOverlap();
		renderedAttributes.add(renderBoolean(AutoCompleteList.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object render = autoCompleteList.getRender();
		renderedAttributes.add(renderString(AutoCompleteList.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean rendered = autoCompleteList.getRendered();
		renderedAttributes.add(renderBoolean(AutoCompleteList.RENDERED, rendered));
	}

	protected void renderResults(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object results = autoCompleteList.getResults();
		renderedAttributes.add(renderArray(AutoCompleteList.RESULTS, results));
	}

	protected void renderScrollIntoView(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean scrollIntoView = autoCompleteList.getScrollIntoView();
		renderedAttributes.add(renderBoolean(AutoCompleteList.SCROLL_INTO_VIEW, scrollIntoView));
	}

	protected void renderSelectedEntry(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String selectedEntry = autoCompleteList.getSelectedEntry();
		renderedAttributes.add(renderString(AutoCompleteList.SELECTED_ENTRY, selectedEntry));
	}

	protected void renderShim(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean shim = autoCompleteList.getShim();
		renderedAttributes.add(renderBoolean(AutoCompleteList.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String srcNode = autoCompleteList.getSrcNode();
		renderedAttributes.add(renderString(AutoCompleteList.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object strings = autoCompleteList.getStrings();
		renderedAttributes.add(renderObject(AutoCompleteList.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object tabIndex = autoCompleteList.getTabIndex();
		renderedAttributes.add(renderNumber(AutoCompleteList.TAB_INDEX, tabIndex));
	}

	protected void renderTabSelect(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean tabSelect = autoCompleteList.getTabSelect();
		renderedAttributes.add(renderBoolean(AutoCompleteList.TAB_SELECT, tabSelect));
	}

	protected void renderVisible(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Boolean visible = autoCompleteList.getVisible();
		renderedAttributes.add(renderBoolean(AutoCompleteList.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object width = autoCompleteList.getWidth();
		renderedAttributes.add(renderString(AutoCompleteList.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object x = autoCompleteList.getX();
		renderedAttributes.add(renderNumber(AutoCompleteList.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object xy = autoCompleteList.getXy();
		renderedAttributes.add(renderArray(AutoCompleteList.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object y = autoCompleteList.getY();
		renderedAttributes.add(renderNumber(AutoCompleteList.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.Object zIndex = autoCompleteList.getZIndex();
		renderedAttributes.add(renderNumber(AutoCompleteList.Z_INDEX, zIndex));
	}

	protected void renderAfterActivateFirstItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterActivateFirstItemChange = autoCompleteList.getAfterActivateFirstItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ACTIVATE_FIRST_ITEM_CHANGE, afterActivateFirstItemChange));
	}

	protected void renderAfterActiveItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterActiveItemChange = autoCompleteList.getAfterActiveItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ACTIVE_ITEM_CHANGE, afterActiveItemChange));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlignChange = autoCompleteList.getAfterAlignChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlignOnChange = autoCompleteList.getAfterAlignOnChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterAlwaysShowListChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterAlwaysShowListChange = autoCompleteList.getAfterAlwaysShowListChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ALWAYS_SHOW_LIST_CHANGE, afterAlwaysShowListChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterBodyContentChange = autoCompleteList.getAfterBodyContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterBoundingBoxChange = autoCompleteList.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterCenteredChange = autoCompleteList.getAfterCenteredChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterCircularChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterCircularChange = autoCompleteList.getAfterCircularChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_CIRCULAR_CHANGE, afterCircularChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterConstrainChange = autoCompleteList.getAfterConstrainChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterContentBoxChange = autoCompleteList.getAfterContentBoxChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterDestroyedChange = autoCompleteList.getAfterDestroyedChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterDisabledChange = autoCompleteList.getAfterDisabledChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFillHeightChange = autoCompleteList.getAfterFillHeightChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFocusedChange = autoCompleteList.getAfterFocusedChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterFooterContentChange = autoCompleteList.getAfterFooterContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHeaderContentChange = autoCompleteList.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHeightChange = autoCompleteList.getAfterHeightChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHideOnChange = autoCompleteList.getAfterHideOnChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHostChange = autoCompleteList.getAfterHostChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterHoveredItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterHoveredItemChange = autoCompleteList.getAfterHoveredItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_HOVERED_ITEM_CHANGE, afterHoveredItemChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterIdChange = autoCompleteList.getAfterIdChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterInitializedChange = autoCompleteList.getAfterInitializedChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterListNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterListNodeChange = autoCompleteList.getAfterListNodeChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_LIST_NODE_CHANGE, afterListNodeChange));
	}

	protected void renderAfterLoadingMessageChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterLoadingMessageChange = autoCompleteList.getAfterLoadingMessageChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_LOADING_MESSAGE_CHANGE, afterLoadingMessageChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterLocaleChange = autoCompleteList.getAfterLocaleChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterPreventOverlapChange = autoCompleteList.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterRenderChange = autoCompleteList.getAfterRenderChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterRenderedChange = autoCompleteList.getAfterRenderedChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResultsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterResultsChange = autoCompleteList.getAfterResultsChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_RESULTS_CHANGE, afterResultsChange));
	}

	protected void renderAfterScrollIntoViewChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterScrollIntoViewChange = autoCompleteList.getAfterScrollIntoViewChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_SCROLL_INTO_VIEW_CHANGE, afterScrollIntoViewChange));
	}

	protected void renderAfterSelectedEntryChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterSelectedEntryChange = autoCompleteList.getAfterSelectedEntryChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_SELECTED_ENTRY_CHANGE, afterSelectedEntryChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterShimChange = autoCompleteList.getAfterShimChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterSrcNodeChange = autoCompleteList.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterStringsChange = autoCompleteList.getAfterStringsChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterTabIndexChange = autoCompleteList.getAfterTabIndexChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTabSelectChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterTabSelectChange = autoCompleteList.getAfterTabSelectChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_TAB_SELECT_CHANGE, afterTabSelectChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterVisibleChange = autoCompleteList.getAfterVisibleChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterWidthChange = autoCompleteList.getAfterWidthChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterXChange = autoCompleteList.getAfterXChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterXyChange = autoCompleteList.getAfterXyChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterYChange = autoCompleteList.getAfterYChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String afterZIndexChange = autoCompleteList.getAfterZIndexChange();
		renderedAttributes.add(renderString(AutoCompleteList.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnActivateFirstItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onActivateFirstItemChange = autoCompleteList.getOnActivateFirstItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ACTIVATE_FIRST_ITEM_CHANGE, onActivateFirstItemChange));
	}

	protected void renderOnActiveItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onActiveItemChange = autoCompleteList.getOnActiveItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ACTIVE_ITEM_CHANGE, onActiveItemChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlignChange = autoCompleteList.getOnAlignChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlignOnChange = autoCompleteList.getOnAlignOnChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnAlwaysShowListChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onAlwaysShowListChange = autoCompleteList.getOnAlwaysShowListChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ALWAYS_SHOW_LIST_CHANGE, onAlwaysShowListChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onBodyContentChange = autoCompleteList.getOnBodyContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onBoundingBoxChange = autoCompleteList.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onCenteredChange = autoCompleteList.getOnCenteredChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnCircularChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onCircularChange = autoCompleteList.getOnCircularChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_CIRCULAR_CHANGE, onCircularChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onConstrainChange = autoCompleteList.getOnConstrainChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onContentBoxChange = autoCompleteList.getOnContentBoxChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onDestroyedChange = autoCompleteList.getOnDestroyedChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onDisabledChange = autoCompleteList.getOnDisabledChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFillHeightChange = autoCompleteList.getOnFillHeightChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFocusedChange = autoCompleteList.getOnFocusedChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onFooterContentChange = autoCompleteList.getOnFooterContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHeaderContentChange = autoCompleteList.getOnHeaderContentChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHeightChange = autoCompleteList.getOnHeightChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHideOnChange = autoCompleteList.getOnHideOnChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHostChange = autoCompleteList.getOnHostChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnHoveredItemChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onHoveredItemChange = autoCompleteList.getOnHoveredItemChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_HOVERED_ITEM_CHANGE, onHoveredItemChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onIdChange = autoCompleteList.getOnIdChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onInitializedChange = autoCompleteList.getOnInitializedChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnListNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onListNodeChange = autoCompleteList.getOnListNodeChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_LIST_NODE_CHANGE, onListNodeChange));
	}

	protected void renderOnLoadingMessageChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onLoadingMessageChange = autoCompleteList.getOnLoadingMessageChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_LOADING_MESSAGE_CHANGE, onLoadingMessageChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onLocaleChange = autoCompleteList.getOnLocaleChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onPreventOverlapChange = autoCompleteList.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onRenderChange = autoCompleteList.getOnRenderChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onRenderedChange = autoCompleteList.getOnRenderedChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResultsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onResultsChange = autoCompleteList.getOnResultsChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_RESULTS_CHANGE, onResultsChange));
	}

	protected void renderOnScrollIntoViewChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onScrollIntoViewChange = autoCompleteList.getOnScrollIntoViewChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_SCROLL_INTO_VIEW_CHANGE, onScrollIntoViewChange));
	}

	protected void renderOnSelectedEntryChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onSelectedEntryChange = autoCompleteList.getOnSelectedEntryChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_SELECTED_ENTRY_CHANGE, onSelectedEntryChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onShimChange = autoCompleteList.getOnShimChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onSrcNodeChange = autoCompleteList.getOnSrcNodeChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onStringsChange = autoCompleteList.getOnStringsChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onTabIndexChange = autoCompleteList.getOnTabIndexChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTabSelectChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onTabSelectChange = autoCompleteList.getOnTabSelectChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_TAB_SELECT_CHANGE, onTabSelectChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onVisibleChange = autoCompleteList.getOnVisibleChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onWidthChange = autoCompleteList.getOnWidthChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onXChange = autoCompleteList.getOnXChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onXyChange = autoCompleteList.getOnXyChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onYChange = autoCompleteList.getOnYChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		java.lang.String onZIndexChange = autoCompleteList.getOnZIndexChange();
		renderedAttributes.add(renderString(AutoCompleteList.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}