package com.spring.mvc.command;

public class User {

	private String uname;
	private String upwd;
	private boolean maritalStatus1;
	private String maritalStatus2;
	private String[] uqual;
	private String ugender;
	private String uworkLocation;
	private String uskillSet;
	private String[] uhobbies;
	private String uprofession;
	private String uaddr;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public boolean isMaritalStatus1() {
		return maritalStatus1;
	}

	public void setMaritalStatus1(boolean maritalStatus1) {
		this.maritalStatus1 = maritalStatus1;
	}

	public String getMaritalStatus2() {
		if (maritalStatus2 == null || maritalStatus2.equals("")) {
			maritalStatus2 = "Married";
		}
		return maritalStatus2;
	}

	public void setMaritalStatus2(String maritalStatus2) {
		this.maritalStatus2 = maritalStatus2;
	}

	public String[] getUqual() {
		return uqual;
	}

	public void setUqual(String[] uqual) {
		this.uqual = uqual;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public String getUworkLocation() {
		return uworkLocation;
	}

	public void setUworkLocation(String uworkLocation) {
		this.uworkLocation = uworkLocation;
	}

	public String getUskillSet() {
		return uskillSet;
	}

	public void setUskillSet(String uskillSet) {
		this.uskillSet = uskillSet;
	}

	public String[] getUhobbies() {
		return uhobbies;
	}

	public void setUhobbies(String[] uhobbies) {
		this.uhobbies = uhobbies;
	}

	public String getUprofession() {
		return uprofession;
	}

	public void setUprofession(String uprofession) {
		this.uprofession = uprofession;
	}

	public String getUaddr() {
		return uaddr;
	}

	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}

}
