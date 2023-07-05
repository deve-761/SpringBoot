package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.mvc.dao.StudentDao;
import com.spring.mvc.dto.StudentTo;

public class StudentAction extends MultiActionController {

	StudentDao studentDao;
	String status = "";
	String message = "";

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		StudentTo sto = new StudentTo();
		sto.setSid(request.getParameter("sid"));
		sto.setSname(request.getParameter("sname"));
		sto.setSaddr(request.getParameter("saddr"));
		status = studentDao.add(sto);
		if (status.equals("success")) {
			message = "Student Added Successfully";
		}
		if (status.equals("failure")) {
			message = "Student Insertion failure";
		}
		if (status.equals("existed")) {
			message = "Student Existed Already";
		}

		return new ModelAndView("status", "message", message);
	}

	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		StudentTo sto = studentDao.search(sid);
		ModelAndView mav = null;
		if (sto == null) {
			mav = new ModelAndView("status", "message", "Student Not Existed");
		} else {
			mav = new ModelAndView("student", "sto", sto);
		}

		return mav;
	}

	public ModelAndView editform(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		StudentTo sto = studentDao.search(sid);
		ModelAndView mav = null;
		if (sto == null) {
			mav = new ModelAndView("status", "message", "Student Not Existed");
		} else {
			mav = new ModelAndView("editform", "sto", sto);
		}

		return mav;
	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		StudentTo sto = new StudentTo();
		sto.setSid(request.getParameter("sid"));
		sto.setSname(request.getParameter("sname"));
		sto.setSaddr(request.getParameter("saddr"));
		status = studentDao.update(sto);
		ModelAndView mav = null;
		if (status.equals("success")) {
			mav = new ModelAndView("status", "message", "Student Updation Success");
		} else {
			mav = new ModelAndView("status", "message", "Student Updation Failure");
		}

		return mav;
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		String status = studentDao.delete(sid);
		ModelAndView mav = null;
		if (status.equals("success")) {
			mav = new ModelAndView("status", "message", "Student Deleted Successfully");
		} else {
			mav = new ModelAndView("status", "message", "Student Deletion Failure");
		}

		return mav;
	}
}
