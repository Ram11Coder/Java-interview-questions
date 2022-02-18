package com.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("heartObjnew") // It required default constructor to invoke the object
	private Heart heart;	

	public Human() {
		System.out.println("Deafult constructor");
	}

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constructore ...");

	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void heartPumping() {
		heart.pump();
	}
}
