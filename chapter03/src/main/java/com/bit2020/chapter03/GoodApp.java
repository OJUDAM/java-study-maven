package com.bit2020.chapter03;

public class GoodApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(200000000);
		camera.setCountSold(20);
		camera.setCountStock(30);
		
		Goods camera1 = new Goods();
		Goods camera2 = new Goods();
		Goods camera3 = new Goods();
		Goods camera4 = new Goods();
		
		camera.showInfo();
		System.out.println(camera.calculateDiscountPrice(0.5));
	}

}
