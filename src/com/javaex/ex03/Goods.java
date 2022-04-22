package com.javaex.ex03;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자

	// method -gettersetter
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		
		if (price < 0) {
			this.price = 0;
			
		} else {
			this.price = price;
			
		}
		
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;

	}

	// method 일반
	public void showInfo() {

		System.out.println("*상품이름: " + name);
		System.out.println("*가격: " + price);
		System.out.println("");

	}

}
