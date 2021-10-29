package com.NaveenAutomation;

/**
 * 
 * What will be the output when you use a long number with L and without L
 * suffix
 *
 *Without L -> It is consider as int
 *with L -> consider as long
 *long -> 8 bytes-> 64 bits
 *
 */
public class Qsn6 {
	public static void main(String[] args) {

		long longWithoutL = 1000 * 60 * 60 * 24 * 365;
		long longWithL = 1000 * 60 * 60 * 24 * 365L;
		System.out.println(longWithoutL);//1471228928
		
		System.out.println(longWithL);//31536000000
		/**
		 * 31536000000 -> 36 bits
		 * 11101010111101100010010110000000000
		 * 
		 * max limit of 32bit int :2147483647
		 * 
		 * if it is exceeds the limit then truncate the last 4 bit of number
		 * 1010111101100010010110000000000-->1471228928
		 */

	}
}
