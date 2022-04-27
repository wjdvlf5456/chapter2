package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		// Shape s01 = new Shape("빨강", "노랑");
		// System.out.println(s01.toString());
		//
		// s01.draw();

		Rectangle r01 = new Rectangle("빨강", "검정", 4, 4);
		Rectangle r02 = new Rectangle("주황", "검정", 5, 5);

		Rectangle[] rectangle = new Rectangle[2];

		rectangle[0] = r01;
		rectangle[1] = r02;

		for (int i = 0; i < rectangle.length; i++) {
			rectangle[i].draw();

		}

		Triangle tri1 = new Triangle("빨강", "검정", 4, 4);
		Triangle tri2 = new Triangle("보라", "검정", 10, 10);

		Triangle[] triangle = new Triangle[2];

		triangle[0] = tri1;
		triangle[1] = tri2;

		for (int i = 0; i < triangle.length; i++) {
			triangle[i].draw();

		}

		Circle cir1 = new Circle("보라", "빨강", 3);
		Circle cir2 = new Circle("보라", "검정", 3);

		Circle[] circle = new Circle[2];

		circle[0] = cir1;
		circle[1] = cir2;

		for (int i = 0; i < circle.length; i++) {
			circle[i].draw();

		}

	}

}
