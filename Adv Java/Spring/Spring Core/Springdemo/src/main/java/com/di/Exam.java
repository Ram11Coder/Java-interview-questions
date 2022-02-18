package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {

		ApplicationContext conext = new ClassPathXmlApplicationContext("Beansdi.xml");

		Student student = conext.getBean("Student", Student.class);
		student.getStudentInfo();

	}
}
