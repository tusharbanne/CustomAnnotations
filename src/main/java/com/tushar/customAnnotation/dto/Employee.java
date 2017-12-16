package com.tushar.customAnnotation.dto;

import com.tushar.customAnnotation.util.NotNullOn;

@NotNullOn
public class Employee {

	private String name;
	
	private String lastName;
	
	private Long phNum;
	
	private Long empId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phNum
	 */
	public Long getPhNum() {
		return phNum;
	}

	/**
	 * @param phNum the phNum to set
	 */
	public void setPhNum(Long phNum) {
		this.phNum = phNum;
	}

	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	
}
