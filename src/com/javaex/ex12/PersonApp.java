package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		//Person p01 = new Person("최정필", 26);
		//p01.showInfo();
		
		/*
		Student s01 = new Student("서울고등학교");
		s01.showInfo();
		*/
		
		/*
		Student s02 = new Student();
		s02.setName("최정필");
		s02.setAge(26);
		s02.setSchoolName("서울고등학교");
		
		System.out.println(s02.toString());
		*/
		
		Student s03 = new Student("최정필", 26, "서울고등학교");
		System.out.println(s03.getName());
		System.out.println(s03.toString());
		
		s03.showInfo();
		

	}

}
