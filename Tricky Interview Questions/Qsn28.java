package com.NaveenAutomation;

import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;

/**
 * How to remove whitespaces in the string
 *
 */
public class Qsn28 {
	public static void main(String[] args) {

		String str = "  This is my string   " + "\n java learning 	\n" + " so far so good ";
		// System.out.println(str.trim());
		// System.out.println(str.replaceAll("\\s+", ""));// + for selct all spaces and
		// remove it (Faster)

		/*
		 * String strUtil = StringUtils.deleteWhitespace(str);
		 * System.out.println(strUtil);
		 */

		System.out.println(noWhitespace(str));
	}

	private static String noWhitespace(String str) {

		String s = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
				s += str.charAt(i);
			}

		}
		return s;
	}
}
