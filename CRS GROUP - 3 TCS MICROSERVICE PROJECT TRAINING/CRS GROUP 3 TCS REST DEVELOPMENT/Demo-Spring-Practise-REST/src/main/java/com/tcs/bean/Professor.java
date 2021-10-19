/**
 * 
 */
package com.tcs.bean;

import java.sql.Date;

/**
 * @author ASUS
 *
 */
public class Professor {
	
	private String department;
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the dOJ
	 */
	public Date getDOJ() {
		return DOJ;
	}
	/**
	 * @param dOJ the dOJ to set
	 */
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	private String designation;
	private Date DOJ;

}
