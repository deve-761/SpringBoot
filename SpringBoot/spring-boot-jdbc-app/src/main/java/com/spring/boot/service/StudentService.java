package com.spring.boot.service;

import com.spring.boot.entity.Student;

public interface StudentService {

	public String add(Student sto);

	public Student search(String sid);

	public String update(Student sto);

	public String delete(String sid);
}
