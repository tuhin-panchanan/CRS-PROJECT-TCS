/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Student;
import com.tcs.constant.SQLQueriesConstants;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.util.DBUtils;

/**
 * @author Aniket
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAOInterface {

	@Override
	public boolean addStudent(Student student) throws StudentNotRegisteredException {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
		try {
			// open db connection
			PreparedStatement preparedStatement = connection.prepareStatement(SQLQueriesConstants.ADD_STUDENT);
			preparedStatement.setLong(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentDept());
			

		} catch (Exception ex) {
			throw new StudentNotRegisteredException(student.getStudentName());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage() + "SQL error");
				e.printStackTrace();
			}
		}
		return true;
		
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