/**
 * 
 */
package com.tcs.dao;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ASUS
 *
 */
public interface StudentDAOInterface {
	public boolean addStudent(Student student) throws StudentNotRegisteredException;
	
public int getStudentId(String userId);
	
	public boolean isApproved(int studentId);
}