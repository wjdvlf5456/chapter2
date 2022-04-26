package com.javaex.ex13;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);

		ColorPoint cp1 = new ColorPoint("red");		// 부모는 기본생성자, 자식은 String color 하나 사용한 생성자
		cp1.setX(1);
		cp1.setY(3);

		ColorPoint cp2 = new ColorPoint(10, 10, "blue");	// 부모는 추가 생성자, 자식은 3개사용

		p.showInfo();		
		
		cp1.showInfo();
		cp2.showInfo();

	}

}
