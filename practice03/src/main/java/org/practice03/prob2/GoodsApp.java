package org.practice03.prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];
		for(int i=0;i<COUNT_GOODS;i++) {
			String line = scanner.nextLine();
			String[] token = line.split(" ");
			goods[i] = new Goods();
			goods[i].name = token[0];
			goods[i].price = Integer.parseInt(token[1]);
			goods[i].stock = Integer.parseInt(token[2]);
		}
		for(int i=0;i<COUNT_GOODS;i++) {
			System.out.println(goods[i].name+"(가격: "+
					goods[i].price+")이 "+goods[i].stock+"개 입고 되었습니다.");
		}
		scanner.close();
	}
}
