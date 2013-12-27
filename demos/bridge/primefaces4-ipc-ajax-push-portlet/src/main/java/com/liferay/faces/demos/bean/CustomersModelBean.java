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
package com.liferay.faces.demos.bean;

import java.util.List;

import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletSession;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

import com.liferay.faces.demos.dto.Customer;
import com.liferay.faces.demos.service.CustomerService;
import com.liferay.faces.demos.util.PortletSessionUtil;


/**
 * @author  Neil Griffin
 */
@ManagedBean(name = "customersModelBean")
@ViewScoped
public class CustomersModelBean {

	// Private Constants
	private static final String CUSTOMER_RENDER_GROUP = "CUSTOMER_RENDER_GROUP";

	// Injections
	@ManagedProperty(name = "customerService", value = "#{customerService}")
	private CustomerService customerService;
	
	private Customer customer;
	private List<Customer> allCustomers;

//	public CustomersModelBean() {
//		PushRenderer.addCurrentSession(CUSTOMER_RENDER_GROUP);
//	}

//	@PreDestroy
//	public void preDestroy() {
//		PushRenderer.removeCurrentSession(CUSTOMER_RENDER_GROUP);
//	}

	public String getChannel() {
		return "/selected";
	}
	
	protected PortletSession getPortletSession() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		return (PortletSession) facesContext.getExternalContext().getSession(
				false);
	}

	public void valueChangeListener(ValueChangeEvent valueChangeEvent) {
		PushContext pushContext = PushContextFactory.getDefault().getPushContext();
		pushContext.push(getChannel(), getSelected().getFirstName().toString());
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		if (allCustomers == null) {
			this.allCustomers = customerService.getAllCustomers();
		}

		return allCustomers;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {

		// Injected via ManagedProperty annotation
		this.customerService = customerService;
	}

	public Customer getSelected() {
		return customer;
	}

	public void setSelected(Customer customer) {
		this.customer = customer;
		PushContext pushContext = PushContextFactory.getDefault().getPushContext();
		pushContext.push(getChannel(), customer.getFirstName().toString());
	}
}
