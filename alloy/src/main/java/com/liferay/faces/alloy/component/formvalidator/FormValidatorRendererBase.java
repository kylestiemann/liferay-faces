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
public abstract class FormValidatorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-validator";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormValidator formValidator = (FormValidator) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formValidator = new A.FormValidator");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, formValidator);
		renderContainerErrorClass(renderedAttributes, formValidator);
		renderContainerValidClass(renderedAttributes, formValidator);
		renderDestroyed(renderedAttributes, formValidator);
		renderErrorClass(renderedAttributes, formValidator);
		renderExtractRules(renderedAttributes, formValidator);
		renderFieldContainer(renderedAttributes, formValidator);
		renderFieldStrings(renderedAttributes, formValidator);
		renderInitialized(renderedAttributes, formValidator);
		renderLabelCssClass(renderedAttributes, formValidator);
		renderMessageContainer(renderedAttributes, formValidator);
		renderRules(renderedAttributes, formValidator);
		renderSelectText(renderedAttributes, formValidator);
		renderShowAllMessages(renderedAttributes, formValidator);
		renderShowMessages(renderedAttributes, formValidator);
		renderStackErrorContainer(renderedAttributes, formValidator);
		renderStrings(renderedAttributes, formValidator);
		renderValidClass(renderedAttributes, formValidator);
		renderValidateOnBlur(renderedAttributes, formValidator);
		renderValidateOnInput(renderedAttributes, formValidator);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, formValidator);
		renderAfterContainerErrorClassChange(renderedAfterEvents, formValidator);
		renderAfterContainerValidClassChange(renderedAfterEvents, formValidator);
		renderAfterDestroyedChange(renderedAfterEvents, formValidator);
		renderAfterErrorClassChange(renderedAfterEvents, formValidator);
		renderAfterExtractRulesChange(renderedAfterEvents, formValidator);
		renderAfterFieldContainerChange(renderedAfterEvents, formValidator);
		renderAfterFieldStringsChange(renderedAfterEvents, formValidator);
		renderAfterInitializedChange(renderedAfterEvents, formValidator);
		renderAfterLabelCssClassChange(renderedAfterEvents, formValidator);
		renderAfterMessageContainerChange(renderedAfterEvents, formValidator);
		renderAfterRulesChange(renderedAfterEvents, formValidator);
		renderAfterSelectTextChange(renderedAfterEvents, formValidator);
		renderAfterShowAllMessagesChange(renderedAfterEvents, formValidator);
		renderAfterShowMessagesChange(renderedAfterEvents, formValidator);
		renderAfterStackErrorContainerChange(renderedAfterEvents, formValidator);
		renderAfterStringsChange(renderedAfterEvents, formValidator);
		renderAfterValidClassChange(renderedAfterEvents, formValidator);
		renderAfterValidateOnBlurChange(renderedAfterEvents, formValidator);
		renderAfterValidateOnInputChange(renderedAfterEvents, formValidator);

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

		renderOnBoundingBoxChange(renderedOnEvents, formValidator);
		renderOnContainerErrorClassChange(renderedOnEvents, formValidator);
		renderOnContainerValidClassChange(renderedOnEvents, formValidator);
		renderOnDestroyedChange(renderedOnEvents, formValidator);
		renderOnErrorClassChange(renderedOnEvents, formValidator);
		renderOnExtractRulesChange(renderedOnEvents, formValidator);
		renderOnFieldContainerChange(renderedOnEvents, formValidator);
		renderOnFieldStringsChange(renderedOnEvents, formValidator);
		renderOnInitializedChange(renderedOnEvents, formValidator);
		renderOnLabelCssClassChange(renderedOnEvents, formValidator);
		renderOnMessageContainerChange(renderedOnEvents, formValidator);
		renderOnRulesChange(renderedOnEvents, formValidator);
		renderOnSelectTextChange(renderedOnEvents, formValidator);
		renderOnShowAllMessagesChange(renderedOnEvents, formValidator);
		renderOnShowMessagesChange(renderedOnEvents, formValidator);
		renderOnStackErrorContainerChange(renderedOnEvents, formValidator);
		renderOnStringsChange(renderedOnEvents, formValidator);
		renderOnValidClassChange(renderedOnEvents, formValidator);
		renderOnValidateOnBlurChange(renderedOnEvents, formValidator);
		renderOnValidateOnInputChange(renderedOnEvents, formValidator);

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

	protected void renderBoundingBox(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String boundingBox = formValidator.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(FormValidator.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContainerErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerErrorClass = formValidator.getContainerErrorClass();

		if (containerErrorClass != null) {
			renderedAttributes.add(renderString(FormValidator.CONTAINER_ERROR_CLASS, containerErrorClass));
		}
	}

	protected void renderContainerValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerValidClass = formValidator.getContainerValidClass();

		if (containerValidClass != null) {
			renderedAttributes.add(renderString(FormValidator.CONTAINER_VALID_CLASS, containerValidClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean destroyed = formValidator.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(FormValidator.DESTROYED, destroyed));
		}
	}

	protected void renderErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String errorClass = formValidator.getErrorClass();

		if (errorClass != null) {
			renderedAttributes.add(renderString(FormValidator.ERROR_CLASS, errorClass));
		}
	}

	protected void renderExtractRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean extractRules = formValidator.getExtractRules();

		if (extractRules != null) {
			renderedAttributes.add(renderBoolean(FormValidator.EXTRACT_RULES, extractRules));
		}
	}

	protected void renderFieldContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String fieldContainer = formValidator.getFieldContainer();

		if (fieldContainer != null) {
			renderedAttributes.add(renderString(FormValidator.FIELD_CONTAINER, fieldContainer));
		}
	}

	protected void renderFieldStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object fieldStrings = formValidator.getFieldStrings();

		if (fieldStrings != null) {
			renderedAttributes.add(renderObject(FormValidator.FIELD_STRINGS, fieldStrings));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean initialized = formValidator.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(FormValidator.INITIALIZED, initialized));
		}
	}

	protected void renderLabelCssClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String labelCssClass = formValidator.getLabelCssClass();

		if (labelCssClass != null) {
			renderedAttributes.add(renderString(FormValidator.LABEL_CSS_CLASS, labelCssClass));
		}
	}

	protected void renderMessageContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String messageContainer = formValidator.getMessageContainer();

		if (messageContainer != null) {
			renderedAttributes.add(renderString(FormValidator.MESSAGE_CONTAINER, messageContainer));
		}
	}

	protected void renderRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object rules = formValidator.getRules();

		if (rules != null) {
			renderedAttributes.add(renderObject(FormValidator.RULES, rules));
		}
	}

	protected void renderSelectText(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean selectText = formValidator.getSelectText();

		if (selectText != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SELECT_TEXT, selectText));
		}
	}

	protected void renderShowAllMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showAllMessages = formValidator.getShowAllMessages();

		if (showAllMessages != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SHOW_ALL_MESSAGES, showAllMessages));
		}
	}

	protected void renderShowMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showMessages = formValidator.getShowMessages();

		if (showMessages != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SHOW_MESSAGES, showMessages));
		}
	}

	protected void renderStackErrorContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String stackErrorContainer = formValidator.getStackErrorContainer();

		if (stackErrorContainer != null) {
			renderedAttributes.add(renderString(FormValidator.STACK_ERROR_CONTAINER, stackErrorContainer));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String strings = formValidator.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(FormValidator.STRINGS, strings));
		}
	}

	protected void renderValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String validClass = formValidator.getValidClass();

		if (validClass != null) {
			renderedAttributes.add(renderString(FormValidator.VALID_CLASS, validClass));
		}
	}

	protected void renderValidateOnBlur(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnBlur = formValidator.getValidateOnBlur();

		if (validateOnBlur != null) {
			renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_BLUR, validateOnBlur));
		}
	}

	protected void renderValidateOnInput(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnInput = formValidator.getValidateOnInput();

		if (validateOnInput != null) {
			renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_INPUT, validateOnInput));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterBoundingBoxChange = formValidator.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContainerErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterContainerErrorClassChange = formValidator.getAfterContainerErrorClassChange();

		if (afterContainerErrorClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_CONTAINER_ERROR_CLASS_CHANGE, afterContainerErrorClassChange));
		}
	}

	protected void renderAfterContainerValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterContainerValidClassChange = formValidator.getAfterContainerValidClassChange();

		if (afterContainerValidClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_CONTAINER_VALID_CLASS_CHANGE, afterContainerValidClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterDestroyedChange = formValidator.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterErrorClassChange = formValidator.getAfterErrorClassChange();

		if (afterErrorClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_ERROR_CLASS_CHANGE, afterErrorClassChange));
		}
	}

	protected void renderAfterExtractRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterExtractRulesChange = formValidator.getAfterExtractRulesChange();

		if (afterExtractRulesChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_EXTRACT_RULES_CHANGE, afterExtractRulesChange));
		}
	}

	protected void renderAfterFieldContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterFieldContainerChange = formValidator.getAfterFieldContainerChange();

		if (afterFieldContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_FIELD_CONTAINER_CHANGE, afterFieldContainerChange));
		}
	}

	protected void renderAfterFieldStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterFieldStringsChange = formValidator.getAfterFieldStringsChange();

		if (afterFieldStringsChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_FIELD_STRINGS_CHANGE, afterFieldStringsChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterInitializedChange = formValidator.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLabelCssClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterLabelCssClassChange = formValidator.getAfterLabelCssClassChange();

		if (afterLabelCssClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_LABEL_CSS_CLASS_CHANGE, afterLabelCssClassChange));
		}
	}

	protected void renderAfterMessageContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterMessageContainerChange = formValidator.getAfterMessageContainerChange();

		if (afterMessageContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_MESSAGE_CONTAINER_CHANGE, afterMessageContainerChange));
		}
	}

	protected void renderAfterRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterRulesChange = formValidator.getAfterRulesChange();

		if (afterRulesChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_RULES_CHANGE, afterRulesChange));
		}
	}

	protected void renderAfterSelectTextChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterSelectTextChange = formValidator.getAfterSelectTextChange();

		if (afterSelectTextChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_SELECT_TEXT_CHANGE, afterSelectTextChange));
		}
	}

	protected void renderAfterShowAllMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterShowAllMessagesChange = formValidator.getAfterShowAllMessagesChange();

		if (afterShowAllMessagesChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_SHOW_ALL_MESSAGES_CHANGE, afterShowAllMessagesChange));
		}
	}

	protected void renderAfterShowMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterShowMessagesChange = formValidator.getAfterShowMessagesChange();

		if (afterShowMessagesChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange));
		}
	}

	protected void renderAfterStackErrorContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterStackErrorContainerChange = formValidator.getAfterStackErrorContainerChange();

		if (afterStackErrorContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_STACK_ERROR_CONTAINER_CHANGE, afterStackErrorContainerChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterStringsChange = formValidator.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidClassChange = formValidator.getAfterValidClassChange();

		if (afterValidClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_VALID_CLASS_CHANGE, afterValidClassChange));
		}
	}

	protected void renderAfterValidateOnBlurChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidateOnBlurChange = formValidator.getAfterValidateOnBlurChange();

		if (afterValidateOnBlurChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_VALIDATE_ON_BLUR_CHANGE, afterValidateOnBlurChange));
		}
	}

	protected void renderAfterValidateOnInputChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidateOnInputChange = formValidator.getAfterValidateOnInputChange();

		if (afterValidateOnInputChange != null) {
			renderedAttributes.add(renderString(FormValidator.AFTER_VALIDATE_ON_INPUT_CHANGE, afterValidateOnInputChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onBoundingBoxChange = formValidator.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContainerErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onContainerErrorClassChange = formValidator.getOnContainerErrorClassChange();

		if (onContainerErrorClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_CONTAINER_ERROR_CLASS_CHANGE, onContainerErrorClassChange));
		}
	}

	protected void renderOnContainerValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onContainerValidClassChange = formValidator.getOnContainerValidClassChange();

		if (onContainerValidClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_CONTAINER_VALID_CLASS_CHANGE, onContainerValidClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onDestroyedChange = formValidator.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onErrorClassChange = formValidator.getOnErrorClassChange();

		if (onErrorClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_ERROR_CLASS_CHANGE, onErrorClassChange));
		}
	}

	protected void renderOnExtractRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onExtractRulesChange = formValidator.getOnExtractRulesChange();

		if (onExtractRulesChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_EXTRACT_RULES_CHANGE, onExtractRulesChange));
		}
	}

	protected void renderOnFieldContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onFieldContainerChange = formValidator.getOnFieldContainerChange();

		if (onFieldContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_FIELD_CONTAINER_CHANGE, onFieldContainerChange));
		}
	}

	protected void renderOnFieldStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onFieldStringsChange = formValidator.getOnFieldStringsChange();

		if (onFieldStringsChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_FIELD_STRINGS_CHANGE, onFieldStringsChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onInitializedChange = formValidator.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLabelCssClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onLabelCssClassChange = formValidator.getOnLabelCssClassChange();

		if (onLabelCssClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_LABEL_CSS_CLASS_CHANGE, onLabelCssClassChange));
		}
	}

	protected void renderOnMessageContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onMessageContainerChange = formValidator.getOnMessageContainerChange();

		if (onMessageContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_MESSAGE_CONTAINER_CHANGE, onMessageContainerChange));
		}
	}

	protected void renderOnRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onRulesChange = formValidator.getOnRulesChange();

		if (onRulesChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_RULES_CHANGE, onRulesChange));
		}
	}

	protected void renderOnSelectTextChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onSelectTextChange = formValidator.getOnSelectTextChange();

		if (onSelectTextChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_SELECT_TEXT_CHANGE, onSelectTextChange));
		}
	}

	protected void renderOnShowAllMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onShowAllMessagesChange = formValidator.getOnShowAllMessagesChange();

		if (onShowAllMessagesChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_SHOW_ALL_MESSAGES_CHANGE, onShowAllMessagesChange));
		}
	}

	protected void renderOnShowMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onShowMessagesChange = formValidator.getOnShowMessagesChange();

		if (onShowMessagesChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange));
		}
	}

	protected void renderOnStackErrorContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onStackErrorContainerChange = formValidator.getOnStackErrorContainerChange();

		if (onStackErrorContainerChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_STACK_ERROR_CONTAINER_CHANGE, onStackErrorContainerChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onStringsChange = formValidator.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidClassChange = formValidator.getOnValidClassChange();

		if (onValidClassChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_VALID_CLASS_CHANGE, onValidClassChange));
		}
	}

	protected void renderOnValidateOnBlurChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidateOnBlurChange = formValidator.getOnValidateOnBlurChange();

		if (onValidateOnBlurChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_VALIDATE_ON_BLUR_CHANGE, onValidateOnBlurChange));
		}
	}

	protected void renderOnValidateOnInputChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidateOnInputChange = formValidator.getOnValidateOnInputChange();

		if (onValidateOnInputChange != null) {
			renderedAttributes.add(renderString(FormValidator.ON_VALIDATE_ON_INPUT_CHANGE, onValidateOnInputChange));
		}
	}

}