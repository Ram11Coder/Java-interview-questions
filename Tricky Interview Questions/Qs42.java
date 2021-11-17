package com.naveenAutomation;

/*
 * How System.out.println() really works in java?
 * System -> class 
 * out-> is (static final var)printStream reference initialized with null
 * println() -> is method
 * 
 * out var internally initialized by jvm
 * 
 * WHen system call loaded when the set of class var is loaded and set of methods(ex;- setOut()) called by jvm
 
 Reference :- https://hg.openjdk.java.net/jdk8/jdk8/jdk/file/cf44386c8fe3/src/share/native/java/lang/System.c
 
 * */
public class Qs42 extends Object{
	public static void main(String[] args) {
		System.out.println();
	}
}
