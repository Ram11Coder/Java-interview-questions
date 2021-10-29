package com.NaveenAutomation;

/**
 * 
 * Will static block be executed with final variable?
 *
 *
 *In the below scenerio X is a final var so the bye code will be like this
 *
 *Byte code:
 *public class Qsn8 {
	public static void main(String[] args) {
		System.out.println(100);
	}
}
Test.X will be replaced by 100 so static block will not execute 
 */
public class Qsn8 {
	public static void main(String[] args) {
		System.out.println(Test.X);
	}
}

class Test {
	public static final int X = 10;

	static {
		System.out.println("--------This a static block of Test--------");
	}
}