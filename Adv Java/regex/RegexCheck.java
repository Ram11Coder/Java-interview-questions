package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the regex patttern :");
			String regex = sc.nextLine();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher("Hello! This is ram");
			boolean found = false;
			while (matcher.find()) {
				System.out.println("Found at text " + matcher.group() + " Starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found)
				System.out.println("Match not found");

		}

	}
}
