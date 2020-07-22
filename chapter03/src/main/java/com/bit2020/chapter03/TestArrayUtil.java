package com.bit2020.chapter03;

public class TestArrayUtil {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b = {100, 200, 300};
		
		int[] c = ArrayUtil.concat(a, b);
		if(c[0] ==a[0] &&c[3] == b[0]&&c.length == a.length+b.length) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}

}
