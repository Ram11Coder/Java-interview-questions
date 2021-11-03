package com.naveenAutomation;

/**
 * Chheck given number is valid or not
 *
 * Check the given phone number is valid -> 10 digits
 *
 * Check the given CC number is valid -> 16 digits
 */
public class QSn24 {
	public static void main(String[] args) {

		System.out.println(isNumber("1234"));
		System.out.println(isValidPhoneNumber("1234123421"));
		System.out.println(isValidPhoneNumber("12341"));
		System.out.println(isValidPhoneNumber("123412342111"));
		System.out.println(isValidPhoneNumber("1234123421$"));
		System.out.println(isValidCCNumber("1234567890123456"));
		System.out.println(isValidCCNumber("123456789012345612"));
		System.out.println(isValidCCNumber("1234567890123"));
		System.out.println(isValidCCNumber("123456789012345q"));
		System.out.println(isCorrectPhoneNumber("1234567890"));
		System.out.println(isCorrectPhoneNumber("12345678901"));

		System.out.println(isCorrectNumber("100"));
		System.out.println(isCorrectNumber("100.12"));
		System.out.println(isCorrectNumber("-100.12"));
		System.out.println(isCorrectNumber("-100A"));
		System.out.println(isCorrectNumber("100AA"));
		System.out.println(isCorrectNumber("12345678901"));

	}

	public static boolean isValidPhoneNumber(String number) {
		if (number.length() == 10 && isNumber(number)) {
			System.out.println("This is a valid phone number: " + number);
			return true;
		}
		System.out.println("This is not a valid phone number: " + number);
		return false;
	}

	public static boolean isValidCCNumber(String number) {
		if (number.length() == 16 && isNumber(number)) {
			System.out.println("This is a valid CC number: " + number);
			return true;
		}
		System.out.println("This is not a valid CC number: " + number);
		return false;
	}

	private static boolean isNumber(String num) {
		try {
			Long.parseLong(num);
			System.out.println("This is a valid number: " + num);
		} catch (NumberFormatException e) {
			// System.out.println("This is a not valid number " + num);

			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

	public static boolean isCorrectPhoneNumber(String number) {
//		return number.matches("[0-9]{10}");
		return number.matches("\\d{10}");
	}

	public static boolean isCorrectNumber(String number) {
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
	}
}
