package com.javaex.ex13;

public class ColorPoint extends Point{
	
	//필드
	private String color;
	
	
	//생성자
	public ColorPoint(){
		
	}
	
	public ColorPoint(String color){
		super.getX();
		super.getY();
		this.color=color;
	}
	
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}

	//메소드 - gs 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("");
		super.showInfo();
		System.out.print(", 색깔은 "+color);
	}
	
	

}
