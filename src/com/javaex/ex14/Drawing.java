package com.javaex.ex14;

public class Drawing {
	
	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle("빨강", "검정");
		rec1.setWidth(4);
		rec1.setHeight(4);
		
		Rectangle rec2 = new Rectangle("주황", "검정");
		rec2.setWidth(5);
		rec2.setHeight(5);
		
		Triangle tri1 = new Triangle("빨강", "검정");
		tri1.setWidth(4);
		tri1.setHeight(4);
		
		
		Triangle tri2 = new Triangle("보라", "검정");
		tri2.setWidth(10);
		tri2.setHeight(10);
		
		Circle cir1 = new Circle("보라", "빨강");
		cir1.setRadius(3);
		
		
		Circle cir2 = new Circle("보라", "검정");
		cir2.setRadius(3);
		
		rec1.draw();
		rec2.draw();
		tri1.draw();
		tri1.draw();
		cir1.draw();
		cir2.draw();
		
		
	}
	
}
