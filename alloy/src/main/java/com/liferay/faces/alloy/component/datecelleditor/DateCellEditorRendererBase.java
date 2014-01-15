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
package com.liferay.faces.alloy.component.datecelleditor;

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
public abstract class DateCellEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DateCellEditor dateCellEditor = (DateCellEditor) uiComponent;
		encodeHTML(facesContext, dateCellEditor);
		encodeJavaScript(facesContext, dateCellEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DateCellEditor dateCellEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DateCellEditor dateCellEditor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, dateCellEditor);

		bufferedResponseWriter.write("var dateCellEditor = new A.DateCellEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDatecelleditorBodyContent(renrederedAttributes, dateCellEditor);
		renderCalendar(renrederedAttributes, dateCellEditor);
		renderDateFormat(renrederedAttributes, dateCellEditor);
		renderInputFormatter(renrederedAttributes, dateCellEditor);
		renderOutputFormatter(renrederedAttributes, dateCellEditor);

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

		handleBuffer(facesContext, dateCellEditor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDatecelleditorBodyContent(ArrayList<String> renrederedAttributes, DateCellEditor dateCellEditor) throws IOException {
		if (dateCellEditor.getDatecelleditorBodyContent() != null) {
			renrederedAttributes.add(renderString("datecelleditorBodyContent", dateCellEditor.getDatecelleditorBodyContent()));
		}
	}

	protected void renderCalendar(ArrayList<String> renrederedAttributes, DateCellEditor dateCellEditor) throws IOException {
		if (dateCellEditor.getCalendar() != null) {
			renrederedAttributes.add(renderObject("calendar", dateCellEditor.getCalendar()));
		}
	}

	protected void renderDateFormat(ArrayList<String> renrederedAttributes, DateCellEditor dateCellEditor) throws IOException {
		if (dateCellEditor.getDateFormat() != null) {
			renrederedAttributes.add(renderString("dateFormat", dateCellEditor.getDateFormat()));
		}
	}

	protected void renderInputFormatter(ArrayList<String> renrederedAttributes, DateCellEditor dateCellEditor) throws IOException {
		if (dateCellEditor.getInputFormatter() != null) {
			renrederedAttributes.add(renderString("inputFormatter", dateCellEditor.getInputFormatter()));
		}
	}

	protected void renderOutputFormatter(ArrayList<String> renrederedAttributes, DateCellEditor dateCellEditor) throws IOException {
		if (dateCellEditor.getOutputFormatter() != null) {
			renrederedAttributes.add(renderString("outputFormatter", dateCellEditor.getOutputFormatter()));
		}
	}

}