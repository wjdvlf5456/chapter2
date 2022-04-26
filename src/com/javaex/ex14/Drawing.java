package com.javaex.ex14;

public class Drawing {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle("빨강", "검정", 4, 4);
		Rectangle rec2 = new Rectangle("주황", "검정", 5, 5);
		
		Rectangle[] rec = new Rectangle[2];
		rec[0] = rec1;
		rec[1] = rec2;
		
		for (int i = 0; i < rec.length; i++) {
			rec[i].draw();
		}

		Triangle tri1 = new Triangle("빨강", "검정", 4, 4);
		Triangle tri2 = new Triangle("보라", "검정", 10, 10);
		
		Triangle[] tri = new Triangle[2];
		tri[0] = tri1;
		tri[1] = tri2;
		
		for (int i = 0; i < tri.length; i++) {
			tri[i].draw();
		}

		Circle cir1 = new Circle("보라", "빨강", 3);
		Circle cir2 = new Circle("보라", "검정", 3);
		
		Circle[] cir = new Circle[2];
		cir[0] = cir1;
		cir[1] = cir2;
		
		
		for (int i = 0; i < cir.length; i++) {
			cir[i].draw();
		}


	}

}
