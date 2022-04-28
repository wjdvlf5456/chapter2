package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Point p01 = new Point(3, 5);
		
		p01.draw();
		p01.getX();
		
		Drawable p02 = new Point(100, 100);
		p02.draw();
		
		System.out.println("================================");
		Rectangle rec1 = new Rectangle("빨강", "노랑", 3, 3);
		rec1.draw();
		rec1.area();
		
		System.out.println("================================");
		Shape rec2 = new Rectangle("빨강", "노랑", 3, 3);
		rec2.area();
		// rec2.draw(); 사용 불가
		
		System.out.println("================================");
		Drawable rec3 = new Rectangle("빨강", "노랑", 3, 3);
		rec3.draw();
		// rec3.area(); 사용 불가
		*/

		// 배열선언
		Drawable[] dArray = new Drawable[4];

		Drawable rec1 = new Rectangle("빨강", "검정", 1, 1);
		Drawable cir1 = new Circle("파랑", "검정", 3);
		Drawable tri1 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8, 2);

		dArray[0] = rec1;
		dArray[1] = cir1;
		dArray[2] = tri1;
		dArray[3] = p01;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

	}

}