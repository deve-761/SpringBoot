package com.spring.mvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.mvc.dto.StudentTo;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	String status = "";

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String add(StudentTo sto) {
		String query1 = "select * from student where SID ='" + sto.getSid() + "'";
		List<StudentTo> stdList = jdbcTemplate.query(query1, (resultSet, i) -> {
			StudentTo std = new StudentTo();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (stdList.isEmpty()) {
			String query2 = "insert into student values('" + sto.getSid() + "','" + sto.getSname() + "','"
					+ sto.getSaddr() + "')";
			int rowCount = jdbcTemplate.update(query2);
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}
		} else {
			status = "existed";
		}
		return status;
	}

	@Override
	public StudentTo search(String sid) {
		StudentTo sto = null;
		String query1 = "select * from student where SID ='" + sid + "'";
		List<StudentTo> stdList = jdbcTemplate.query(query1, (resultSet, i) -> {
			StudentTo std = new StudentTo();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (stdList.isEmpty()) {
			sto = null;
		} else {
			sto = stdList.get(0);
		}
		return sto;
	}

	@Override
	public String update(StudentTo sto) {
		String query = "update student set SNAME = '" + sto.getSname() + "',SADDR ='" + sto.getSaddr()
				+ "' where SID = '" + sto.getSid() + "'";
		int rowCount = jdbcTemplate.update(query);
		if (rowCount == 1) {
			status = "success";
		} else {
			status = "failure";
		}

		return status;
	}

	@Override
	public String delete(String sid) {
		String query1 = "select * from student where SID ='" + sid + "'";
		List<StudentTo> stdList = jdbcTemplate.query(query1, (resultSet, i) -> {
			StudentTo std = new StudentTo();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (stdList.isEmpty()) {
			status = "notexisted";
		} else {
			String query2 = "delete from student where SID = '" + sid + "'";
			int rowCount = jdbcTemplate.update(query2);
			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}
		}
		return status;
	}

}
