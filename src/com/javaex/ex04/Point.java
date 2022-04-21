package com.javaex.ex04;


public class Point {
	
	
	//필드
	private int x;
	private int y;
	
	//set
	public void setNum1(int ppp) {
		x = ppp;
	}


	public void setNum2(int ooo) {
		y = ooo;

	}
	
	
	//get	여기서 get값을 PointApp으로 넘기나
	public int getNum1() {
		return x;
		
	}

	public int getNum2() {
		return y;
		
	}

}
