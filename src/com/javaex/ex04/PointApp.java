package com.javaex.ex04;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point num1 =new Point();
		num1.setNum1((int)(Math.random()*100)+1);
		num1.setNum2((int)(Math.random()*100)+1);
		
		Point num2 =new Point();
		num2.setNum1((int)(Math.random()*100)+1);
		num2.setNum2((int)(Math.random()*100)+1);
		
		
		
		int num1x = num1.getNum1();
		
		int num2y = num2.getNum2();
		
		
		System.out.println("점[x="+num1x+", y="+num2y+"]을 그렸습니다.");
		System.out.println("점[x="+num1x+", y="+num2y+"]을 그렸습니다.");
		
		
		
		
		
	}

}
