package com.regex;

public class RemoveSpecifiedChars {
	public static void main(String[] args) {
		String s = "汉字汉字Hello 汉字汉字123@ world汉字汉字";
//This regex specifies if char other than A-Z, a-z,0=9 and space comes replace with empty char
		s = s.replaceAll("[^A-Za-z0-9 ]*", "");
		System.out.println(s);
	}
}
