package com.naveenAutomation;

/**
 * Print your name in 1000 times without using any loop
 * 
 *
 */
public class QSn11 {
	private static int count = 0;

	public static void main(String[] args) {

		String name = "Ram\n";
		// approach1(name);
		approach2(name);
		// approach3(name);// Not preferable
	}

	private static void approach3(String name) {
//If you are printing the name 100000 time then stack overflow error comes  
		if (count < 1000) {
			System.out.print(name);
			count++;
			approach3(name);
		}

	}

	private static void approach2(String name) {
		System.out.println(name.repeat(1000));

	}

	private static void approach1(String name) {
		String s = "i";
		s = s.replaceAll("i", "iiiiiiiiii");
		s = s.replaceAll("i", "iiiiiiiiii");
		s = s.replaceAll("i", "iiiiiiiiii");
//System.out.println(s.length());
		s = s.replaceAll("i", name);

		System.out.println(s);

	}
}
