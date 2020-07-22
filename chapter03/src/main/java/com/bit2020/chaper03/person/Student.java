package com.bit2020.chaper03.person;

public class Student extends Person {
	
	public Student() {
		//자식 생성자에 부모 생성자를 명시하지 않으면
		//컴파일러가 자식생성자 코드 맨 앞에
		//부모 디폴트 생성자를 자동으로 넣어줌
		//super();
		super("둘리");
		System.out.println("Student() Called");
	}
	public void test() {
		
		
		//자식에서 부모의 private 접근 x
		//name = "둘리";
		
		//자식에서 부모의 protected 접근 가능
		height = 140;
		
		//public 
		weight = 30;
		
	}
}
