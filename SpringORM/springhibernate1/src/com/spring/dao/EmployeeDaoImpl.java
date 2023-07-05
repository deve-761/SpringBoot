package com.spring.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public String insert(Employee emp) {
		String status = "";
		try {
			Employee emp1 = (Employee) hibernateTemplate.get(Employee.class, emp.getEno());
			if (emp1 != null) {
				status = "Employee Already Existed";
			} else {
				int eno = (Integer) hibernateTemplate.save(emp);
				if (eno == emp.getEno()) {
					status = "Employee Inserted Successfully";
				} else {
					status = "Employee Insertion Failure";
				}
			}
		} catch (Exception e) {
			status = "Employee Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public Employee search(int eno) {
		Employee emp = null;

		try {
			emp = (Employee) hibernateTemplate.get(Employee.class, eno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Transactional
	@Override
	public String update(Employee emp) {
		String status = "";
		try {
			Employee emp1 = search(emp.getEno());
			if (emp1 == null) {
				status = "Employee not Existed";
			} else {
				hibernateTemplate.evict(emp1);
				hibernateTemplate.update(emp);
				status = "Employee Updation Sucess";
			}

		} catch (Exception e) {
			status = "Employee Updation Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public String delete(Employee emp) {
		String status = "";
		try {
			Employee emp1 = search(emp.getEno());
			if (emp1 == null) {
				status = "Employee not Existed";
			} else {
				hibernateTemplate.evict(emp1);
				hibernateTemplate.delete(emp);
				status = "Employee Deletion Sucess";
			}

		} catch (Exception e) {
			status = "Employee Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

}
