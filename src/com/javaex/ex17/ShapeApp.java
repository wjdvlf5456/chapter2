package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		Rectangle rec1 = new Rectangle("빨강", "검정", 100, 1000);
		Rectangle rec2 = new Rectangle("보라", "검정", 1000, 1000);
		shape[0] = rec1;
		shape[1] = rec2;
		
		Circle cir1 = new Circle ("빨강", "검정", 3);
		shape[2] = cir1;
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].draw();
		}
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].area();
		}
		
		

	}

}