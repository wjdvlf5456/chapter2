package com.javaex.ex18;

public class Point implements Drawable {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 - gs
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void draw() {
		System.out.println("[x는 " + x + ", y는 " + y + "] 점을 그렸습니다.");

	}

}
