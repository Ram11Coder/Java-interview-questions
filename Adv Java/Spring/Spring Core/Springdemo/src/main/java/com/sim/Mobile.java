package com.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Config loaded");
		// 1st approach type cast required
		// Airtel sim = (Airtel) context.getBean("Airtel");

		// 2nd approach type cast required(Still need to source code acheive the
		// requirement)
		// Airtel sim = context.getBean("Airtel", Airtel.class);

		// 3rd approach make reference type as Sim(configurable)
		Sim sim = context.getBean("Sim", Sim.class);
		sim.calling();
		sim.data();

	}
}
