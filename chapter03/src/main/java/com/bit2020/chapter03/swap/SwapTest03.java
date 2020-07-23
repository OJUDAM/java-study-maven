package com.bit2020.chapter03.swap;

public class SwapTest03 {

	public static void main(String[] args) {
		value a = new value(10);
		value b = new value(20);
		
		System.out.println(a.val+ " : "+b.val);
		swap(a,b);
		System.out.println(a.val+ " : "+b.val);
	}
	public static void swap(value m, value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}
}
