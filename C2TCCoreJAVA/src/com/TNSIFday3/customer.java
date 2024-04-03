package com.TNSIFday3;
//Entity class
public class customer {
	
	private int customerID;
	private String customerName;
	private String customerCity;
	
	//default constructor
	public customer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Hello, I am a default constructor! ");
	}
	@Override
	public String toString() {
		return "customer [customerID=" + customerID + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	public customer(int customerID, String customerName, String customerCity) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	

}
