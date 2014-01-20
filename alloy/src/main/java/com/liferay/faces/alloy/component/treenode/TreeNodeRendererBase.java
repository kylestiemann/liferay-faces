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
package com.liferay.faces.alloy.component.treenode;

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
public abstract class TreeNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNode treeNode = (TreeNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNode = new A.TreeNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (treeNode.getAlwaysShowHitArea() != null) {
			renderAlwaysShowHitArea(renderedAttributes, treeNode);
		}
		
		if (treeNode.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, treeNode);
		}
		
		if (treeNode.getTreeNodeChildren() != null) {
			renderTreeNodeChildren(renderedAttributes, treeNode);
		}
		
		if (treeNode.getContainer() != null) {
			renderContainer(renderedAttributes, treeNode);
		}
		
		if (treeNode.getContentBox() != null) {
			renderContentBox(renderedAttributes, treeNode);
		}
		
		if (treeNode.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, treeNode);
		}
		
		if (treeNode.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeNode);
		}
		
		if (treeNode.getDraggable() != null) {
			renderDraggable(renderedAttributes, treeNode);
		}
		
		if (treeNode.getExpanded() != null) {
			renderExpanded(renderedAttributes, treeNode);
		}
		
		if (treeNode.getHitAreaEl() != null) {
			renderHitAreaEl(renderedAttributes, treeNode);
		}
		
		if (treeNode.getIconEl() != null) {
			renderIconEl(renderedAttributes, treeNode);
		}
		
		if (treeNode.getTreeNodeId() != null) {
			renderTreeNodeId(renderedAttributes, treeNode);
		}
		
		if (treeNode.getIndex() != null) {
			renderIndex(renderedAttributes, treeNode);
		}
		
		if (treeNode.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeNode);
		}
		
		if (treeNode.getLabel() != null) {
			renderLabel(renderedAttributes, treeNode);
		}
		
		if (treeNode.getLabelEl() != null) {
			renderLabelEl(renderedAttributes, treeNode);
		}
		
		if (treeNode.getLeaf() != null) {
			renderLeaf(renderedAttributes, treeNode);
		}
		
		if (treeNode.getNextSibling() != null) {
			renderNextSibling(renderedAttributes, treeNode);
		}
		
		if (treeNode.getOwnerTree() != null) {
			renderOwnerTree(renderedAttributes, treeNode);
		}
		
		if (treeNode.getParentNode() != null) {
			renderParentNode(renderedAttributes, treeNode);
		}
		
		if (treeNode.getPrevSibling() != null) {
			renderPrevSibling(renderedAttributes, treeNode);
		}
		
		if (treeNode.getRendered() != null) {
			renderRendered(renderedAttributes, treeNode);
		}
		
		if (treeNode.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, treeNode);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeNode.getAfterAlwaysShowHitAreaChange() != null) {
			renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterHitAreaElChange() != null) {
			renderAfterHitAreaElChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterIconElChange() != null) {
			renderAfterIconElChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterLabelElChange() != null) {
			renderAfterLabelElChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterLeafChange() != null) {
			renderAfterLeafChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterNextSiblingChange() != null) {
			renderAfterNextSiblingChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterOwnerTreeChange() != null) {
			renderAfterOwnerTreeChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterParentNodeChange() != null) {
			renderAfterParentNodeChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterPrevSiblingChange() != null) {
			renderAfterPrevSiblingChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, treeNode);
		}
		
		if (treeNode.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, treeNode);
		}
		

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

		if (treeNode.getOnAlwaysShowHitAreaChange() != null) {
			renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnHitAreaElChange() != null) {
			renderOnHitAreaElChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnIconElChange() != null) {
			renderOnIconElChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnLabelElChange() != null) {
			renderOnLabelElChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnLeafChange() != null) {
			renderOnLeafChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnNextSiblingChange() != null) {
			renderOnNextSiblingChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnOwnerTreeChange() != null) {
			renderOnOwnerTreeChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnParentNodeChange() != null) {
			renderOnParentNodeChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnPrevSiblingChange() != null) {
			renderOnPrevSiblingChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, treeNode);
		}
		
		if (treeNode.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, treeNode);
		}
		

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNode.getAlwaysShowHitArea();
		renderedAttributes.add(renderBoolean(TreeNode.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String boundingBox = treeNode.getBoundingBox();
		renderedAttributes.add(renderString(TreeNode.BOUNDING_BOX, boundingBox));
	}

	protected void renderTreeNodeChildren(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object treeNodeChildren = treeNode.getTreeNodeChildren();
		renderedAttributes.add(renderArray(TreeNode.TREE_NODE_CHILDREN, treeNodeChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String container = treeNode.getContainer();
		renderedAttributes.add(renderString(TreeNode.CONTAINER, container));
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String contentBox = treeNode.getContentBox();
		renderedAttributes.add(renderString(TreeNode.CONTENT_BOX, contentBox));
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object cssClasses = treeNode.getCssClasses();
		renderedAttributes.add(renderObject(TreeNode.CSS_CLASSES, cssClasses));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean destroyed = treeNode.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeNode.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean draggable = treeNode.getDraggable();
		renderedAttributes.add(renderBoolean(TreeNode.DRAGGABLE, draggable));
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean expanded = treeNode.getExpanded();
		renderedAttributes.add(renderBoolean(TreeNode.EXPANDED, expanded));
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String hitAreaEl = treeNode.getHitAreaEl();
		renderedAttributes.add(renderString(TreeNode.HIT_AREA_EL, hitAreaEl));
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String iconEl = treeNode.getIconEl();
		renderedAttributes.add(renderString(TreeNode.ICON_EL, iconEl));
	}

	protected void renderTreeNodeId(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String treeNodeId = treeNode.getTreeNodeId();
		renderedAttributes.add(renderString(TreeNode.TREE_NODE_ID, treeNodeId));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object index = treeNode.getIndex();
		renderedAttributes.add(renderObject(TreeNode.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean initialized = treeNode.getInitialized();
		renderedAttributes.add(renderBoolean(TreeNode.INITIALIZED, initialized));
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String label = treeNode.getLabel();
		renderedAttributes.add(renderString(TreeNode.LABEL, label));
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String labelEl = treeNode.getLabelEl();
		renderedAttributes.add(renderString(TreeNode.LABEL_EL, labelEl));
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean leaf = treeNode.getLeaf();
		renderedAttributes.add(renderBoolean(TreeNode.LEAF, leaf));
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object nextSibling = treeNode.getNextSibling();
		renderedAttributes.add(renderString(TreeNode.NEXT_SIBLING, nextSibling));
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object ownerTree = treeNode.getOwnerTree();
		renderedAttributes.add(renderString(TreeNode.OWNER_TREE, ownerTree));
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object parentNode = treeNode.getParentNode();
		renderedAttributes.add(renderString(TreeNode.PARENT_NODE, parentNode));
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object prevSibling = treeNode.getPrevSibling();
		renderedAttributes.add(renderString(TreeNode.PREV_SIBLING, prevSibling));
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean rendered = treeNode.getRendered();
		renderedAttributes.add(renderBoolean(TreeNode.RENDERED, rendered));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String tabIndex = treeNode.getTabIndex();
		renderedAttributes.add(renderString(TreeNode.TAB_INDEX, tabIndex));
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNode.getAfterAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNode.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterChildrenChange = treeNode.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterContainerChange = treeNode.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterContentBoxChange = treeNode.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterCssClassesChange = treeNode.getAfterCssClassesChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterDestroyedChange = treeNode.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterDraggableChange = treeNode.getAfterDraggableChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterExpandedChange = treeNode.getAfterExpandedChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterHitAreaElChange = treeNode.getAfterHitAreaElChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIconElChange = treeNode.getAfterIconElChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_ICON_EL_CHANGE, afterIconElChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIdChange = treeNode.getAfterIdChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIndexChange = treeNode.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterInitializedChange = treeNode.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLabelChange = treeNode.getAfterLabelChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLabelElChange = treeNode.getAfterLabelElChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLeafChange = treeNode.getAfterLeafChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_LEAF_CHANGE, afterLeafChange));
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterNextSiblingChange = treeNode.getAfterNextSiblingChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNode.getAfterOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterParentNodeChange = treeNode.getAfterParentNodeChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNode.getAfterPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterRenderedChange = treeNode.getAfterRenderedChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterTabIndexChange = treeNode.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TreeNode.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNode.getOnAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNode.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onBoundingBoxChange = treeNode.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNode.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onChildrenChange = treeNode.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeNode.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onContainerChange = treeNode.getOnContainerChange();
		renderedAttributes.add(renderString(TreeNode.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onContentBoxChange = treeNode.getOnContentBoxChange();
		renderedAttributes.add(renderString(TreeNode.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onCssClassesChange = treeNode.getOnCssClassesChange();
		renderedAttributes.add(renderString(TreeNode.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onDestroyedChange = treeNode.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeNode.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onDraggableChange = treeNode.getOnDraggableChange();
		renderedAttributes.add(renderString(TreeNode.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onExpandedChange = treeNode.getOnExpandedChange();
		renderedAttributes.add(renderString(TreeNode.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onHitAreaElChange = treeNode.getOnHitAreaElChange();
		renderedAttributes.add(renderString(TreeNode.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIconElChange = treeNode.getOnIconElChange();
		renderedAttributes.add(renderString(TreeNode.ON_ICON_EL_CHANGE, onIconElChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIdChange = treeNode.getOnIdChange();
		renderedAttributes.add(renderString(TreeNode.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIndexChange = treeNode.getOnIndexChange();
		renderedAttributes.add(renderString(TreeNode.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onInitializedChange = treeNode.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeNode.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLabelChange = treeNode.getOnLabelChange();
		renderedAttributes.add(renderString(TreeNode.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLabelElChange = treeNode.getOnLabelElChange();
		renderedAttributes.add(renderString(TreeNode.ON_LABEL_EL_CHANGE, onLabelElChange));
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLeafChange = treeNode.getOnLeafChange();
		renderedAttributes.add(renderString(TreeNode.ON_LEAF_CHANGE, onLeafChange));
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onNextSiblingChange = treeNode.getOnNextSiblingChange();
		renderedAttributes.add(renderString(TreeNode.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onOwnerTreeChange = treeNode.getOnOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNode.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onParentNodeChange = treeNode.getOnParentNodeChange();
		renderedAttributes.add(renderString(TreeNode.ON_PARENT_NODE_CHANGE, onParentNodeChange));
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onPrevSiblingChange = treeNode.getOnPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNode.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onRenderedChange = treeNode.getOnRenderedChange();
		renderedAttributes.add(renderString(TreeNode.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onTabIndexChange = treeNode.getOnTabIndexChange();
		renderedAttributes.add(renderString(TreeNode.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}