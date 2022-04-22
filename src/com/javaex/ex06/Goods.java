package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {	//기본생성자
		//********메모리에 올리는 일 (클래스를 인스턴스에 올리는 일)
		//로직
		//아래 로직과 같이 추가로직이 생겼을 때는 default값이 사라지므로 이 로직을 따로 만들어주어야 한다.
		
	}
	
	public Goods(String name) {
		//********메모리에 올리는 일 (클래스를 인스턴스에 올리는 일)
		//추가로직
		this.name = name;
	}
	
	public Goods(String name, int price) {
		//********메모리에 올리는 일 (클래스를 인스턴스에 올리는 일)
		//추가로직
		this.name = name;
		this.price = price;
		
	}
	
	//메소드 gs
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
		this.price = price;
	}
	
	
	//메소드 일반
	public void showInfo() {
		
		System.out.println("*상품이름: " + name);
		System.out.println("*가격: " + price);
		System.out.println("");
		
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
