package com.NaveenAutomation;

/**
 * Print the numbers from 1 to 100 without using any numbers in your code
 * 
 *
 */
public class Qsn1 {
	static int n = 'A' / 'A';
	public static void main(String[] args) {

		// Solution1();
		// Solution2();

		// Print from o to 100
		Solution3();
		Solution4();
	}

	private static void Solution4() {
		String s = "Creativity";
		int one = s.length() - s.length(), hundred = s.length() * s.length();
		for (int i = one; i <= hundred; System.out.println(i++))
			;
	}

	private static void Solution3() {
		int one = 'A' - 'A';
		for (int i = one; i <= 'd'; i++) 
			System.out.println(i);		
	}

	private static void Solution2() {
		for (int i = n; i <= 'd'; i++) 
			System.out.println(i);		
	}

	private static void Solution1() {

		int len = "..........".length();
		for (int i = n; i <= len * len; i++) 
			System.out.println(i);	
	}
}
