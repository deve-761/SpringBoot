package com.spring.mvc.dao;

import com.spring.mvc.dto.StudentTo;

public interface StudentDao {

	public String add(StudentTo sto);

	public StudentTo search(String sid);

	public String update(StudentTo sto);

	public String delete(String sid);
}
