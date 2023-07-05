package com.sudha;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private int eage;
	private String eemail;
	private String emobile;

	public void getEmployeeDetails() {
		System.out.println("Employee Information");
		System.out.println("=========================");
		System.out.println("Employee Number :" + eid);
		System.out.println("Employee Name :" + ename);
		System.out.println("Employee Salary :" + esal);
		System.out.println("Employee age :" + eage);
		System.out.println("Employee Email :" + eemail);
		System.out.println("Employee Mobile :" + emobile);
	}

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

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public String getEmobile() {
		return emobile;
	}

	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eage=" + eage + ", eemail=" + eemail
				+ ", emobile=" + emobile + "]";
	}

}
