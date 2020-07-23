package com.bit2020.chapter03.exception;

import java.io.IOException;

public class MyClass {
	//예외 던지기
	public void danger() throws IOException, MyException{
		if(10 - 10 ==0) {
			throw new MyException();
		}
		if(10 - 10 ==0) {
			throw new IOException();
		}
	}
	
}
