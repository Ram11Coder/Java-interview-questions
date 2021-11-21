package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println(matcher.matches());

		System.out.println(Pattern.matches("[xyz]", "abcd"));
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches("[xyz]", "xxyyzzx"));

		System.out.println(" ******************** ");
		System.out.println(Pattern.matches("[ayz]?", "a"));
		System.out.println(Pattern.matches("[ayz]?", "aaa"));
		System.out.println(Pattern.matches("[ayz]?", "ayyyzz"));
		System.out.println(Pattern.matches("[ayz]?", "amta"));
		System.out.println(Pattern.matches("[ayz]?", "ayz"));
		System.out.println("(+) Quantifier");
		System.out.println(Pattern.matches("[ayz]+", "a"));
		System.out.println(Pattern.matches("[ayz]+", "aaa"));
		System.out.println(Pattern.matches("[ayz]+", "aayzz"));
		System.out.println(Pattern.matches("[ayz]+", "aamnta"));
		System.out.println("(*) Quantifier");
		System.out.println(Pattern.matches("[ayz]*", "ayyyzz"));

		System.out.println("************Meta character*************");
		System.out.println(Pattern.matches("\\d", "abc"));// non digit
		System.out.println(Pattern.matches("\\d", "1"));// Digit and comes once
		System.out.println(Pattern.matches("\\d", "4435"));// Digit but comes more than once
		System.out.println(Pattern.matches("\\d", "123abc"));// Digit and char
		System.out.println(Pattern.matches("\\D+", "abc"));// non digit but comes more than once

		System.out.println(Pattern.matches("\\D", "1"));// false (Digit)
		System.out.println(Pattern.matches("\\D", "4442"));// flase Digit
		System.out.println(Pattern.matches("\\D", "323asd"));// Mix of char and digit
		System.out.println(Pattern.matches("\\D", "m"));// True char
		System.out.println(Pattern.matches("\\D*", "abc"));// non digit comes more than once

	}

}
