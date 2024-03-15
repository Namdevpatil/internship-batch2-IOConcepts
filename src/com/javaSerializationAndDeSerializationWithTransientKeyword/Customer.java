package com.javaSerializationAndDeSerializationWithTransientKeyword;

import java.io.Serializable;

public class Customer implements Serializable
{
	
	private static final long serialVersionUID = 1837L;
	
	//fields
	private int customerId;
	private String customerName;
	transient private String customerAddress;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}	

}
