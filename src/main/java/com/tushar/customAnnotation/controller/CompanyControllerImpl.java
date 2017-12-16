package com.tushar.customAnnotation.controller;

import org.springframework.stereotype.Service;

import com.tushar.customAnnotation.dto.Department;


@Service
public class CompanyControllerImpl{

	public String getEmployeeDetails(Department department) {
		String s = "Validated";
		return s;
	}

}
