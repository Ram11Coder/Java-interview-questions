package com.sim;

public class Airtel implements Sim {
	public Airtel() {
		System.out.println("Airtel constr called ");
	}

	@Override
	public void calling() {
		System.out.println("Calling from Airtel");

	}

	@Override
	public void data() {
		System.out.println("Browsering data from Airtel sim");

	}
}
