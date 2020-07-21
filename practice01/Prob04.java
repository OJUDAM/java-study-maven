package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
/*		String str = "Hello World";
		
		printCharArray(reverse(str));
	}
	
	public static char[] reverse(String str) {
		char[] reversedStr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			reversedStr[str.length()-1-i] = str.charAt(i);
		}
		
		return reversedStr;
	}
	public static void printCharArray(char[] array) {
		for(char p : array) {
			System.out.print(p);
		}
		*/
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			sb.append(str.charAt(i));
			System.out.println(sb);
		}
	}
		
}