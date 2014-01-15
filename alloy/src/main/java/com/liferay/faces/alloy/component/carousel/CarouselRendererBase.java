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
package com.liferay.faces.alloy.component.carousel;

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
public abstract class CarouselRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-carousel";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Carousel carousel = (Carousel) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var carousel = new A.Carousel");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveIndex(renrederedAttributes, carousel);
		renderAnimationTime(renrederedAttributes, carousel);
		renderHideClass(renrederedAttributes, carousel);
		renderIntervalTime(renrederedAttributes, carousel);
		renderItemSelector(renrederedAttributes, carousel);
		renderNodeMenu(renrederedAttributes, carousel);
		renderNodeMenuItemSelector(renrederedAttributes, carousel);
		renderPlaying(renrederedAttributes, carousel);
		renderRender(renrederedAttributes, carousel);
		renderUseARIA(renrederedAttributes, carousel);

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

	protected void renderActiveIndex(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getActiveIndex() != null) {
			renrederedAttributes.add(renderNumber("activeIndex", carousel.getActiveIndex()));
		}
	}

	protected void renderAnimationTime(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getAnimationTime() != null) {
			renrederedAttributes.add(renderNumber("animationTime", carousel.getAnimationTime()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", carousel.getHideClass()));
		}
	}

	protected void renderIntervalTime(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getIntervalTime() != null) {
			renrederedAttributes.add(renderNumber("intervalTime", carousel.getIntervalTime()));
		}
	}

	protected void renderItemSelector(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getItemSelector() != null) {
			renrederedAttributes.add(renderString("itemSelector", carousel.getItemSelector()));
		}
	}

	protected void renderNodeMenu(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getNodeMenu() != null) {
			renrederedAttributes.add(renderString("nodeMenu", carousel.getNodeMenu()));
		}
	}

	protected void renderNodeMenuItemSelector(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getNodeMenuItemSelector() != null) {
			renrederedAttributes.add(renderString("nodeMenuItemSelector", carousel.getNodeMenuItemSelector()));
		}
	}

	protected void renderPlaying(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getPlaying() != null) {
			renrederedAttributes.add(renderBoolean("playing", carousel.getPlaying()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getRender() != null) {
			renrederedAttributes.add(renderString("render", carousel.getRender()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Carousel carousel) throws IOException {
		if (carousel.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", carousel.getUseARIA()));
		}
	}

}