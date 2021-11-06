package com.naveenAutomation;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;
import com.google.common.math.Stats;


/**
 *Calculate average of given array using 
 *1.Java 
 *2.Java 8
 *3.Google Guava API
 */
public class Qsn32 {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double sum = 0;
		for (int n : num) {
			sum += n;
		}
		System.out.println("Average : " + (sum / num.length));

		// Java 8 Streams
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println("Average (Using java 8) : " + avg.getAsDouble());

		// Google guava API(Deprecated)
		Double avg1 = DoubleMath.mean(num);
		System.out.println("Average (Using google guava mean() ) : " + avg1);

		// Google guava API
		Double average = Stats.meanOf(num);
		System.out.println("Average (Using google guava meanof()) : " + average);
	}
}
