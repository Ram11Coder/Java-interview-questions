package com.NaveenAutomation;
//What is stack omemory and how w get stackoverflow Error? and How to rectify it?
//Increase stack frame using -> -Xss4m
public class Qsn41 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();
	}

	private static void m2() {
		m1();
	}

}
