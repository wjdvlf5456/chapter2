package com.javaex.ex08;

import java.util.Scanner;

public class TVApp {
	
	public static void main(String[] args) {
		
		
			
			Scanner sc = new Scanner(System.in);
				
				TV tv = new TV(7, 20, false);
				
				
				
				tv.channel(false);
				tv.status();
				
				System.out.println(tv.toString());
				
			sc.close();
			
	}

}
