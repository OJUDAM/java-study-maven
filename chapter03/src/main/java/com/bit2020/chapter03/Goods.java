package com.bit2020.chapter03;

public class Goods {
	private String name;
	private int price;
	private int countSold;
	private int countStock;
	
	public static int countofGoods = 0;
	
	public Goods() {
		countofGoods++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	public void showInfo() {
		System.out.println(
				"상품이름 : "+name+
				"가격 : "+price+
				"재고개수 : "+countStock+
				"팔린 개수 : "+countSold
				);
	}
	
	public int calculateDiscountPrice(double percentage) {
		int discountPrice = (int)(price* percentage); 
		return discountPrice;
	}
}
