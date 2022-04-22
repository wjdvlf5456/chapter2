package com.javaex.ex04;


public class Point {
	
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	//set
	public void setX(int X) {
		x = X;
	}


	public void setY(int Y) {
		y = Y;

	}
	
	
	//get	여기서 get값을 PointApp으로 넘긴다.
	public int getX() {
		return x;
		
	}

	public int getY() {
		return y;
		
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		
	}

}
