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
package com.liferay.faces.alloy.component.parsecontent;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ParseContentBase extends javax.faces.component.UIPanel {

	private static final String QUEUE = "queue";
	private static final String AFTER_QUEUE_CHANGE = "afterQueueChange";
	private static final String ON_QUEUE_CHANGE = "onQueueChange";

	protected java.lang.Object getQueue() {
		return (java.lang.Object) getStateHelper().eval(QUEUE, null);
	}

	protected void setQueue(java.lang.Object queue) {
		getStateHelper().put(QUEUE, queue);
	}

	protected java.lang.String getAfterQueueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_QUEUE_CHANGE, null);
	}

	protected void setAfterQueueChange(java.lang.String afterQueueChange) {
		getStateHelper().put(AFTER_QUEUE_CHANGE, afterQueueChange);
	}

	protected java.lang.String getOnQueueChange() {
		return (java.lang.String) getStateHelper().eval(ON_QUEUE_CHANGE, null);
	}

	protected void setOnQueueChange(java.lang.String onQueueChange) {
		getStateHelper().put(ON_QUEUE_CHANGE, onQueueChange);
	}

}