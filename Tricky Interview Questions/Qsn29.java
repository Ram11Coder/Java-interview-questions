package com.NaveenAutomation;

public class Qsn29 {
	public static void main(String[] args) {

		String s = "Hello World";
		System.out.print("Reverse string : ");
		reverString(s, 0);
		int n = 1234;
		System.out.println();
		System.out.print("Reverse Number : ");
		reverseNumber(n);
	}

	private static void reverseNumber(int n) {

		if (n == 0)
			return;

		System.out.print(n % 10);
		reverseNumber(n / 10);

	}

	private static void reverString(String s, int n) {

		if (n == s.length())
			return;

		reverString(s, n + 1);
		System.out.print(s.charAt(n));

	}
}
