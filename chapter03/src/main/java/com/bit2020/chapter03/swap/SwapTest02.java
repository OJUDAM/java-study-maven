package com.bit2020.chapter03.swap;

public class SwapTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + " : " + b);
		
		swap(a, b);
		System.out.println(a + " : " + b);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}

}
