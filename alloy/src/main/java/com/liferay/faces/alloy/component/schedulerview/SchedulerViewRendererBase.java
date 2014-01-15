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
package com.liferay.faces.alloy.component.schedulerview;

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
public abstract class SchedulerViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerView schedulerView = (SchedulerView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerView = new A.SchedulerView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderSchedulerviewBodyContent(renrederedAttributes, schedulerView);
		renderBoundingBox(renrederedAttributes, schedulerView);
		renderContentBox(renrederedAttributes, schedulerView);
		renderCssClass(renrederedAttributes, schedulerView);
		renderDestroyed(renrederedAttributes, schedulerView);
		renderDisabled(renrederedAttributes, schedulerView);
		renderFilterFn(renrederedAttributes, schedulerView);
		renderFocused(renrederedAttributes, schedulerView);
		renderHeight(renrederedAttributes, schedulerView);
		renderHideClass(renrederedAttributes, schedulerView);
		renderSchedulerviewId(renrederedAttributes, schedulerView);
		renderInitialized(renrederedAttributes, schedulerView);
		renderIsoTime(renrederedAttributes, schedulerView);
		renderSchedulerviewLocale(renrederedAttributes, schedulerView);
		renderName(renrederedAttributes, schedulerView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerView);
		renderNextDate(renrederedAttributes, schedulerView);
		renderPrevDate(renrederedAttributes, schedulerView);
		renderRender(renrederedAttributes, schedulerView);
		renderRendered(renrederedAttributes, schedulerView);
		renderScheduler(renrederedAttributes, schedulerView);
		renderScrollable(renrederedAttributes, schedulerView);
		renderSrcNode(renrederedAttributes, schedulerView);
		renderStrings(renrederedAttributes, schedulerView);
		renderTabIndex(renrederedAttributes, schedulerView);
		renderTriggerNode(renrederedAttributes, schedulerView);
		renderUseARIA(renrederedAttributes, schedulerView);
		renderVisible(renrederedAttributes, schedulerView);
		renderWidth(renrederedAttributes, schedulerView);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulerviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getSchedulerviewBodyContent() != null) {
			renrederedAttributes.add(renderString("schedulerviewBodyContent", schedulerView.getSchedulerviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerView.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerView.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerView.getDisabled()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerView.getFilterFn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerView.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerView.getHideClass()));
		}
	}

	protected void renderSchedulerviewId(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getSchedulerviewId() != null) {
			renrederedAttributes.add(renderString("schedulerviewId", schedulerView.getSchedulerviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerView.getIsoTime()));
		}
	}

	protected void renderSchedulerviewLocale(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getSchedulerviewLocale() != null) {
			renrederedAttributes.add(renderString("schedulerviewLocale", schedulerView.getSchedulerviewLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerView.getRendered()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", schedulerView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerView.getTabIndex()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerView schedulerView) throws IOException {
		if (schedulerView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerView.getWidth()));
		}
	}

}