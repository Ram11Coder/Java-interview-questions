package com.NaveenAutomation;

/*
 * Compare Two Integer Numbers (Integer Caching)
 * */
public class Qsn4 {

	public static void main(String[] args) {
		/*
		 * Integer Caching (-128 to 127)
		 * 
		 */

		Integer num1 = 128, num2 = 128;// if the number lies in the ranges are cached
		if (num1 == num2) {
			System.out.println("Both are equal ");
		} else
			System.out.println("Both are not equal ");
	}
}
