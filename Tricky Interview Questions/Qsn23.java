package com.naveenAutomation;

import java.text.DecimalFormat;

/**
 * Given string find the uppercase,lowercase,digits and other characters in
 * percentage
 */
public class Qsn23 {

	public static void main(String[] args) {

		String s = "Welcome to my world $JAVA_2021$";
		solver(s);

	}

	private static void solver(String s) {
		char ch;
		int len = s.length();
		double uppercase = 0, lowercase = 0, digits = 0, others = 0;
		for (int i = 0; i < len; i++) {
			ch = s.charAt(i);
			if (Character.isLowerCase(ch))
				lowercase++;
			else if (Character.isUpperCase(ch))
				uppercase++;
			else if (Character.isDigit(ch))
				digits++;
			else
				others++;

		}
		DecimalFormat decimalformat = new DecimalFormat("##.##");

		uppercase = percentage(uppercase, len);

		lowercase = percentage(lowercase, len);
		digits = percentage(digits, len);
		others = percentage(others, len);

		Double total = uppercase + lowercase + digits + others;
		System.out.println("Uppercase percentage " + decimalformat.format(uppercase));
		System.out.println("Lowercase percentage " + decimalformat.format(lowercase));
		System.out.println("Digits percentage " + decimalformat.format(digits));
		System.out.println("Others percentage " + decimalformat.format(others));

		System.out.println("Total " + total);

	}

	private static double percentage(double uppercase, int length) {
		return (uppercase * 100) / length;
	}

}
