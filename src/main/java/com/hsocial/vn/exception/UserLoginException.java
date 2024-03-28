package com.hsocial.vn.exception;

public class UserLoginException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserLoginException(String message) {
		super(message);
		this.message = message;
	}
	
	

}
