package com.spring.di;

public class Order {

	private String orderId;
	private String orderLoc;
	private String orderName;
	private Product product;
	private Customer customer;

	/*
	 * public Order(String orderId, String orderLoc, String orderName, Product
	 * product, Customer customer) { this.orderId = orderId; this.orderLoc =
	 * orderLoc; this.orderName = orderName; this.product = product; this.customer =
	 * customer; }
	 */

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderLoc() {
		return orderLoc;
	}

	public void setOrderLoc(String orderLoc) {
		this.orderLoc = orderLoc;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public void getOrderDetails() {
		System.out.println("Order Details");
		System.out.println("---------------");
		System.out.println("Order Id :" + orderId);
		System.out.println("Order Location :" + orderLoc);
		System.out.println("Order Name :" + orderName);
		System.out.println();
		System.out.println("Order Product Details");
		System.out.println("-----------------------");
		System.out.println("Product Id:" + product.getProductId());
		System.out.println("Product Name:" + product.getProductName());
		System.out.println("Product Quantity:" + product.getProductQuantity());
		System.out.println("Product Category:" + product.getProductCategory());
		System.out.println("Order Customer Details");
		System.out.println("-----------------------");
		System.out.println("Customer Id:" + customer.getCid());
		System.out.println("Customer Name:" + customer.getCname());
		System.out.println("Customer Address:" + customer.getCaddr());
		System.out.println("Customer Mobile:" + customer.getCmobile());
	}
}
