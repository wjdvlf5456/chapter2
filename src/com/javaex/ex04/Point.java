package com.javaex.ex04;


public class Point {
	
	
	//필드
	private int x;
	private int y;
	
	//생성자
	//기본생성자
	
	
	public Point() {
		
	}
	//추가로직을 가진 생성자
	public Point(int x) {
		this.x=x;
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.x=y;
	}
	
	
	//set
	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;

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
