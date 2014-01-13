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
package com.liferay.faces.alloy.component.autocomplete;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class AutoCompleteRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		AutoComplete autoComplete = (AutoComplete) uiComponent;
		encodeHTML(facesContext, autoComplete);
		encodeJavaScript(facesContext, autoComplete);
	}

	protected abstract void encodeHTML(FacesContext facesContext, AutoComplete autoComplete) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, AutoComplete autoComplete) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", autoComplete);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-autocomplete',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var autoComplete = new Y.AutoComplete");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(autoComplete.getActivateFirstItem() != null)
		{

			responseWriter.write("activateFirstItem: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getActivateFirstItem().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getActiveItem() != null)
		{

			responseWriter.write("activeItem: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getActiveItem().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAlign() != null)
		{

			responseWriter.write("align: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAlign().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAlignOn() != null)
		{

			responseWriter.write("alignOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAlignOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAllowBrowserAutocomplete() != null)
		{

			responseWriter.write("allowBrowserAutocomplete: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAllowBrowserAutocomplete().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAllowTrailingDelimiter() != null)
		{

			responseWriter.write("allowTrailingDelimiter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAllowTrailingDelimiter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAlwaysShowList() != null)
		{

			responseWriter.write("alwaysShowList: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAlwaysShowList().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getCentered() != null)
		{

			responseWriter.write("centered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getCentered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getCircular() != null)
		{

			responseWriter.write("circular: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getCircular().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getDestroyed() != null)
		{

			responseWriter.write("destroyed: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getDestroyed().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getEnableCache() != null)
		{

			responseWriter.write("enableCache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getEnableCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getFocused() != null)
		{

			responseWriter.write("focused: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getFocused().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getHoveredItem() != null)
		{

			responseWriter.write("hoveredItem: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getHoveredItem().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAutocompleteId() != null)
		{

			responseWriter.write("autocompleteId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAutocompleteId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getInitialized() != null)
		{

			responseWriter.write("initialized: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getInitialized().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getInputNode() != null)
		{

			responseWriter.write("inputNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getInputNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getListNode() != null)
		{

			responseWriter.write("listNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getListNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAutocompleteLocale() != null)
		{

			responseWriter.write("autocompleteLocale: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAutocompleteLocale().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getMaxResults() != null)
		{

			responseWriter.write("maxResults: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getMaxResults().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getMinQueryLength() != null)
		{

			responseWriter.write("minQueryLength: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getMinQueryLength().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getQuery() != null)
		{

			responseWriter.write("query: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getQuery().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getQueryDelay() != null)
		{

			responseWriter.write("queryDelay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getQueryDelay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getQueryDelimiter() != null)
		{

			responseWriter.write("queryDelimiter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getQueryDelimiter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getRequestTemplate() != null)
		{

			responseWriter.write("requestTemplate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getRequestTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResultFilters() != null)
		{

			responseWriter.write("resultFilters: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResultFilters().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResultFormatter() != null)
		{

			responseWriter.write("resultFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResultFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResultHighlighter() != null)
		{

			responseWriter.write("resultHighlighter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResultHighlighter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResultListLocator() != null)
		{

			responseWriter.write("resultListLocator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResultListLocator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResultTextLocator() != null)
		{

			responseWriter.write("resultTextLocator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResultTextLocator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getResults() != null)
		{

			responseWriter.write("results: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getResults().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getScrollIntoView() != null)
		{

			responseWriter.write("scrollIntoView: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getScrollIntoView().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getSource() != null)
		{

			responseWriter.write("source: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getSource().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getSourceType() != null)
		{

			responseWriter.write("sourceType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getSourceType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getSrcNode() != null)
		{

			responseWriter.write("srcNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getSrcNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getTabSelect() != null)
		{

			responseWriter.write("tabSelect: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getTabSelect().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getTokenInput() != null)
		{

			responseWriter.write("tokenInput: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getTokenInput().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getAutocompleteValue() != null)
		{

			responseWriter.write("autocompleteValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getAutocompleteValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getX() != null)
		{

			responseWriter.write("x: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getX().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getXy() != null)
		{

			responseWriter.write("xy: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getXy().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getY() != null)
		{

			responseWriter.write("y: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getY().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getYqlEnv() != null)
		{

			responseWriter.write("yqlEnv: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getYqlEnv().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(autoComplete.getYqlProtocol() != null)
		{

			responseWriter.write("yqlProtocol: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(autoComplete.getYqlProtocol().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}