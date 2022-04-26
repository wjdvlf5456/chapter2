package com.javaex.ex12;

public class Student extends Person {

	// 필드
	private String schoolName;

	// 생성자
	public Student() {
		// super(); //디폴트 생성자
		System.out.println("student1");

	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("student2");

	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("student3");

	}

	// 메소드 - gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 - 일반
	public void showInfo() {
		//부모 showInfo 그대로 사용 
		super.showInfo();
		System.out.println(", 학교: " + schoolName);

	}

	@Override
	public String toString() {
		return super.toString() + schoolName;
	}

}
