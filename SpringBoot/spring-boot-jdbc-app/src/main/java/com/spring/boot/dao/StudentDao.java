package com.spring.boot.dao;

import com.spring.boot.entity.Student;

public interface StudentDao {

	public String add(Student sto);

	public Student search(String sid);

	public String update(Student sto);

	public String delete(String sid);
}
