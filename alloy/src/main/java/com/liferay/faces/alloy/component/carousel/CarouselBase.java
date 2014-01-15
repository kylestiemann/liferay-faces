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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class CarouselBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_INDEX = "activeIndex";
	private static final String ANIMATION_TIME = "animationTime";
	private static final String HIDE_CLASS = "hideClass";
	private static final String INTERVAL_TIME = "intervalTime";
	private static final String ITEM_SELECTOR = "itemSelector";
	private static final String NODE_MENU = "nodeMenu";
	private static final String NODE_MENU_ITEM_SELECTOR = "nodeMenuItemSelector";
	private static final String PLAYING = "playing";
	private static final String RENDER = "render";
	private static final String USE_ARIA = "useARIA";
	private static final String AFTER_ACTIVE_INDEX_CHANGE = "afterActiveIndexChange";
	private static final String AFTER_ANIMATION_TIME_CHANGE = "afterAnimationTimeChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_INTERVAL_TIME_CHANGE = "afterIntervalTimeChange";
	private static final String AFTER_ITEM_SELECTOR_CHANGE = "afterItemSelectorChange";
	private static final String AFTER_NODE_MENU_CHANGE = "afterNodeMenuChange";
	private static final String AFTER_NODE_MENU_ITEM_SELECTOR_CHANGE = "afterNodeMenuItemSelectorChange";
	private static final String AFTER_PLAYING_CHANGE = "afterPlayingChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String ON_ACTIVE_INDEX_CHANGE = "onActiveIndexChange";
	private static final String ON_ANIMATION_TIME_CHANGE = "onAnimationTimeChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_INTERVAL_TIME_CHANGE = "onIntervalTimeChange";
	private static final String ON_ITEM_SELECTOR_CHANGE = "onItemSelectorChange";
	private static final String ON_NODE_MENU_CHANGE = "onNodeMenuChange";
	private static final String ON_NODE_MENU_ITEM_SELECTOR_CHANGE = "onNodeMenuItemSelectorChange";
	private static final String ON_PLAYING_CHANGE = "onPlayingChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";

	public java.lang.Object getActiveIndex() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_INDEX, null);
	}

	public void setActiveIndex(java.lang.Object activeIndex) {
		getStateHelper().put(ACTIVE_INDEX, activeIndex);
	}

	public java.lang.Object getAnimationTime() {
		return (java.lang.Object) getStateHelper().eval(ANIMATION_TIME, null);
	}

	public void setAnimationTime(java.lang.Object animationTime) {
		getStateHelper().put(ANIMATION_TIME, animationTime);
	}

	public java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	public void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	public java.lang.Object getIntervalTime() {
		return (java.lang.Object) getStateHelper().eval(INTERVAL_TIME, null);
	}

	public void setIntervalTime(java.lang.Object intervalTime) {
		getStateHelper().put(INTERVAL_TIME, intervalTime);
	}

	public java.lang.String getItemSelector() {
		return (java.lang.String) getStateHelper().eval(ITEM_SELECTOR, null);
	}

	public void setItemSelector(java.lang.String itemSelector) {
		getStateHelper().put(ITEM_SELECTOR, itemSelector);
	}

	public java.lang.String getNodeMenu() {
		return (java.lang.String) getStateHelper().eval(NODE_MENU, null);
	}

	public void setNodeMenu(java.lang.String nodeMenu) {
		getStateHelper().put(NODE_MENU, nodeMenu);
	}

	public java.lang.String getNodeMenuItemSelector() {
		return (java.lang.String) getStateHelper().eval(NODE_MENU_ITEM_SELECTOR, null);
	}

	public void setNodeMenuItemSelector(java.lang.String nodeMenuItemSelector) {
		getStateHelper().put(NODE_MENU_ITEM_SELECTOR, nodeMenuItemSelector);
	}

	public java.lang.Boolean getPlaying() {
		return (java.lang.Boolean) getStateHelper().eval(PLAYING, null);
	}

	public void setPlaying(java.lang.Boolean playing) {
		getStateHelper().put(PLAYING, playing);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	public java.lang.String getAfterActiveIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_INDEX_CHANGE, null);
	}

	public void setAfterActiveIndexChange(java.lang.String afterActiveIndexChange) {
		getStateHelper().put(AFTER_ACTIVE_INDEX_CHANGE, afterActiveIndexChange);
	}

	public java.lang.String getAfterAnimationTimeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ANIMATION_TIME_CHANGE, null);
	}

	public void setAfterAnimationTimeChange(java.lang.String afterAnimationTimeChange) {
		getStateHelper().put(AFTER_ANIMATION_TIME_CHANGE, afterAnimationTimeChange);
	}

	public java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	public java.lang.String getAfterIntervalTimeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INTERVAL_TIME_CHANGE, null);
	}

	public void setAfterIntervalTimeChange(java.lang.String afterIntervalTimeChange) {
		getStateHelper().put(AFTER_INTERVAL_TIME_CHANGE, afterIntervalTimeChange);
	}

	public java.lang.String getAfterItemSelectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ITEM_SELECTOR_CHANGE, null);
	}

	public void setAfterItemSelectorChange(java.lang.String afterItemSelectorChange) {
		getStateHelper().put(AFTER_ITEM_SELECTOR_CHANGE, afterItemSelectorChange);
	}

	public java.lang.String getAfterNodeMenuChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_MENU_CHANGE, null);
	}

	public void setAfterNodeMenuChange(java.lang.String afterNodeMenuChange) {
		getStateHelper().put(AFTER_NODE_MENU_CHANGE, afterNodeMenuChange);
	}

	public java.lang.String getAfterNodeMenuItemSelectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_MENU_ITEM_SELECTOR_CHANGE, null);
	}

	public void setAfterNodeMenuItemSelectorChange(java.lang.String afterNodeMenuItemSelectorChange) {
		getStateHelper().put(AFTER_NODE_MENU_ITEM_SELECTOR_CHANGE, afterNodeMenuItemSelectorChange);
	}

	public java.lang.String getAfterPlayingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PLAYING_CHANGE, null);
	}

	public void setAfterPlayingChange(java.lang.String afterPlayingChange) {
		getStateHelper().put(AFTER_PLAYING_CHANGE, afterPlayingChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	public java.lang.String getOnActiveIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_INDEX_CHANGE, null);
	}

	public void setOnActiveIndexChange(java.lang.String onActiveIndexChange) {
		getStateHelper().put(ON_ACTIVE_INDEX_CHANGE, onActiveIndexChange);
	}

	public java.lang.String getOnAnimationTimeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ANIMATION_TIME_CHANGE, null);
	}

	public void setOnAnimationTimeChange(java.lang.String onAnimationTimeChange) {
		getStateHelper().put(ON_ANIMATION_TIME_CHANGE, onAnimationTimeChange);
	}

	public java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	public java.lang.String getOnIntervalTimeChange() {
		return (java.lang.String) getStateHelper().eval(ON_INTERVAL_TIME_CHANGE, null);
	}

	public void setOnIntervalTimeChange(java.lang.String onIntervalTimeChange) {
		getStateHelper().put(ON_INTERVAL_TIME_CHANGE, onIntervalTimeChange);
	}

	public java.lang.String getOnItemSelectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_ITEM_SELECTOR_CHANGE, null);
	}

	public void setOnItemSelectorChange(java.lang.String onItemSelectorChange) {
		getStateHelper().put(ON_ITEM_SELECTOR_CHANGE, onItemSelectorChange);
	}

	public java.lang.String getOnNodeMenuChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_MENU_CHANGE, null);
	}

	public void setOnNodeMenuChange(java.lang.String onNodeMenuChange) {
		getStateHelper().put(ON_NODE_MENU_CHANGE, onNodeMenuChange);
	}

	public java.lang.String getOnNodeMenuItemSelectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_MENU_ITEM_SELECTOR_CHANGE, null);
	}

	public void setOnNodeMenuItemSelectorChange(java.lang.String onNodeMenuItemSelectorChange) {
		getStateHelper().put(ON_NODE_MENU_ITEM_SELECTOR_CHANGE, onNodeMenuItemSelectorChange);
	}

	public java.lang.String getOnPlayingChange() {
		return (java.lang.String) getStateHelper().eval(ON_PLAYING_CHANGE, null);
	}

	public void setOnPlayingChange(java.lang.String onPlayingChange) {
		getStateHelper().put(ON_PLAYING_CHANGE, onPlayingChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

}