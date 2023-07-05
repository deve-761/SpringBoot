package com.spring.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String sid;
	private String sname;
	private Address saddr;
	private List<String> squal;
	private Set<String> scourses;
	private Map<String, String> courseFaculty;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getSaddr() {
		return saddr;
	}

	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}

	public List<String> getSqual() {
		return squal;
	}

	public void setSqual(List<String> squal) {
		this.squal = squal;
	}

	public Set<String> getScourses() {
		return scourses;
	}

	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}

	public Map<String, String> getCourseFaculty() {
		return courseFaculty;
	}

	public void setCourseFaculty(Map<String, String> courseFaculty) {
		this.courseFaculty = courseFaculty;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("==================");
		System.out.println("Studnet Id:" + sid);
		System.out.println("Student Name:" + sname);
		System.out.println("Student  Address:" + saddr);
		System.out.println("Student Qualification:" + squal);
		System.out.println("Student Courses : " + scourses);
		System.out.println("Student Course Faculty : " + courseFaculty);
	}
}
