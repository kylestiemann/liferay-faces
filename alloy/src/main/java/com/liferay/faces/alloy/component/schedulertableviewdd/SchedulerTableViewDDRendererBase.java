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
package com.liferay.faces.alloy.component.schedulertableviewdd;

import java.io.IOException;

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
public abstract class SchedulerTableViewDDRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_SCHEDULER_VIEW_TABLE_DD = "aui-scheduler-view-table-dd";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerTableViewDD schedulerTableViewDD = (SchedulerTableViewDD) uiComponent;
		encodeHTML(facesContext, schedulerTableViewDD);
		encodeJavaScript(facesContext, schedulerTableViewDD);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerTableViewDD schedulerTableViewDD) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerTableViewDD schedulerTableViewDD) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerTableViewDD, AUI_SCHEDULER_VIEW_TABLE_DD);

		bufferedResponseWriter.write("var schedulerTableViewDD = new Y.SchedulerTableViewDD");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(schedulerTableViewDD.getDelegateConfig() != null)
		{

			bufferedResponseWriter.write("delegateConfig: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerTableViewDD.getDelegateConfig().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, schedulerTableViewDD, AUI_SCHEDULER_VIEW_TABLE_DD);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}