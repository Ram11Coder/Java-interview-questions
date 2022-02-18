package com.di.lossycouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainService {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beanslc.xml");

		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activateService();
	}
}
