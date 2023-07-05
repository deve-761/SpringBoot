package com.sudha;

public class User {

	private String uname;
	private String uqual;
	private String uage;
	private String uaddr;
	private String uemail;
	private String umobile;
	
	
	public User() {
		
	}
	
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUqual() {
		return uqual;
	}

	public void setUqual(String uqual) {
		this.uqual = uqual;
	}

	public String getUage() {
		return uage;
	}

	public void setUage(String uage) {
		this.uage = uage;
	}

	public String getUaddr() {
		return uaddr;
	}

	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	
	public void displayUserDetails() {
		System.out.println("User Details");
		System.out.println("=====================");
		System.out.println("User Name : "+uname);
		System.out.println("User Qualification : "+uqual);
		System.out.println("User Age : "+uage);
		System.out.println("User Address : "+uaddr);
		System.out.println("User Email : "+uemail);
		System.out.println("User Mobile : "+umobile);
	}
}
