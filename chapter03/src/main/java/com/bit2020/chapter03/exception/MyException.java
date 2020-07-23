package com.bit2020.chapter03.exception;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public MyException() {
			super("MyException Occured");
		}
		
		public MyException(String massage) {
			super(massage);
		}
}
