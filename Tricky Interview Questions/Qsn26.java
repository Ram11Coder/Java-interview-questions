package com.NaveenAutomation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to find the length of string without using length() function
 * 
 *
 */
public class Qsn26 {
	public static void main(String[] args) {
		String s = "Batman";
		System.out.println(s.toCharArray().length);
		System.out.println(s.lastIndexOf(""));
		Matcher matcher = Pattern.compile("$").matcher(s);// $ is start of string
		matcher.find();
		int m = matcher.end();
		System.out.println(m);

		System.out.println(s.split("").length);
		int count = 0;

		for (char c : s.toCharArray()) {
			count++;
		}
		System.out.println(count);

		System.out.println(getLength(s));

		int l1 = 0;
		try {
			l1 = s.getBytes("UTF-16BE").length / 2;
		} catch (Exception e) {

		}
		System.out.println(l1);
		System.out.println(getStringLength(s));
		System.out.println(s.compareTo(""));
		System.out.println();

	}

	private static int getStringLength(String s) {

		String str[] = s.split("");
		int c = 0;
		for (String string : str) {
			c += string.toCharArray().length;
		}
		return c;
	}

	private static int getLength(String s) {
		int i = 0;
		try {
			while (true) {
				s.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}

	}
}
