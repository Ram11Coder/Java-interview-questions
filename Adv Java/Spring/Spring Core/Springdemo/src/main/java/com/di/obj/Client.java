package com.di.obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*
		 * Student stu = new Student(); stu.setId(0); MathCheat math = new MathCheat();
		 * stu.setMathCheat(math); stu.cheating();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansdiObj.xml");
		Student stu = context.getBean("student", Student.class);
		stu.cheating();

		AnotherStudent anotherStu = context.getBean("anotherstu", AnotherStudent.class);
		anotherStu.cheat();

	}
}