package com.lucky;

public class StringToInt {
	public static void main(String[] args) {
		/**
		 * Convert String into int
		 * 
		 * Returns a new Integer(String) obj whereas parseInt(String) returns a
		 * primitive int
		 */
		String val = "1000";
		int i = Integer.parseInt(val);//Static method
		System.out.println(i + "\n");

		int j = Integer.valueOf(val);//Instance method
		System.out.println(j);
	}
}
