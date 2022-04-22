package com.javaex.ex08;

import java.util.Scanner;

public class TVApp {
	
	public static void main(String[] args) {
		
			TV tv = new TV();
			tv.setChannel(7);
			tv.setVolume(20);
			tv.setPower(false);
			
			tv.status();
			
			System.out.println(tv.toString());
			
			
			
			
			
			
			
		
	}

}
