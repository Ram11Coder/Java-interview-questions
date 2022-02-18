package com.sim;

public class VodaPhone implements Sim {
	@Override
	public void calling() {
		System.out.println("Calling from Vodaphone");

	}

	@Override
	public void data() {
		System.out.println("Browsering data from Vodaphone sim");

	}

}
