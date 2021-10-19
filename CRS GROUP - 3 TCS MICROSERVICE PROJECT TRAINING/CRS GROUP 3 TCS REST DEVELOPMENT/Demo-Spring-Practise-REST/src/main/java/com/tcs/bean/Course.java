/**
 * 
 */
package com.tcs.bean;

/**
 * @author ASUS
 *
 */
public class Course {
	
	private String courseCode;
	private String courseName;
	private boolean CourseOffered;
	private String instructorId;
	/**
	 * @return the instructorId
	 */
	public String getInstructorId() {
		return instructorId;
	}
	/**
	 * @param instructorId the instructorId to set
	 */
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseOffered
	 */
	public boolean isCourseOffered() {
		return CourseOffered;
	}
	/**
	 * @param courseOffered the courseOffered to set
	 */
	public void setCourseOffered(boolean courseOffered) {
		CourseOffered = courseOffered;
	}
	

}
