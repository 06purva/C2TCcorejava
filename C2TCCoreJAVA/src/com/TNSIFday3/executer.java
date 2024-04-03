package com.TNSIFday3;

import java.util.Scanner;

public class executer {
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Customer ID: ");
	int id = sc.nextInt();
	
	System.out.println("Enter Customer Name: ");
    String name = sc.next();
	
	System.out.println("Enter Customer city: ");
	String city = sc.next();

//    customer c1=new customer();
//    c1.setCustomerID(id);
//    c1.setCustomerCity(city);
//    c1.setCustomerName(name);
//	  System.out.println("Customer Details: "+c1);
	
	 customer c2=new customer(id,name,city);
	 System.out.println("Customer Details: "+c2);
	}
	

	
}
