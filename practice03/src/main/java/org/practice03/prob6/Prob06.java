package org.practice03.prob6;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print(">>");
			String expression = scanner.nextLine();
			
			if(expression.equals("quit")) break;
			
			String[] str = expression.split(" ");
			
			int num1 = Integer.parseInt(str[0]);
			String ch = str[1];
			int num2 = Integer.parseInt(str[2]);
			
			Calc calc;
			
			if(ch.equals("+")) {
				calc = new Add();
				calc.setValue(num1, num2);
				System.out.println(">> "+calc.calculate());
			}
			else if(ch.equals("-")) {
				calc = new Sub();
				calc.setValue(num1, num2);
				System.out.println(">> "+calc.calculate());
			}
			else if(ch.equals("*")) {
				calc = new Mul();
				calc.setValue(num1, num2);
				System.out.println(">> "+calc.calculate());
			}
			else if(ch.equals("/")) {
				calc = new Div();
				calc.setValue(num1, num2);
				System.out.println(">> "+calc.calculate());
			}
			
			
		}
		
		scanner.close();
	}

}
