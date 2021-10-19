/**
 * 
 */
package com.tcs.exception;

/**
 * @author ASUS
 *
 */
public class UserNotFoundException {
	
	private String userId;

	/***
	 * Getter function for UserId
	 * @param userId
	 */
	public UserNotFoundException(String userId) {
		this.userId = userId;
	}

	/**
	 * Message thrown by exception
	 */
	public String getMessage() {
		return "User with userId: " + userId + " not found.";
	}

}
