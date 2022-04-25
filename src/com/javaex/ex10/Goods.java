package com.javaex.ex10;

public class Goods {
	
	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {

	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;

	}

	// 메소드 - 게터세터
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	public void showInfo() {
		System.out.println("상품이름: "+name+"가격: "+price);
	}

}


