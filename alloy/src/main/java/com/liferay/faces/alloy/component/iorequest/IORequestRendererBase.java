/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.iorequest;

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
public abstract class IORequestRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		IORequest iORequest = (IORequest) uiComponent;
		encodeHTML(facesContext, iORequest);
		encodeJavaScript(facesContext, iORequest);
	}

	protected abstract void encodeHTML(FacesContext facesContext, IORequest iORequest) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, IORequest iORequest) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", iORequest);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-iorequest',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var iORequest = new Y.IORequest");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(iORequest.getActive() != null)
		{

			responseWriter.write("active: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getActive().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getArguments() != null)
		{

			responseWriter.write("arguments: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getArguments().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getAutoLoad() != null)
		{

			responseWriter.write("autoLoad: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getAutoLoad().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getCache() != null)
		{

			responseWriter.write("cache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getCfg() != null)
		{

			responseWriter.write("cfg: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getCfg().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getContext() != null)
		{

			responseWriter.write("context: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getContext().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getData() != null)
		{

			responseWriter.write("data: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getData().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getDataType() != null)
		{

			responseWriter.write("dataType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getDataType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getForm() != null)
		{

			responseWriter.write("form: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getForm().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getHeaders() != null)
		{

			responseWriter.write("headers: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getHeaders().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getMethod() != null)
		{

			responseWriter.write("method: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getMethod().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getResponseData() != null)
		{

			responseWriter.write("responseData: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getResponseData().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getSelector() != null)
		{

			responseWriter.write("selector: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getSelector().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getSync() != null)
		{

			responseWriter.write("sync: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getSync().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getTimeout() != null)
		{

			responseWriter.write("timeout: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getTimeout().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getTransaction() != null)
		{

			responseWriter.write("transaction: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getTransaction().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getUri() != null)
		{

			responseWriter.write("uri: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getUri().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(iORequest.getXdr() != null)
		{

			responseWriter.write("xdr: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(iORequest.getXdr().toString());
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