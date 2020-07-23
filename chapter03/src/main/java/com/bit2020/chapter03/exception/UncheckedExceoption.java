package com.bit2020.chapter03.exception;

public class UncheckedExceoption {
/*
 * Arithmetic, NullPoint, OutofBound 와같은 예외는
 * try~ catch를 하지 않아도됨
 * 이것들은 예외사항이아니라 에러이기 떄문에 수정해야함
 * 
 */
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40};
		
		for(int i=0;i<4;i++) {
			System.out.println(a[i]);
		}

	}

}
