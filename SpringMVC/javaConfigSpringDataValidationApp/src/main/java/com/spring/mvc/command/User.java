package com.spring.mvc.command;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@NotEmpty(message="User Name is Required")
	private String uname;

	@NotEmpty(message = "User Password is Required")
	@Size(max = 10, min = 6)
	private String upwd;

	@NotNull(message="User is Required")
	//@Range(min = 18, max = 20)
	@Range(min = 18, max = 20,message="User Password must be minimum {2} characters and maximum {1} characters")
	private int uage;

	@NotNull(message="User Date Of Birth is Required")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past(message="User DOB must be past date")
	private Date udob;

	@NotEmpty(message = "User Email ID is Required")
	@Email
	private String uemail;

	@NotEmpty(message = "User Mobile No is Required")
	@Pattern(regexp = "91-[0-9]{10}",message = "User Mobile No must be in the pattern like 91-DDDDDDDDDD format")
	private String umobile;

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

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
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

	public Date getUdob() {
		return udob;
	}

	public void setUdob(Date udob) {
		this.udob = udob;
	}

}
