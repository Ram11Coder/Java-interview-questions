package com.naveenAutomation;

class Test {
	static {
		System.out.println("static block");
	}
	public final int x = 20;
}

public class Qsn20 {

	public static void main(String[] args) {
		System.out.println(new Test().x);
	}
}
