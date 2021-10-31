package com.naveenAutomation;

public class Qsn19 {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance initializer");
	}

	Qsn19() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new Qsn19();

	}
}
