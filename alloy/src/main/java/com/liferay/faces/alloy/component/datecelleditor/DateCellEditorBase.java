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
package com.liferay.faces.alloy.component.datecelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DateCellEditorBase extends javax.faces.component.UIPanel {

	private static final String DATECELLEDITOR_BODY_CONTENT = "datecelleditorBodyContent";
	private static final String CALENDAR = "calendar";
	private static final String DATE_FORMAT = "dateFormat";
	private static final String INPUT_FORMATTER = "inputFormatter";
	private static final String OUTPUT_FORMATTER = "outputFormatter";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_CALENDAR_CHANGE = "afterCalendarChange";
	private static final String AFTER_DATE_FORMAT_CHANGE = "afterDateFormatChange";
	private static final String AFTER_INPUT_FORMATTER_CHANGE = "afterInputFormatterChange";
	private static final String AFTER_OUTPUT_FORMATTER_CHANGE = "afterOutputFormatterChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_CALENDAR_CHANGE = "onCalendarChange";
	private static final String ON_DATE_FORMAT_CHANGE = "onDateFormatChange";
	private static final String ON_INPUT_FORMATTER_CHANGE = "onInputFormatterChange";
	private static final String ON_OUTPUT_FORMATTER_CHANGE = "onOutputFormatterChange";

	protected java.lang.String getDatecelleditorBodyContent() {
		return (java.lang.String) getStateHelper().eval(DATECELLEDITOR_BODY_CONTENT, null);
	}

	protected void setDatecelleditorBodyContent(java.lang.String datecelleditorBodyContent) {
		getStateHelper().put(DATECELLEDITOR_BODY_CONTENT, datecelleditorBodyContent);
	}

	protected java.lang.Object getCalendar() {
		return (java.lang.Object) getStateHelper().eval(CALENDAR, null);
	}

	protected void setCalendar(java.lang.Object calendar) {
		getStateHelper().put(CALENDAR, calendar);
	}

	protected java.lang.String getDateFormat() {
		return (java.lang.String) getStateHelper().eval(DATE_FORMAT, null);
	}

	protected void setDateFormat(java.lang.String dateFormat) {
		getStateHelper().put(DATE_FORMAT, dateFormat);
	}

	protected java.lang.Object getInputFormatter() {
		return (java.lang.Object) getStateHelper().eval(INPUT_FORMATTER, null);
	}

	protected void setInputFormatter(java.lang.Object inputFormatter) {
		getStateHelper().put(INPUT_FORMATTER, inputFormatter);
	}

	protected java.lang.Object getOutputFormatter() {
		return (java.lang.Object) getStateHelper().eval(OUTPUT_FORMATTER, null);
	}

	protected void setOutputFormatter(java.lang.Object outputFormatter) {
		getStateHelper().put(OUTPUT_FORMATTER, outputFormatter);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterCalendarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CALENDAR_CHANGE, null);
	}

	protected void setAfterCalendarChange(java.lang.String afterCalendarChange) {
		getStateHelper().put(AFTER_CALENDAR_CHANGE, afterCalendarChange);
	}

	protected java.lang.String getAfterDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_FORMAT_CHANGE, null);
	}

	protected void setAfterDateFormatChange(java.lang.String afterDateFormatChange) {
		getStateHelper().put(AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange);
	}

	protected java.lang.String getAfterInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_FORMATTER_CHANGE, null);
	}

	protected void setAfterInputFormatterChange(java.lang.String afterInputFormatterChange) {
		getStateHelper().put(AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange);
	}

	protected java.lang.String getAfterOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OUTPUT_FORMATTER_CHANGE, null);
	}

	protected void setAfterOutputFormatterChange(java.lang.String afterOutputFormatterChange) {
		getStateHelper().put(AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnCalendarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CALENDAR_CHANGE, null);
	}

	protected void setOnCalendarChange(java.lang.String onCalendarChange) {
		getStateHelper().put(ON_CALENDAR_CHANGE, onCalendarChange);
	}

	protected java.lang.String getOnDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_FORMAT_CHANGE, null);
	}

	protected void setOnDateFormatChange(java.lang.String onDateFormatChange) {
		getStateHelper().put(ON_DATE_FORMAT_CHANGE, onDateFormatChange);
	}

	protected java.lang.String getOnInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_FORMATTER_CHANGE, null);
	}

	protected void setOnInputFormatterChange(java.lang.String onInputFormatterChange) {
		getStateHelper().put(ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange);
	}

	protected java.lang.String getOnOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_OUTPUT_FORMATTER_CHANGE, null);
	}

	protected void setOnOutputFormatterChange(java.lang.String onOutputFormatterChange) {
		getStateHelper().put(ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange);
	}

}