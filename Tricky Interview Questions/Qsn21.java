package com.naveenAutomation;

class Testing {
	static {
		System.out.println("static block");
	}
	public static final int x = 20;
}

public class Qsn21 {

	public static void main(String[] args) {
		System.out.println(Testing.x);
	}
}
