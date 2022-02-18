package com.di;

public class Student {
	private String studentName;
	private int id;

	public Student(int id) {
		this.id = id;
	}

	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}

	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */

	public void getStudentInfo() {
		System.out.println("Student name is : " + studentName + " id is " + id);

	}
}
