package com.naveenAutomation;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Generate random number in java
 * 
 * 1.Random Class 2.Math.Random() 3.ThreadLocalRandom
 * 
 * Use cases: Random number in email: test123@gmail.com phone number etc..
 */
public class Qsn30 {
	public static void main(String[] args) {

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt());
			System.out.println(random.nextDouble());
			System.out.println(random.nextLong());
			System.out.println(random.nextBoolean());

		}
		System.out.println("----------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());

		}
		System.out.println("----------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextBoolean());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextFloat());

		}
		System.out.println("----------------------------");

		// Inrange 0 to 100

		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(100));

		}
		System.out.println("----------------------------");
		// Inrange 0 to 50
		for (int i = 0; i < 5; i++) {
			System.out.println((int) (Math.random() * 50));

		}
		System.out.println("----------------------------");
		// Inrange 0 to 1000

		for (int i = 0; i < 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(0, 100));
		}
	}
}
