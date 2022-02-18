package com.di.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeansAutowire.xml");
		Human human = context.getBean("human", Human.class);
		human.heartPumping();
	}
}
