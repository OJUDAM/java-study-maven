package practice02;

import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
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
		
	}
}
