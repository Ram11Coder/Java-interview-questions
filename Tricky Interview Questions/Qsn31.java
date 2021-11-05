package com.naveenAutomation;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

/**
 * Vowels count within a string using java 1.Java
 * 
 * 2.Java 8
 * 
 * 3.Google guava
 *
 */
public class Qsn31 {
	public static void main(String[] args) {
		System.out.println("Normal approach");
		String str = "TestingVowelsAaEeIiOoUu";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowels(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("Vowels count -> " + count);

		// Java 8
		System.out.println("Using Java 8");

		IntPredicate voewls = new IntPredicate() {

			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I'
						|| t == 'O' || t == 'U';
			}
		};
		long voewlsCount = str.chars().filter(voewls).count();
		System.out.println("Vowels count -> " + voewlsCount);

		// Google guava API
		System.out.println("Using Google guave ");
		int c = CharMatcher.anyOf("aeiouAEIOU").countIn(str);
		System.out.println("Vowels count -> " + c);
	}

	private static boolean isVowels(char t) {

		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

}
