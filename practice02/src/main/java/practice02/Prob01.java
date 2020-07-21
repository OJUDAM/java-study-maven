package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		int[] value = {50000, 10000, 5000, 1000, 500,
				100, 50, 10,5, 1
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 : ");
		int inputMoney = scan.nextInt();
		int switchMoney = inputMoney;
		for(int i=0;i<value.length;i++) {
			
			switchMoney=changeMoney(switchMoney,value[i]);
		}
		
	}
	
	public static int changeMoney(int mon, int val) {
		int count = 0;
		int change = 0;
		if(mon>= val) {
			count = mon/val;
			change = mon%val;
			System.out.println(val+"원 : "+count+"개");
		}else{
			System.out.println(val+"원 : 0 개");
		}
		return change;
	}
}
