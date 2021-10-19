/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Admin;

/**
 * @author ASUS
 *
 */
public interface AdminDAOInterface {
	
	public Admin addProfessor();
	public Admin assignCourse();
	public Admin approveStudent();
	public Admin deleteCourse();
	
	

}
