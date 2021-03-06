package com.javaex.ex14;

public class Circle {
	
	//필드
	private String fillColor;
	private String lineColor;
	private int radius;
	
	//생성자
	public Circle () {
		
	}
	
	public Circle (String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}

	//메소드 - gs
	public String getFillColor() {
		return fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 - 일반
	public void draw () {
		System.out.println("면색: "+fillColor+", 선색: "+lineColor+", 반지름: "+radius + " 원을 그렸습니다.");
		
	}
	
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
	
	

}
