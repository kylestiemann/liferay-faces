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
package com.liferay.faces.alloy.component.ternarysearchnode;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TernarySearchNodeBase extends javax.faces.component.UIPanel {

	private static final String CHARACTER = "character";
	private static final String CHILD = "child";
	private static final String LARGER_NODE = "largerNode";
	private static final String SMALLER_NODE = "smallerNode";
	private static final String WORD = "word";
	private static final String AFTER_CHARACTER_CHANGE = "afterCharacterChange";
	private static final String AFTER_CHILD_CHANGE = "afterChildChange";
	private static final String AFTER_LARGER_NODE_CHANGE = "afterLargerNodeChange";
	private static final String AFTER_SMALLER_NODE_CHANGE = "afterSmallerNodeChange";
	private static final String AFTER_WORD_CHANGE = "afterWordChange";
	private static final String ON_CHARACTER_CHANGE = "onCharacterChange";
	private static final String ON_CHILD_CHANGE = "onChildChange";
	private static final String ON_LARGER_NODE_CHANGE = "onLargerNodeChange";
	private static final String ON_SMALLER_NODE_CHANGE = "onSmallerNodeChange";
	private static final String ON_WORD_CHANGE = "onWordChange";

	protected java.lang.String getCharacter() {
		return (java.lang.String) getStateHelper().eval(CHARACTER, null);
	}

	protected void setCharacter(java.lang.String character) {
		getStateHelper().put(CHARACTER, character);
	}

	protected java.lang.Object getChild() {
		return (java.lang.Object) getStateHelper().eval(CHILD, null);
	}

	protected void setChild(java.lang.Object child) {
		getStateHelper().put(CHILD, child);
	}

	protected java.lang.Object getLargerNode() {
		return (java.lang.Object) getStateHelper().eval(LARGER_NODE, null);
	}

	protected void setLargerNode(java.lang.Object largerNode) {
		getStateHelper().put(LARGER_NODE, largerNode);
	}

	protected java.lang.Object getSmallerNode() {
		return (java.lang.Object) getStateHelper().eval(SMALLER_NODE, null);
	}

	protected void setSmallerNode(java.lang.Object smallerNode) {
		getStateHelper().put(SMALLER_NODE, smallerNode);
	}

	protected java.lang.String getWord() {
		return (java.lang.String) getStateHelper().eval(WORD, null);
	}

	protected void setWord(java.lang.String word) {
		getStateHelper().put(WORD, word);
	}

	protected java.lang.String getAfterCharacterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHARACTER_CHANGE, null);
	}

	protected void setAfterCharacterChange(java.lang.String afterCharacterChange) {
		getStateHelper().put(AFTER_CHARACTER_CHANGE, afterCharacterChange);
	}

	protected java.lang.String getAfterChildChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILD_CHANGE, null);
	}

	protected void setAfterChildChange(java.lang.String afterChildChange) {
		getStateHelper().put(AFTER_CHILD_CHANGE, afterChildChange);
	}

	protected java.lang.String getAfterLargerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LARGER_NODE_CHANGE, null);
	}

	protected void setAfterLargerNodeChange(java.lang.String afterLargerNodeChange) {
		getStateHelper().put(AFTER_LARGER_NODE_CHANGE, afterLargerNodeChange);
	}

	protected java.lang.String getAfterSmallerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SMALLER_NODE_CHANGE, null);
	}

	protected void setAfterSmallerNodeChange(java.lang.String afterSmallerNodeChange) {
		getStateHelper().put(AFTER_SMALLER_NODE_CHANGE, afterSmallerNodeChange);
	}

	protected java.lang.String getAfterWordChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WORD_CHANGE, null);
	}

	protected void setAfterWordChange(java.lang.String afterWordChange) {
		getStateHelper().put(AFTER_WORD_CHANGE, afterWordChange);
	}

	protected java.lang.String getOnCharacterChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHARACTER_CHANGE, null);
	}

	protected void setOnCharacterChange(java.lang.String onCharacterChange) {
		getStateHelper().put(ON_CHARACTER_CHANGE, onCharacterChange);
	}

	protected java.lang.String getOnChildChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILD_CHANGE, null);
	}

	protected void setOnChildChange(java.lang.String onChildChange) {
		getStateHelper().put(ON_CHILD_CHANGE, onChildChange);
	}

	protected java.lang.String getOnLargerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LARGER_NODE_CHANGE, null);
	}

	protected void setOnLargerNodeChange(java.lang.String onLargerNodeChange) {
		getStateHelper().put(ON_LARGER_NODE_CHANGE, onLargerNodeChange);
	}

	protected java.lang.String getOnSmallerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SMALLER_NODE_CHANGE, null);
	}

	protected void setOnSmallerNodeChange(java.lang.String onSmallerNodeChange) {
		getStateHelper().put(ON_SMALLER_NODE_CHANGE, onSmallerNodeChange);
	}

	protected java.lang.String getOnWordChange() {
		return (java.lang.String) getStateHelper().eval(ON_WORD_CHANGE, null);
	}

	protected void setOnWordChange(java.lang.String onWordChange) {
		getStateHelper().put(ON_WORD_CHANGE, onWordChange);
	}

}