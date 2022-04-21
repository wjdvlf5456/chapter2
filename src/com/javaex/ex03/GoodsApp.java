package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);

		String cameraName = camera.getName();
		int cameraPrice = camera.getPrice();
		
		System.out.println(cameraName);
		System.out.println(cameraPrice);
	}

}
