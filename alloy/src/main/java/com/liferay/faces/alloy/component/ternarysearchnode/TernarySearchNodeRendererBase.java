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
package com.liferay.faces.alloy.component.ternarysearchnode;

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
public abstract class TernarySearchNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-search-ternary-search-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TernarySearchNode ternarySearchNode = (TernarySearchNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var ternarySearchNode = new A.TernarySearchNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderCharacter(renderedAttributes, ternarySearchNode);
		renderChild(renderedAttributes, ternarySearchNode);
		renderDestroyed(renderedAttributes, ternarySearchNode);
		renderInitialized(renderedAttributes, ternarySearchNode);
		renderLargerNode(renderedAttributes, ternarySearchNode);
		renderSmallerNode(renderedAttributes, ternarySearchNode);
		renderWord(renderedAttributes, ternarySearchNode);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterCharacterChange(renderedAfterEvents, ternarySearchNode);
		renderAfterChildChange(renderedAfterEvents, ternarySearchNode);
		renderAfterDestroyedChange(renderedAfterEvents, ternarySearchNode);
		renderAfterInitializedChange(renderedAfterEvents, ternarySearchNode);
		renderAfterLargerNodeChange(renderedAfterEvents, ternarySearchNode);
		renderAfterSmallerNodeChange(renderedAfterEvents, ternarySearchNode);
		renderAfterWordChange(renderedAfterEvents, ternarySearchNode);

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

		renderOnCharacterChange(renderedOnEvents, ternarySearchNode);
		renderOnChildChange(renderedOnEvents, ternarySearchNode);
		renderOnDestroyedChange(renderedOnEvents, ternarySearchNode);
		renderOnInitializedChange(renderedOnEvents, ternarySearchNode);
		renderOnLargerNodeChange(renderedOnEvents, ternarySearchNode);
		renderOnSmallerNodeChange(renderedOnEvents, ternarySearchNode);
		renderOnWordChange(renderedOnEvents, ternarySearchNode);

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

	protected void renderCharacter(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String character = ternarySearchNode.getCharacter();

		if (character != null) {
			renderedAttributes.add(renderString(TernarySearchNode.CHARACTER, character));
		}
	}

	protected void renderChild(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String child = ternarySearchNode.getChild();

		if (child != null) {
			renderedAttributes.add(renderString(TernarySearchNode.CHILD, child));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Boolean destroyed = ternarySearchNode.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TernarySearchNode.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Boolean initialized = ternarySearchNode.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TernarySearchNode.INITIALIZED, initialized));
		}
	}

	protected void renderLargerNode(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Object largerNode = ternarySearchNode.getLargerNode();

		if (largerNode != null) {
			renderedAttributes.add(renderString(TernarySearchNode.LARGER_NODE, largerNode));
		}
	}

	protected void renderSmallerNode(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Object smallerNode = ternarySearchNode.getSmallerNode();

		if (smallerNode != null) {
			renderedAttributes.add(renderString(TernarySearchNode.SMALLER_NODE, smallerNode));
		}
	}

	protected void renderWord(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String word = ternarySearchNode.getWord();

		if (word != null) {
			renderedAttributes.add(renderString(TernarySearchNode.WORD, word));
		}
	}

	protected void renderAfterCharacterChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterCharacterChange = ternarySearchNode.getAfterCharacterChange();

		if (afterCharacterChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_CHARACTER_CHANGE, afterCharacterChange));
		}
	}

	protected void renderAfterChildChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterChildChange = ternarySearchNode.getAfterChildChange();

		if (afterChildChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_CHILD_CHANGE, afterChildChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterDestroyedChange = ternarySearchNode.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterInitializedChange = ternarySearchNode.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLargerNodeChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterLargerNodeChange = ternarySearchNode.getAfterLargerNodeChange();

		if (afterLargerNodeChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_LARGER_NODE_CHANGE, afterLargerNodeChange));
		}
	}

	protected void renderAfterSmallerNodeChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterSmallerNodeChange = ternarySearchNode.getAfterSmallerNodeChange();

		if (afterSmallerNodeChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_SMALLER_NODE_CHANGE, afterSmallerNodeChange));
		}
	}

	protected void renderAfterWordChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String afterWordChange = ternarySearchNode.getAfterWordChange();

		if (afterWordChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.AFTER_WORD_CHANGE, afterWordChange));
		}
	}

	protected void renderOnCharacterChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onCharacterChange = ternarySearchNode.getOnCharacterChange();

		if (onCharacterChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_CHARACTER_CHANGE, onCharacterChange));
		}
	}

	protected void renderOnChildChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onChildChange = ternarySearchNode.getOnChildChange();

		if (onChildChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_CHILD_CHANGE, onChildChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onDestroyedChange = ternarySearchNode.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onInitializedChange = ternarySearchNode.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLargerNodeChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onLargerNodeChange = ternarySearchNode.getOnLargerNodeChange();

		if (onLargerNodeChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_LARGER_NODE_CHANGE, onLargerNodeChange));
		}
	}

	protected void renderOnSmallerNodeChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onSmallerNodeChange = ternarySearchNode.getOnSmallerNodeChange();

		if (onSmallerNodeChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_SMALLER_NODE_CHANGE, onSmallerNodeChange));
		}
	}

	protected void renderOnWordChange(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String onWordChange = ternarySearchNode.getOnWordChange();

		if (onWordChange != null) {
			renderedAttributes.add(renderString(TernarySearchNode.ON_WORD_CHANGE, onWordChange));
		}
	}

}