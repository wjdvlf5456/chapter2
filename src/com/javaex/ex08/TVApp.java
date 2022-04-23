package com.javaex.ex08;

import java.util.Scanner;

public class TVApp {
	
	public static void main(String[] args) {
		
		
			
			Scanner sc = new Scanner(System.in);
			
			
			TV tv = new TV(7, 20, false);
			System.out.println("전원을 켜시겠습니까?");
				
			tv.power(sc.nextBoolean());
			System.out.print("채널변경: ");
			tv.channel(sc.nextBoolean());
			System.out.print("볼륨변경:");
			tv.volume(sc.nextBoolean());
			
			
			tv.status();
				
			System.out.println(tv.toString());
			
			sc.close();
			
	}

}
