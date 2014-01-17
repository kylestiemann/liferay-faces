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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TernarySearchNodeBase extends javax.faces.component.UIPanel {

	public static final String CHARACTER = "character";
	public static final String CHILD = "child";
	public static final String DESTROYED = "destroyed";
	public static final String INITIALIZED = "initialized";
	public static final String LARGER_NODE = "largerNode";
	public static final String SMALLER_NODE = "smallerNode";
	public static final String WORD = "word";
	public static final String AFTER_CHARACTER_CHANGE = "afterCharacterChange";
	public static final String AFTER_CHILD_CHANGE = "afterChildChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LARGER_NODE_CHANGE = "afterLargerNodeChange";
	public static final String AFTER_SMALLER_NODE_CHANGE = "afterSmallerNodeChange";
	public static final String AFTER_WORD_CHANGE = "afterWordChange";
	public static final String ON_CHARACTER_CHANGE = "onCharacterChange";
	public static final String ON_CHILD_CHANGE = "onChildChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LARGER_NODE_CHANGE = "onLargerNodeChange";
	public static final String ON_SMALLER_NODE_CHANGE = "onSmallerNodeChange";
	public static final String ON_WORD_CHANGE = "onWordChange";

	public java.lang.String getCharacter() {
		return (java.lang.String) getStateHelper().eval(CHARACTER, null);
	}

	public void setCharacter(java.lang.String character) {
		getStateHelper().put(CHARACTER, character);
	}

	public java.lang.String getChild() {
		return (java.lang.String) getStateHelper().eval(CHILD, null);
	}

	public void setChild(java.lang.String child) {
		getStateHelper().put(CHILD, child);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getLargerNode() {
		return (java.lang.Object) getStateHelper().eval(LARGER_NODE, null);
	}

	public void setLargerNode(java.lang.Object largerNode) {
		getStateHelper().put(LARGER_NODE, largerNode);
	}

	public java.lang.Object getSmallerNode() {
		return (java.lang.Object) getStateHelper().eval(SMALLER_NODE, null);
	}

	public void setSmallerNode(java.lang.Object smallerNode) {
		getStateHelper().put(SMALLER_NODE, smallerNode);
	}

	public java.lang.String getWord() {
		return (java.lang.String) getStateHelper().eval(WORD, null);
	}

	public void setWord(java.lang.String word) {
		getStateHelper().put(WORD, word);
	}

	public java.lang.String getAfterCharacterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHARACTER_CHANGE, null);
	}

	public void setAfterCharacterChange(java.lang.String afterCharacterChange) {
		getStateHelper().put(AFTER_CHARACTER_CHANGE, afterCharacterChange);
	}

	public java.lang.String getAfterChildChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILD_CHANGE, null);
	}

	public void setAfterChildChange(java.lang.String afterChildChange) {
		getStateHelper().put(AFTER_CHILD_CHANGE, afterChildChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLargerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LARGER_NODE_CHANGE, null);
	}

	public void setAfterLargerNodeChange(java.lang.String afterLargerNodeChange) {
		getStateHelper().put(AFTER_LARGER_NODE_CHANGE, afterLargerNodeChange);
	}

	public java.lang.String getAfterSmallerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SMALLER_NODE_CHANGE, null);
	}

	public void setAfterSmallerNodeChange(java.lang.String afterSmallerNodeChange) {
		getStateHelper().put(AFTER_SMALLER_NODE_CHANGE, afterSmallerNodeChange);
	}

	public java.lang.String getAfterWordChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WORD_CHANGE, null);
	}

	public void setAfterWordChange(java.lang.String afterWordChange) {
		getStateHelper().put(AFTER_WORD_CHANGE, afterWordChange);
	}

	public java.lang.String getOnCharacterChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHARACTER_CHANGE, null);
	}

	public void setOnCharacterChange(java.lang.String onCharacterChange) {
		getStateHelper().put(ON_CHARACTER_CHANGE, onCharacterChange);
	}

	public java.lang.String getOnChildChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILD_CHANGE, null);
	}

	public void setOnChildChange(java.lang.String onChildChange) {
		getStateHelper().put(ON_CHILD_CHANGE, onChildChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLargerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LARGER_NODE_CHANGE, null);
	}

	public void setOnLargerNodeChange(java.lang.String onLargerNodeChange) {
		getStateHelper().put(ON_LARGER_NODE_CHANGE, onLargerNodeChange);
	}

	public java.lang.String getOnSmallerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SMALLER_NODE_CHANGE, null);
	}

	public void setOnSmallerNodeChange(java.lang.String onSmallerNodeChange) {
		getStateHelper().put(ON_SMALLER_NODE_CHANGE, onSmallerNodeChange);
	}

	public java.lang.String getOnWordChange() {
		return (java.lang.String) getStateHelper().eval(ON_WORD_CHANGE, null);
	}

	public void setOnWordChange(java.lang.String onWordChange) {
		getStateHelper().put(ON_WORD_CHANGE, onWordChange);
	}

}