package practice01;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다 */
		/*Scanner scan = new Scanner(System.in);
		String finish="y";
		
		while(true) {
			int hidedNum = scan.nextInt();
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int answer=0;
			int start = 1;
			int end = 100;
			int count=1;
			while(true) {
				System.out.println(start + "-" +end);
				System.out.print(count+">>");
				answer = scan.nextInt();
				count++;
				if(answer == hidedNum) {
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까(y/n)>>");
					finish = scan.next();
					break;
					
				}
				else if(answer > hidedNum) {
					System.out.println("더 낮게");
					end = answer;
					continue;
				}
				else {
					System.out.println("더 높게");
					start = answer;
					continue;
				}
				
			}
			if(finish.equals("n")) {
				System.out.println("종료");
				break;
			}
		}
*/	
		int count = 1;
		while(count < 100) {
			if(count %10 == 3||count %10 == 6||count %10 == 9) {
				System.out.println(count + " 짝");
			}
			count++;
		}
	}
}
