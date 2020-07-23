package com.bit2020.chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		Class cl = p.getClass();
	
		System.out.println(p.getClass()); //reflection
		System.out.println(p.hashCode()); // address 기반의 해싱값
		//hasing --> 다양한 타입을 정수 값으로 변환
		System.out.println(p);
		System.out.println(p.toString());
	}

}
