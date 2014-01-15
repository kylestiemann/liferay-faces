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
package com.liferay.faces.alloy.component.schedulertableview;

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
public abstract class SchedulerTableViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-table";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerTableView schedulerTableView = (SchedulerTableView) uiComponent;
		encodeHTML(facesContext, schedulerTableView);
		encodeJavaScript(facesContext, schedulerTableView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerTableView schedulerTableView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerTableView schedulerTableView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerTableView);

		bufferedResponseWriter.write("var schedulerTableView = new A.SchedulerTableView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderSchedulertableviewBodyContent(renrederedAttributes, schedulerTableView);
		renderBoundingBox(renrederedAttributes, schedulerTableView);
		renderColHeaderDaysNode(renrederedAttributes, schedulerTableView);
		renderContentBox(renrederedAttributes, schedulerTableView);
		renderCssClass(renrederedAttributes, schedulerTableView);
		renderDestroyed(renrederedAttributes, schedulerTableView);
		renderDisabled(renrederedAttributes, schedulerTableView);
		renderDisplayDaysInterval(renrederedAttributes, schedulerTableView);
		renderDisplayRows(renrederedAttributes, schedulerTableView);
		renderFilterFn(renrederedAttributes, schedulerTableView);
		renderFixedHeight(renrederedAttributes, schedulerTableView);
		renderFocused(renrederedAttributes, schedulerTableView);
		renderHeaderDateFormatter(renrederedAttributes, schedulerTableView);
		renderHeaderTableNode(renrederedAttributes, schedulerTableView);
		renderHeight(renrederedAttributes, schedulerTableView);
		renderHideClass(renrederedAttributes, schedulerTableView);
		renderSchedulertableviewId(renrederedAttributes, schedulerTableView);
		renderInitialized(renrederedAttributes, schedulerTableView);
		renderIsoTime(renrederedAttributes, schedulerTableView);
		renderSchedulertableviewLocale(renrederedAttributes, schedulerTableView);
		renderName(renrederedAttributes, schedulerTableView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerTableView);
		renderNextDate(renrederedAttributes, schedulerTableView);
		renderPrevDate(renrederedAttributes, schedulerTableView);
		renderRender(renrederedAttributes, schedulerTableView);
		renderRendered(renrederedAttributes, schedulerTableView);
		renderRowsContainerNode(renrederedAttributes, schedulerTableView);
		renderScheduler(renrederedAttributes, schedulerTableView);
		renderScrollable(renrederedAttributes, schedulerTableView);
		renderSrcNode(renrederedAttributes, schedulerTableView);
		renderStrings(renrederedAttributes, schedulerTableView);
		renderTabIndex(renrederedAttributes, schedulerTableView);
		renderTableGridNode(renrederedAttributes, schedulerTableView);
		renderTriggerNode(renrederedAttributes, schedulerTableView);
		renderUseARIA(renrederedAttributes, schedulerTableView);
		renderVisible(renrederedAttributes, schedulerTableView);
		renderWidth(renrederedAttributes, schedulerTableView);

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

		handleBuffer(facesContext, schedulerTableView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulertableviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getSchedulertableviewBodyContent() != null) {
			renrederedAttributes.add(renderString("schedulertableviewBodyContent", schedulerTableView.getSchedulertableviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerTableView.getBoundingBox()));
		}
	}

	protected void renderColHeaderDaysNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getColHeaderDaysNode() != null) {
			renrederedAttributes.add(renderString("colHeaderDaysNode", schedulerTableView.getColHeaderDaysNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerTableView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerTableView.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerTableView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerTableView.getDisabled()));
		}
	}

	protected void renderDisplayDaysInterval(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getDisplayDaysInterval() != null) {
			renrederedAttributes.add(renderNumber("displayDaysInterval", schedulerTableView.getDisplayDaysInterval()));
		}
	}

	protected void renderDisplayRows(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getDisplayRows() != null) {
			renrederedAttributes.add(renderNumber("displayRows", schedulerTableView.getDisplayRows()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerTableView.getFilterFn()));
		}
	}

	protected void renderFixedHeight(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getFixedHeight() != null) {
			renrederedAttributes.add(renderBoolean("fixedHeight", schedulerTableView.getFixedHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerTableView.getFocused()));
		}
	}

	protected void renderHeaderDateFormatter(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getHeaderDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerDateFormatter", schedulerTableView.getHeaderDateFormatter()));
		}
	}

	protected void renderHeaderTableNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getHeaderTableNode() != null) {
			renrederedAttributes.add(renderString("headerTableNode", schedulerTableView.getHeaderTableNode()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerTableView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerTableView.getHideClass()));
		}
	}

	protected void renderSchedulertableviewId(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getSchedulertableviewId() != null) {
			renrederedAttributes.add(renderString("schedulertableviewId", schedulerTableView.getSchedulertableviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerTableView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerTableView.getIsoTime()));
		}
	}

	protected void renderSchedulertableviewLocale(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getSchedulertableviewLocale() != null) {
			renrederedAttributes.add(renderString("schedulertableviewLocale", schedulerTableView.getSchedulertableviewLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerTableView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerTableView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerTableView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerTableView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerTableView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerTableView.getRendered()));
		}
	}

	protected void renderRowsContainerNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getRowsContainerNode() != null) {
			renrederedAttributes.add(renderString("rowsContainerNode", schedulerTableView.getRowsContainerNode()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerTableView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerTableView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerTableView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", schedulerTableView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerTableView.getTabIndex()));
		}
	}

	protected void renderTableGridNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getTableGridNode() != null) {
			renrederedAttributes.add(renderString("tableGridNode", schedulerTableView.getTableGridNode()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerTableView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerTableView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerTableView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		if (schedulerTableView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerTableView.getWidth()));
		}
	}

}