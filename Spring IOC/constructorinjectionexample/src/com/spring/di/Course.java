package com.spring.di;

public class Course {

	private String cid;
	private String cname;
	private int ccost;
	
	public Course(String cid,String cname,int ccost) {
	   this.cid=cid;
	   this.cname=cname;
	   this.ccost=ccost;
	}

	protected String getCid() {
		return cid;
	}

	protected void setCid(String cid) {
		this.cid = cid;
	}

	protected String getCname() {
		return cname;
	}

	protected void setCname(String cname) {
		this.cname = cname;
	}

	protected int getCcost() {
		return ccost;
	}

	protected void setCcost(int ccost) {
		this.ccost = ccost;
	}

	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("---------------");
		System.out.println("Course Id: "+cid);
		System.out.println("Course Name: "+cname);
		System.out.println("Course Cost: "+ccost);
	}
}
