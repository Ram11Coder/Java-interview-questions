package com.naveenAutomation;

/**
 * How many string objects will be created?
 * 
 * Notes When String obj created using new keyword for first time then 2 obj
 * will be created string literal -> Create the obj in String Constant Pool
 * inside the heap(Only one object created)
 *
 * If other than first time string obj created using new keyword then one obj
 * will be created (Obj ref created in stack point it to string obj in heap ,
 * also it won't create the obj in string constant pool because obj already
 * there)
 */
public class Qsn9 {

	public static void main(String[] args) {

		String s1 = "Hello world";
		String s2 = "Hello world";
		String s3 = s2;

		String n1 = new String("Hello world");
		String n2 = new String("Hello world");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);

		System.out.println(n1 == n2);
		System.out.println(n1 == s1);
	}
}
