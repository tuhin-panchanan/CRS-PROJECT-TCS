/**
 * 
 */
package com.tcs.service;

import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ASUS
 *
 */
public interface StudentServiceInterface {
	public void addStudent(Long studentId,String studentName,String studentDept) throws StudentNotRegisteredException; 
	
	public int getStudentId(String userId);
	
	   public boolean isApproved(int studentId);

}