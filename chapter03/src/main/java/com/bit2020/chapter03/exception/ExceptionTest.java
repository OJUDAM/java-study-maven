package com.bit2020.chapter03.exception;

public class ExceptionTest {
/*
 * 
 *  예외 발생시 : 0 -> 1 -> 죄송,로그,종료 -> 3(finally)
 *  정상 실행시 : 0 -> 1 -> 2 -> 3(finally) ->4
 *  
 */
	public static void main(String[] args) {
		int a = 10;
		int b = 11 - a;

		System.out.println("some codes0...");
		try {
			System.out.println("some codes1...");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some codes2...");
		} catch(ArithmeticException ex) {
			// 1. 사과
			System.out.println("죄송합니다."
					+ " 다시 실행해주세요");
			// 2. 로그 남기기
			System.out.println(ex);
			
			//3. 정상 종료

			return;
		} finally{
			System.out.println("some codes3...");
			
		}
		
	
		System.out.println("some codes4...");
		
	}

}
