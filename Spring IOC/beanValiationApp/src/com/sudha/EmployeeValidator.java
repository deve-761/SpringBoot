package com.sudha;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidator implements Validator {

	private Resource resource;

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class type) {
		System.out.println("spring Validation App");
		return Employee.class.equals(type);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		try {
			System.out.println("Inside validate() method");
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
			Employee emp = (Employee) obj;
			if (emp.getEid() == null || emp.getEid() == "") {
				errors.rejectValue("eid", "error.eid.empty", prop.getProperty("error.eid.empty"));
			} else {
				if (!emp.getEid().startsWith("E-")) {
					errors.rejectValue("eid", "error.eid.invalid", prop.getProperty("error.eid.invalid"));
				}
			}

			if (emp.getEname() == null || emp.getEname() == "") {
				errors.rejectValue("ename", "error.ename.empty", prop.getProperty("error.ename.empty"));
			}

			if (emp.getEsal() <= 0.0f) {
				errors.rejectValue("esal", "error.esal.invalid", prop.getProperty("error.esal.invalid"));
			}

			if (emp.getEage() < 18) {
				errors.rejectValue("eage", "error.eage.minage", prop.getProperty("error.eage.minage"));
			} else if (emp.getEage() > 30) {
				errors.rejectValue("eage", "error.eage.maxage", prop.getProperty("error.eage.maxage"));
			}

			if (emp.getEemail() == null || emp.getEemail() == "") {
				errors.rejectValue("eemail", "error.email.empty", prop.getProperty("error.email.empty"));
			} else {
				if (!emp.getEemail().endsWith("@sudha.tech")) {
					errors.rejectValue("eemail", "error.email.invalid", prop.getProperty("error.email.invalid"));
				}
			}

			if (emp.getEmobile() == null || emp.getEmobile() == "") {
				errors.rejectValue("emobile", "error.emobile.empty", prop.getProperty("error.emobile.empty"));
			} else {
				if (!emp.getEmobile().startsWith("91-")) {
					errors.rejectValue("emobile", "error.emobile.invalid", prop.getProperty("error.emobile.invalid"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
