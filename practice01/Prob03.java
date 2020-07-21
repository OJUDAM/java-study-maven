package practice01;

import java.util.Arrays;
import java.util.Scanner;

public class Prob03 {
	
	public static void main(String[] args) {
		
		/* 코드를 작성합니다. */
		/*char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
	}
	public static void replaceSpace(char a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
		
	}
	
	public static void printCharArray(char a[]) {
		for(char p : a) {
			System.out.print(p);
		}
		System.out.println();
*/	
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum =0;
		if(num%2==0) {
			for(int i=2;i<=num;i+=2) {
				sum+=i;
			}
		}else {
			for(int i=1;i<=num;i+=2) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
