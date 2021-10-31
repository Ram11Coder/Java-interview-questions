package com.naveenAutomation;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Print from 0 to 100 without using any loop and recursion
 * 
 *
 */
public class Qsn14 {
	public static void main(String[] args) {

		// 1. Arrays fill:
		Object num[] = new Object[100];

		Arrays.fill(num, new Object() {
			int count = 0;

			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));

		System.out.println();

		// 2.Bitset:

		String s = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(s, 1, s.length());

		System.out.println();
		System.out.println();

		// 3.simple bit set approach
		BitSet bit = new BitSet(100);
		bit.set(1, 101);
		System.out.println(bit);
	}
}
