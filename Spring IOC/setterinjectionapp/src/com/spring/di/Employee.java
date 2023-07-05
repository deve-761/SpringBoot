package com.spring.di;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	private Account account;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("==================");
		System.out.println("Employee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" + esal);
		System.out.println("Employee Address:" + eaddr);
		System.out.println("Account Details");
		System.out.println("==================");
		System.out.println("Account Number:" + account.getAccNo());
		System.out.println("Account Name:" + account.getAccName());
		System.out.println("Account Type:" + account.getAccType());
		System.out.println("Account Balance:" + account.getBalance());
	}
}
