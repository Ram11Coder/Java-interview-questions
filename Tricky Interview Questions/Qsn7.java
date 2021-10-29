package com.NaveenAutomation;

/**
 * What is the value of double MIN_VALUE
 * 
 * Which one bigger -> Double.MIN_VALUE or 0.0d?
 * 
 * Which one bigger -> Double.MIN_VALUE or NEGATIVE_INFINITY?
 * 
 * 
 * Flaot and Double min value is positive number
 */
public class Qsn7 {
	public static void main(String[] args) {

		System.out.println(Double.MIN_VALUE);// is a +ve number
		System.out.println(Long.MIN_VALUE);//-ve
		System.out.println(Integer.MIN_VALUE);//-ve

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//0.0
		System.out.println((Math.min(Integer.MIN_VALUE, 0)));

		System.out.println((Math.min(Float.MIN_VALUE, 0.0f)));//is a +ve number

		System.out.println(Float.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));//-Infinity
	}
}
