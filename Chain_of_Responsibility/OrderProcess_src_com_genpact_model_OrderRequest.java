package com.genpact.model;

public class OrderRequest {
	
	long orderId;
	String phoneNumber;
	String emailAddress;
	
	
	@Override
	public String toString() {
		return " [orderId=" + orderId + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ "]";
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
