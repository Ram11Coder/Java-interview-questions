package com.naveenAutomation;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

/**
 * Join the 2 arrays
 *
 * 1.Using java 8 streams 2.Using Google Guava
 *
 */
public class Qsn33 {
	public static void main(String[] args) {

		String[] bowlers = { "Bhvi", "Jaddu", "Aswin", "chahal", "shami", "bumbra" };
		String[] batsmen = { "Dhoni", "Virat", "Rohit", "Dhawan", "Rahul", "Rishab" };
		Stream<String> sBowl = Arrays.stream(bowlers);
		Stream<String> sBat = Arrays.stream(batsmen);
		String fullTeam[] = Stream.concat(sBat, sBowl).toArray(size -> new String[size]);
		System.out.println(Arrays.toString(fullTeam));

		System.out.println("----------------------------");
		// GOogle Guava
		String allTeams[] = ObjectArrays.concat(batsmen, bowlers, String.class);
		System.out.println(Arrays.toString(allTeams));
		System.out.println("----------------------------");

//For Primitive arrays

		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 6, 7, 8, 9, 10 };
		int p3[] = Ints.concat(p1, p2);

		System.out.println(Arrays.toString(p3));

	}
}
