package com.naveenAutomation;

/*
 * Java static interview questions
 * 
 * 1.Explain static block in java?
 * Ans: It will executed when the class loads
 *
 * 2.How can we run a java program without making any object?
 * By using static  block
 * 
 * 3.Similarity and difference bw static method and static block?
 * static block will calls when class loads and static method we need to call explicitly
 * 
 * 
 * 4.How can we create objects if we make the constructor private?
 * Create a static factor method then call the object
 *  
 * 5.Is it possible to compile and run a java program without main method?
 * Before java 7 we can able to compile java program with out main() but not now.
 * 
 * 6.Can we initialize member variable within static block?
 * Yes we can initialize
 * 
 * 
 */
public class Qsn17 {
	static {
		System.out.println("Static block");
		test();
	}

	public static void test() {
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		test();
		Qsn17.test();
		Sample.getInstance();
	}
}

//Qsn 4

class Sample {
	private static Sample sample;

	private Sample() {
		System.out.println("Sample obj created!!");
	}

	public static Sample getInstance() {
		sample = new Sample();
		return sample;

	}
}