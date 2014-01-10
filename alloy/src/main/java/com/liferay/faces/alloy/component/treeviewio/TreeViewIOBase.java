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
package com.liferay.faces.alloy.component.treeviewio;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewIOBase extends javax.faces.component.UIPanel {

	private static final String IO = "io";
	private static final String AFTER_IO_CHANGE = "afterIoChange";
	private static final String ON_IO_CHANGE = "onIoChange";

	protected java.lang.Object getIo() {
		return (java.lang.Object) getStateHelper().eval(IO, null);
	}

	protected void setIo(java.lang.Object io) {
		getStateHelper().put(IO, io);
	}

	protected java.lang.String getAfterIoChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IO_CHANGE, null);
	}

	protected void setAfterIoChange(java.lang.String afterIoChange) {
		getStateHelper().put(AFTER_IO_CHANGE, afterIoChange);
	}

	protected java.lang.String getOnIoChange() {
		return (java.lang.String) getStateHelper().eval(ON_IO_CHANGE, null);
	}

	protected void setOnIoChange(java.lang.String onIoChange) {
		getStateHelper().put(ON_IO_CHANGE, onIoChange);
	}

}