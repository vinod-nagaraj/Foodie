package com.healthy.foodie.exception;

public class UserNotFoundException  extends Exception{
	
	private static final long serialVersionUID = 1L;

	 public UserNotFoundException(String exception) {
		
		super(exception);
	}

}
