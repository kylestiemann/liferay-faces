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
package com.liferay.faces.alloy.component.treeviewio;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewIOBase extends javax.faces.component.UIPanel {

	public static final String IO = "io";
	public static final String AFTER_IO_CHANGE = "afterIoChange";
	public static final String ON_IO_CHANGE = "onIoChange";

	public java.lang.Object getIo() {
		return (java.lang.Object) getStateHelper().eval(IO, null);
	}

	public void setIo(java.lang.Object io) {
		getStateHelper().put(IO, io);
	}

	public java.lang.String getAfterIoChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IO_CHANGE, null);
	}

	public void setAfterIoChange(java.lang.String afterIoChange) {
		getStateHelper().put(AFTER_IO_CHANGE, afterIoChange);
	}

	public java.lang.String getOnIoChange() {
		return (java.lang.String) getStateHelper().eval(ON_IO_CHANGE, null);
	}

	public void setOnIoChange(java.lang.String onIoChange) {
		getStateHelper().put(ON_IO_CHANGE, onIoChange);
	}

}