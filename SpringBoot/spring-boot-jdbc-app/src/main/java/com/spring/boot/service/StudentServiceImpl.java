package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.StudentDao;
import com.spring.boot.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public String add(Student sto) {
		String status = studentDao.add(sto);
		return status;
	}

	@Override
	public Student search(String sid) {
		Student std = studentDao.search(sid);
		return std;
	}

	@Override
	public String update(Student sto) {
		String status = studentDao.update(sto);
		return status;
	}

	@Override
	public String delete(String sid) {
		String status = studentDao.delete(sid);
		return status;
	}

}
