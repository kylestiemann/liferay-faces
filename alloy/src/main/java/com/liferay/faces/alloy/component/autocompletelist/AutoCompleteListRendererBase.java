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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class AutoCompleteListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-list";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		AutoCompleteList autoCompleteList = (AutoCompleteList) uiComponent;
		encodeHTML(facesContext, autoCompleteList);
		encodeJavaScript(facesContext, autoCompleteList);
	}

	protected abstract void encodeHTML(FacesContext facesContext, AutoCompleteList autoCompleteList) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, AutoCompleteList autoCompleteList) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, autoCompleteList);

		bufferedResponseWriter.write("var autoCompleteList = new A.AutoCompleteList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActivateFirstItem(renrederedAttributes, autoCompleteList);
		renderActiveItem(renrederedAttributes, autoCompleteList);
		renderAlign(renrederedAttributes, autoCompleteList);
		renderAlignOn(renrederedAttributes, autoCompleteList);
		renderAlwaysShowList(renrederedAttributes, autoCompleteList);
		renderAutocompletelistBodyContent(renrederedAttributes, autoCompleteList);
		renderBoundingBox(renrederedAttributes, autoCompleteList);
		renderCentered(renrederedAttributes, autoCompleteList);
		renderCircular(renrederedAttributes, autoCompleteList);
		renderConstrain(renrederedAttributes, autoCompleteList);
		renderContentBox(renrederedAttributes, autoCompleteList);
		renderDestroyed(renrederedAttributes, autoCompleteList);
		renderDisabled(renrederedAttributes, autoCompleteList);
		renderFillHeight(renrederedAttributes, autoCompleteList);
		renderFocused(renrederedAttributes, autoCompleteList);
		renderFooterContent(renrederedAttributes, autoCompleteList);
		renderHeaderContent(renrederedAttributes, autoCompleteList);
		renderHeight(renrederedAttributes, autoCompleteList);
		renderHideOn(renrederedAttributes, autoCompleteList);
		renderHost(renrederedAttributes, autoCompleteList);
		renderHoveredItem(renrederedAttributes, autoCompleteList);
		renderAutocompletelistId(renrederedAttributes, autoCompleteList);
		renderInitialized(renrederedAttributes, autoCompleteList);
		renderListNode(renrederedAttributes, autoCompleteList);
		renderLoadingMessage(renrederedAttributes, autoCompleteList);
		renderAutocompletelistLocale(renrederedAttributes, autoCompleteList);
		renderPreventOverlap(renrederedAttributes, autoCompleteList);
		renderRender(renrederedAttributes, autoCompleteList);
		renderRendered(renrederedAttributes, autoCompleteList);
		renderResults(renrederedAttributes, autoCompleteList);
		renderScrollIntoView(renrederedAttributes, autoCompleteList);
		renderSelectedEntry(renrederedAttributes, autoCompleteList);
		renderShim(renrederedAttributes, autoCompleteList);
		renderSrcNode(renrederedAttributes, autoCompleteList);
		renderStrings(renrederedAttributes, autoCompleteList);
		renderTabIndex(renrederedAttributes, autoCompleteList);
		renderTabSelect(renrederedAttributes, autoCompleteList);
		renderVisible(renrederedAttributes, autoCompleteList);
		renderWidth(renrederedAttributes, autoCompleteList);
		renderX(renrederedAttributes, autoCompleteList);
		renderXy(renrederedAttributes, autoCompleteList);
		renderY(renrederedAttributes, autoCompleteList);
		renderZIndex(renrederedAttributes, autoCompleteList);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, autoCompleteList);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActivateFirstItem(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getActivateFirstItem() != null) {
			renrederedAttributes.add(renderBoolean("activateFirstItem", autoCompleteList.getActivateFirstItem()));
		}
	}

	protected void renderActiveItem(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getActiveItem() != null) {
			renrederedAttributes.add(renderString("activeItem", autoCompleteList.getActiveItem()));
		}
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", autoCompleteList.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", autoCompleteList.getAlignOn()));
		}
	}

	protected void renderAlwaysShowList(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAlwaysShowList() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowList", autoCompleteList.getAlwaysShowList()));
		}
	}

	protected void renderAutocompletelistBodyContent(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAutocompletelistBodyContent() != null) {
			renrederedAttributes.add(renderString("autocompletelistBodyContent", autoCompleteList.getAutocompletelistBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", autoCompleteList.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", autoCompleteList.getCentered()));
		}
	}

	protected void renderCircular(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getCircular() != null) {
			renrederedAttributes.add(renderBoolean("circular", autoCompleteList.getCircular()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", autoCompleteList.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", autoCompleteList.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", autoCompleteList.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", autoCompleteList.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", autoCompleteList.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", autoCompleteList.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", autoCompleteList.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", autoCompleteList.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getHeight() != null) {
			renrederedAttributes.add(renderString("height", autoCompleteList.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", autoCompleteList.getHideOn()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getHost() != null) {
			renrederedAttributes.add(renderObject("host", autoCompleteList.getHost()));
		}
	}

	protected void renderHoveredItem(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getHoveredItem() != null) {
			renrederedAttributes.add(renderString("hoveredItem", autoCompleteList.getHoveredItem()));
		}
	}

	protected void renderAutocompletelistId(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAutocompletelistId() != null) {
			renrederedAttributes.add(renderString("autocompletelistId", autoCompleteList.getAutocompletelistId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", autoCompleteList.getInitialized()));
		}
	}

	protected void renderListNode(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getListNode() != null) {
			renrederedAttributes.add(renderString("listNode", autoCompleteList.getListNode()));
		}
	}

	protected void renderLoadingMessage(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getLoadingMessage() != null) {
			renrederedAttributes.add(renderString("loadingMessage", autoCompleteList.getLoadingMessage()));
		}
	}

	protected void renderAutocompletelistLocale(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getAutocompletelistLocale() != null) {
			renrederedAttributes.add(renderString("autocompletelistLocale", autoCompleteList.getAutocompletelistLocale()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", autoCompleteList.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getRender() != null) {
			renrederedAttributes.add(renderString("render", autoCompleteList.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", autoCompleteList.getRendered()));
		}
	}

	protected void renderResults(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getResults() != null) {
			renrederedAttributes.add(renderArray("results", autoCompleteList.getResults()));
		}
	}

	protected void renderScrollIntoView(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getScrollIntoView() != null) {
			renrederedAttributes.add(renderBoolean("scrollIntoView", autoCompleteList.getScrollIntoView()));
		}
	}

	protected void renderSelectedEntry(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getSelectedEntry() != null) {
			renrederedAttributes.add(renderString("selectedEntry", autoCompleteList.getSelectedEntry()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", autoCompleteList.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", autoCompleteList.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", autoCompleteList.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", autoCompleteList.getTabIndex()));
		}
	}

	protected void renderTabSelect(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getTabSelect() != null) {
			renrederedAttributes.add(renderBoolean("tabSelect", autoCompleteList.getTabSelect()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", autoCompleteList.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getWidth() != null) {
			renrederedAttributes.add(renderString("width", autoCompleteList.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getX() != null) {
			renrederedAttributes.add(renderNumber("x", autoCompleteList.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", autoCompleteList.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getY() != null) {
			renrederedAttributes.add(renderNumber("y", autoCompleteList.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, AutoCompleteList autoCompleteList) throws IOException {
		if (autoCompleteList.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", autoCompleteList.getZIndex()));
		}
	}

}