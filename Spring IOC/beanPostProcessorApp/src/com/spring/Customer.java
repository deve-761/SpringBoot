package com.spring;

public class Customer {

	private String cid;
	private String cname;
	private String caddr;
	private String cemail;
	private String cmobile;

	public Customer() {
		System.out.println("Customer bean Object Creating.......");
	}

	public void init() {
		System.out.println("Customer bean Object Initialization through init().......");
	}

	public void destroy() {
		System.out.println("Customer bean Object destroying through destroy().......");
	}

	public void getCustomerData() {
		System.out.println("Customer Details");
		System.out.println("======================");
		System.out.println("Customer Id: " + cid);
		System.out.println("Customer Name: " + cname);
		System.out.println("Customer Address: " + caddr);
		System.out.println("Customer Email: " + cemail);
		System.out.println("Customer Mobile: " + cmobile);
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCMobile() {
		return cmobile;
	}

	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}

}
