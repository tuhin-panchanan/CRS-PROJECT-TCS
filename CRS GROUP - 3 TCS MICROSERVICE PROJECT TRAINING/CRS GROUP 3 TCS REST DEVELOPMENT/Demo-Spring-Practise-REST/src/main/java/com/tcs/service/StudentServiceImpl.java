/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterface;
import com.tcs.exception.StudentNotRegisteredException;

/**
 * @author ASUS
 *
 */
@Component
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	private StudentDAOInterface students;
	
	@Override
	public void addStudent(Long studentId, String studentName, String studentDept)
			throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		
		try
		{
			//call the DAO class, and add the student record to the DB
			Student newStudent=new Student(studentId,studentName,studentDept);
			students.addStudent(newStudent);
			
		}
		catch(StudentNotRegisteredException ex)
		{
			throw ex;
		}
		
	}

	@Override
	public int getStudentId(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isApproved(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}