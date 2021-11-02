package com.naveenAutomation;

/**
 * String to number without using inbuilt parsing method
 *
 */
public class Qsn22 {

	public static void main(String[] args) {
		String s = "123";
		System.out.println(solver(s));
	}

	private static int solver(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum = sum * 10 + (s.charAt(i) - '0');
		return sum;
	}
}
