package com.bit2020.chapter03.exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
		}
		/*catch(Exception e) {
			e.printStackTrace();
		}*/
		catch(IOException|MyException e) {
			e.printStackTrace();
		}

	}

}
