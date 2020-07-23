package com.bit2020.chaper03.person;

public class TestStudent {

	public static void main(String[] args) {
		
		//Person p = new Student();

		Student s = new Student();
		
		Person p = s; // Upcasting
		
		Student s2 = (Student)p; //Downcasting
	}

}
