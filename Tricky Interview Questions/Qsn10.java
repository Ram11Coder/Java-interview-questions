package com.naveenAutomation;

/**
 * Pass null argument with method overloading of string and object types
 * 
 * note
 * 
 * Compiler will always gives precedence to child class over the parent class
 */
public class Qsn10 {
	public static void main(String[] args) {
		test(null);
	}

	private static void test(Object object) {

		System.out.println("Object method");
	}

	  private static void test(String s) {
	  
	  System.out.println("String method"); }
	 

	
	/*
	 * private static void test(StringBuffer s) {// The method test(Object) i
	 * ambiguous for the type Qsn10
	 * 
	 * System.out.println("StringBuffer method"); }
	 */
	 
}
