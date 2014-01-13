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
package com.liferay.faces.alloy.component.formvalidator;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormValidatorBase extends javax.faces.component.UIPanel {

	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CONTAINER_ERROR_CLASS = "containerErrorClass";
	private static final String CONTAINER_VALID_CLASS = "containerValidClass";
	private static final String ERROR_CLASS = "errorClass";
	private static final String EXTRACT_RULES = "extractRules";
	private static final String FIELD_CONTAINER = "fieldContainer";
	private static final String FIELD_STRINGS = "fieldStrings";
	private static final String LABEL_CSS_CLASS = "labelCssClass";
	private static final String MESSAGE_CONTAINER = "messageContainer";
	private static final String RULES = "rules";
	private static final String SELECT_TEXT = "selectText";
	private static final String SHOW_ALL_MESSAGES = "showAllMessages";
	private static final String SHOW_MESSAGES = "showMessages";
	private static final String STACK_ERROR_CONTAINER = "stackErrorContainer";
	private static final String STRINGS = "strings";
	private static final String VALID_CLASS = "validClass";
	private static final String VALIDATE_ON_BLUR = "validateOnBlur";
	private static final String VALIDATE_ON_INPUT = "validateOnInput";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CONTAINER_ERROR_CLASS_CHANGE = "afterContainerErrorClassChange";
	private static final String AFTER_CONTAINER_VALID_CLASS_CHANGE = "afterContainerValidClassChange";
	private static final String AFTER_ERROR_CLASS_CHANGE = "afterErrorClassChange";
	private static final String AFTER_EXTRACT_RULES_CHANGE = "afterExtractRulesChange";
	private static final String AFTER_FIELD_CONTAINER_CHANGE = "afterFieldContainerChange";
	private static final String AFTER_FIELD_STRINGS_CHANGE = "afterFieldStringsChange";
	private static final String AFTER_LABEL_CSS_CLASS_CHANGE = "afterLabelCssClassChange";
	private static final String AFTER_MESSAGE_CONTAINER_CHANGE = "afterMessageContainerChange";
	private static final String AFTER_RULES_CHANGE = "afterRulesChange";
	private static final String AFTER_SELECT_TEXT_CHANGE = "afterSelectTextChange";
	private static final String AFTER_SHOW_ALL_MESSAGES_CHANGE = "afterShowAllMessagesChange";
	private static final String AFTER_SHOW_MESSAGES_CHANGE = "afterShowMessagesChange";
	private static final String AFTER_STACK_ERROR_CONTAINER_CHANGE = "afterStackErrorContainerChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_VALID_CLASS_CHANGE = "afterValidClassChange";
	private static final String AFTER_VALIDATE_ON_BLUR_CHANGE = "afterValidateOnBlurChange";
	private static final String AFTER_VALIDATE_ON_INPUT_CHANGE = "afterValidateOnInputChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CONTAINER_ERROR_CLASS_CHANGE = "onContainerErrorClassChange";
	private static final String ON_CONTAINER_VALID_CLASS_CHANGE = "onContainerValidClassChange";
	private static final String ON_ERROR_CLASS_CHANGE = "onErrorClassChange";
	private static final String ON_EXTRACT_RULES_CHANGE = "onExtractRulesChange";
	private static final String ON_FIELD_CONTAINER_CHANGE = "onFieldContainerChange";
	private static final String ON_FIELD_STRINGS_CHANGE = "onFieldStringsChange";
	private static final String ON_LABEL_CSS_CLASS_CHANGE = "onLabelCssClassChange";
	private static final String ON_MESSAGE_CONTAINER_CHANGE = "onMessageContainerChange";
	private static final String ON_RULES_CHANGE = "onRulesChange";
	private static final String ON_SELECT_TEXT_CHANGE = "onSelectTextChange";
	private static final String ON_SHOW_ALL_MESSAGES_CHANGE = "onShowAllMessagesChange";
	private static final String ON_SHOW_MESSAGES_CHANGE = "onShowMessagesChange";
	private static final String ON_STACK_ERROR_CONTAINER_CHANGE = "onStackErrorContainerChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_VALID_CLASS_CHANGE = "onValidClassChange";
	private static final String ON_VALIDATE_ON_BLUR_CHANGE = "onValidateOnBlurChange";
	private static final String ON_VALIDATE_ON_INPUT_CHANGE = "onValidateOnInputChange";

	protected java.lang.Object getBoundingBox() {
		return (java.lang.Object) getStateHelper().eval(BOUNDING_BOX, null);
	}

	protected void setBoundingBox(java.lang.Object boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	protected java.lang.String getContainerErrorClass() {
		return (java.lang.String) getStateHelper().eval(CONTAINER_ERROR_CLASS, null);
	}

	protected void setContainerErrorClass(java.lang.String containerErrorClass) {
		getStateHelper().put(CONTAINER_ERROR_CLASS, containerErrorClass);
	}

	protected java.lang.String getContainerValidClass() {
		return (java.lang.String) getStateHelper().eval(CONTAINER_VALID_CLASS, null);
	}

	protected void setContainerValidClass(java.lang.String containerValidClass) {
		getStateHelper().put(CONTAINER_VALID_CLASS, containerValidClass);
	}

	protected java.lang.String getErrorClass() {
		return (java.lang.String) getStateHelper().eval(ERROR_CLASS, null);
	}

	protected void setErrorClass(java.lang.String errorClass) {
		getStateHelper().put(ERROR_CLASS, errorClass);
	}

	protected java.lang.Boolean getExtractRules() {
		return (java.lang.Boolean) getStateHelper().eval(EXTRACT_RULES, null);
	}

	protected void setExtractRules(java.lang.Boolean extractRules) {
		getStateHelper().put(EXTRACT_RULES, extractRules);
	}

	protected java.lang.String getFieldContainer() {
		return (java.lang.String) getStateHelper().eval(FIELD_CONTAINER, null);
	}

	protected void setFieldContainer(java.lang.String fieldContainer) {
		getStateHelper().put(FIELD_CONTAINER, fieldContainer);
	}

	protected java.lang.Object getFieldStrings() {
		return (java.lang.Object) getStateHelper().eval(FIELD_STRINGS, null);
	}

	protected void setFieldStrings(java.lang.Object fieldStrings) {
		getStateHelper().put(FIELD_STRINGS, fieldStrings);
	}

	protected java.lang.String getLabelCssClass() {
		return (java.lang.String) getStateHelper().eval(LABEL_CSS_CLASS, null);
	}

	protected void setLabelCssClass(java.lang.String labelCssClass) {
		getStateHelper().put(LABEL_CSS_CLASS, labelCssClass);
	}

	protected java.lang.Object getMessageContainer() {
		return (java.lang.Object) getStateHelper().eval(MESSAGE_CONTAINER, null);
	}

	protected void setMessageContainer(java.lang.Object messageContainer) {
		getStateHelper().put(MESSAGE_CONTAINER, messageContainer);
	}

	protected java.lang.Object getRules() {
		return (java.lang.Object) getStateHelper().eval(RULES, null);
	}

	protected void setRules(java.lang.Object rules) {
		getStateHelper().put(RULES, rules);
	}

	protected java.lang.Boolean getSelectText() {
		return (java.lang.Boolean) getStateHelper().eval(SELECT_TEXT, null);
	}

	protected void setSelectText(java.lang.Boolean selectText) {
		getStateHelper().put(SELECT_TEXT, selectText);
	}

	protected java.lang.Boolean getShowAllMessages() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_ALL_MESSAGES, null);
	}

	protected void setShowAllMessages(java.lang.Boolean showAllMessages) {
		getStateHelper().put(SHOW_ALL_MESSAGES, showAllMessages);
	}

	protected java.lang.Boolean getShowMessages() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_MESSAGES, null);
	}

	protected void setShowMessages(java.lang.Boolean showMessages) {
		getStateHelper().put(SHOW_MESSAGES, showMessages);
	}

	protected java.lang.Object getStackErrorContainer() {
		return (java.lang.Object) getStateHelper().eval(STACK_ERROR_CONTAINER, null);
	}

	protected void setStackErrorContainer(java.lang.Object stackErrorContainer) {
		getStateHelper().put(STACK_ERROR_CONTAINER, stackErrorContainer);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.String getValidClass() {
		return (java.lang.String) getStateHelper().eval(VALID_CLASS, null);
	}

	protected void setValidClass(java.lang.String validClass) {
		getStateHelper().put(VALID_CLASS, validClass);
	}

	protected java.lang.Boolean getValidateOnBlur() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_ON_BLUR, null);
	}

	protected void setValidateOnBlur(java.lang.Boolean validateOnBlur) {
		getStateHelper().put(VALIDATE_ON_BLUR, validateOnBlur);
	}

	protected java.lang.Boolean getValidateOnInput() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_ON_INPUT, null);
	}

	protected void setValidateOnInput(java.lang.Boolean validateOnInput) {
		getStateHelper().put(VALIDATE_ON_INPUT, validateOnInput);
	}

	protected java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	protected void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	protected java.lang.String getAfterContainerErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_ERROR_CLASS_CHANGE, null);
	}

	protected void setAfterContainerErrorClassChange(java.lang.String afterContainerErrorClassChange) {
		getStateHelper().put(AFTER_CONTAINER_ERROR_CLASS_CHANGE, afterContainerErrorClassChange);
	}

	protected java.lang.String getAfterContainerValidClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_VALID_CLASS_CHANGE, null);
	}

	protected void setAfterContainerValidClassChange(java.lang.String afterContainerValidClassChange) {
		getStateHelper().put(AFTER_CONTAINER_VALID_CLASS_CHANGE, afterContainerValidClassChange);
	}

	protected java.lang.String getAfterErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ERROR_CLASS_CHANGE, null);
	}

	protected void setAfterErrorClassChange(java.lang.String afterErrorClassChange) {
		getStateHelper().put(AFTER_ERROR_CLASS_CHANGE, afterErrorClassChange);
	}

	protected java.lang.String getAfterExtractRulesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXTRACT_RULES_CHANGE, null);
	}

	protected void setAfterExtractRulesChange(java.lang.String afterExtractRulesChange) {
		getStateHelper().put(AFTER_EXTRACT_RULES_CHANGE, afterExtractRulesChange);
	}

	protected java.lang.String getAfterFieldContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELD_CONTAINER_CHANGE, null);
	}

	protected void setAfterFieldContainerChange(java.lang.String afterFieldContainerChange) {
		getStateHelper().put(AFTER_FIELD_CONTAINER_CHANGE, afterFieldContainerChange);
	}

	protected java.lang.String getAfterFieldStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELD_STRINGS_CHANGE, null);
	}

	protected void setAfterFieldStringsChange(java.lang.String afterFieldStringsChange) {
		getStateHelper().put(AFTER_FIELD_STRINGS_CHANGE, afterFieldStringsChange);
	}

	protected java.lang.String getAfterLabelCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterLabelCssClassChange(java.lang.String afterLabelCssClassChange) {
		getStateHelper().put(AFTER_LABEL_CSS_CLASS_CHANGE, afterLabelCssClassChange);
	}

	protected java.lang.String getAfterMessageContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MESSAGE_CONTAINER_CHANGE, null);
	}

	protected void setAfterMessageContainerChange(java.lang.String afterMessageContainerChange) {
		getStateHelper().put(AFTER_MESSAGE_CONTAINER_CHANGE, afterMessageContainerChange);
	}

	protected java.lang.String getAfterRulesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RULES_CHANGE, null);
	}

	protected void setAfterRulesChange(java.lang.String afterRulesChange) {
		getStateHelper().put(AFTER_RULES_CHANGE, afterRulesChange);
	}

	protected java.lang.String getAfterSelectTextChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECT_TEXT_CHANGE, null);
	}

	protected void setAfterSelectTextChange(java.lang.String afterSelectTextChange) {
		getStateHelper().put(AFTER_SELECT_TEXT_CHANGE, afterSelectTextChange);
	}

	protected java.lang.String getAfterShowAllMessagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_ALL_MESSAGES_CHANGE, null);
	}

	protected void setAfterShowAllMessagesChange(java.lang.String afterShowAllMessagesChange) {
		getStateHelper().put(AFTER_SHOW_ALL_MESSAGES_CHANGE, afterShowAllMessagesChange);
	}

	protected java.lang.String getAfterShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_MESSAGES_CHANGE, null);
	}

	protected void setAfterShowMessagesChange(java.lang.String afterShowMessagesChange) {
		getStateHelper().put(AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange);
	}

	protected java.lang.String getAfterStackErrorContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STACK_ERROR_CONTAINER_CHANGE, null);
	}

	protected void setAfterStackErrorContainerChange(java.lang.String afterStackErrorContainerChange) {
		getStateHelper().put(AFTER_STACK_ERROR_CONTAINER_CHANGE, afterStackErrorContainerChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterValidClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALID_CLASS_CHANGE, null);
	}

	protected void setAfterValidClassChange(java.lang.String afterValidClassChange) {
		getStateHelper().put(AFTER_VALID_CLASS_CHANGE, afterValidClassChange);
	}

	protected java.lang.String getAfterValidateOnBlurChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_ON_BLUR_CHANGE, null);
	}

	protected void setAfterValidateOnBlurChange(java.lang.String afterValidateOnBlurChange) {
		getStateHelper().put(AFTER_VALIDATE_ON_BLUR_CHANGE, afterValidateOnBlurChange);
	}

	protected java.lang.String getAfterValidateOnInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_ON_INPUT_CHANGE, null);
	}

	protected void setAfterValidateOnInputChange(java.lang.String afterValidateOnInputChange) {
		getStateHelper().put(AFTER_VALIDATE_ON_INPUT_CHANGE, afterValidateOnInputChange);
	}

	protected java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	protected void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	protected java.lang.String getOnContainerErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_ERROR_CLASS_CHANGE, null);
	}

	protected void setOnContainerErrorClassChange(java.lang.String onContainerErrorClassChange) {
		getStateHelper().put(ON_CONTAINER_ERROR_CLASS_CHANGE, onContainerErrorClassChange);
	}

	protected java.lang.String getOnContainerValidClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_VALID_CLASS_CHANGE, null);
	}

	protected void setOnContainerValidClassChange(java.lang.String onContainerValidClassChange) {
		getStateHelper().put(ON_CONTAINER_VALID_CLASS_CHANGE, onContainerValidClassChange);
	}

	protected java.lang.String getOnErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ERROR_CLASS_CHANGE, null);
	}

	protected void setOnErrorClassChange(java.lang.String onErrorClassChange) {
		getStateHelper().put(ON_ERROR_CLASS_CHANGE, onErrorClassChange);
	}

	protected java.lang.String getOnExtractRulesChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXTRACT_RULES_CHANGE, null);
	}

	protected void setOnExtractRulesChange(java.lang.String onExtractRulesChange) {
		getStateHelper().put(ON_EXTRACT_RULES_CHANGE, onExtractRulesChange);
	}

	protected java.lang.String getOnFieldContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELD_CONTAINER_CHANGE, null);
	}

	protected void setOnFieldContainerChange(java.lang.String onFieldContainerChange) {
		getStateHelper().put(ON_FIELD_CONTAINER_CHANGE, onFieldContainerChange);
	}

	protected java.lang.String getOnFieldStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELD_STRINGS_CHANGE, null);
	}

	protected void setOnFieldStringsChange(java.lang.String onFieldStringsChange) {
		getStateHelper().put(ON_FIELD_STRINGS_CHANGE, onFieldStringsChange);
	}

	protected java.lang.String getOnLabelCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CSS_CLASS_CHANGE, null);
	}

	protected void setOnLabelCssClassChange(java.lang.String onLabelCssClassChange) {
		getStateHelper().put(ON_LABEL_CSS_CLASS_CHANGE, onLabelCssClassChange);
	}

	protected java.lang.String getOnMessageContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_MESSAGE_CONTAINER_CHANGE, null);
	}

	protected void setOnMessageContainerChange(java.lang.String onMessageContainerChange) {
		getStateHelper().put(ON_MESSAGE_CONTAINER_CHANGE, onMessageContainerChange);
	}

	protected java.lang.String getOnRulesChange() {
		return (java.lang.String) getStateHelper().eval(ON_RULES_CHANGE, null);
	}

	protected void setOnRulesChange(java.lang.String onRulesChange) {
		getStateHelper().put(ON_RULES_CHANGE, onRulesChange);
	}

	protected java.lang.String getOnSelectTextChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECT_TEXT_CHANGE, null);
	}

	protected void setOnSelectTextChange(java.lang.String onSelectTextChange) {
		getStateHelper().put(ON_SELECT_TEXT_CHANGE, onSelectTextChange);
	}

	protected java.lang.String getOnShowAllMessagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_ALL_MESSAGES_CHANGE, null);
	}

	protected void setOnShowAllMessagesChange(java.lang.String onShowAllMessagesChange) {
		getStateHelper().put(ON_SHOW_ALL_MESSAGES_CHANGE, onShowAllMessagesChange);
	}

	protected java.lang.String getOnShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_MESSAGES_CHANGE, null);
	}

	protected void setOnShowMessagesChange(java.lang.String onShowMessagesChange) {
		getStateHelper().put(ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange);
	}

	protected java.lang.String getOnStackErrorContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_STACK_ERROR_CONTAINER_CHANGE, null);
	}

	protected void setOnStackErrorContainerChange(java.lang.String onStackErrorContainerChange) {
		getStateHelper().put(ON_STACK_ERROR_CONTAINER_CHANGE, onStackErrorContainerChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnValidClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALID_CLASS_CHANGE, null);
	}

	protected void setOnValidClassChange(java.lang.String onValidClassChange) {
		getStateHelper().put(ON_VALID_CLASS_CHANGE, onValidClassChange);
	}

	protected java.lang.String getOnValidateOnBlurChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_ON_BLUR_CHANGE, null);
	}

	protected void setOnValidateOnBlurChange(java.lang.String onValidateOnBlurChange) {
		getStateHelper().put(ON_VALIDATE_ON_BLUR_CHANGE, onValidateOnBlurChange);
	}

	protected java.lang.String getOnValidateOnInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_ON_INPUT_CHANGE, null);
	}

	protected void setOnValidateOnInputChange(java.lang.String onValidateOnInputChange) {
		getStateHelper().put(ON_VALIDATE_ON_INPUT_CHANGE, onValidateOnInputChange);
	}

}