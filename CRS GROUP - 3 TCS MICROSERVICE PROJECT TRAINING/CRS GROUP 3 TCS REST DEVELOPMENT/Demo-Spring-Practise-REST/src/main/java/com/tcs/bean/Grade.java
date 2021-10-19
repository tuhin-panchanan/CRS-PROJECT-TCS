/**
 * 
 */
package com.tcs.bean;

/**
 * @author ASUS
 *
 */
public class Grade {
	
	private String grade;
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return StudentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return Branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		Branch = branch;
	}
	/**
	 * @return the batch
	 */
	public int getBatch() {
		return Batch;
	}
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(int batch) {
		Batch = batch;
	}
	private int StudentId;
	private String Branch;
	private int Batch;
	

}
