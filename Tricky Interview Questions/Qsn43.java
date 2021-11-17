package com.naveenAutomation;

import java.util.Arrays;

/**
 * Why password should be stored in the char array instead of string?
 * 
 * 
 * If user stored as string and update the new password It woun't delete the
 * previous password that still string constant pool Because string is immutable
 * and we can not change the string
 * 
 * In mean time before gc collect garbage value hacker can get the memory or
 * heap dump get the previous password
 * 
 */
public class Qsn43 {
	public static void main(String[] args) {
//Might be a chance that you can log your password visible to anyone monitoring system
		String pwd = "Ram@1234";
		System.out.println("Password is :" + pwd);
//Using char arr
		char c[] = new char[] { 'R', 'a', 'm', '@', '1', '2', '3', '4' };
		System.out.println("Password is :" + c);
		Arrays.fill(c, '*');b
		for (char d : c)
			System.out.print(d);
	}

}
