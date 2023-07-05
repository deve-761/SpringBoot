package com.sudha;

public class ProductBeanFactory {

	public ProductBean getInstance() {
		System.out.println("Instance Factory Method");
		return new ProductBean();
	}
}
