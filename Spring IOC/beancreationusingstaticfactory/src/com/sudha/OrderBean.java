package com.sudha;

public class OrderBean {

	public static OrderBean getInstance() {
		System.out.println("Static Factory MEthod");
		return new OrderBean();
	}

	public String getOrderMessage() {
		return "Order Information";
	}
}
