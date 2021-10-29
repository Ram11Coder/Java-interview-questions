package com.NaveenAutomation;

/*1.Recursive 
 * 2.Streams
 * 
 */
public class Qsn2 {
	public static void PrintNum1(int n) {

		if (n <= 100) {
			System.out.println(n++);
			PrintNum1(n);
		}

	}

	public static void PrintNum2(int startNum, int endNum) {
		System.out.println(startNum++);
		if (startNum <= endNum)
			PrintNum2(startNum, endNum);

	}

	public static void main(String[] args) {
		int i = 1, j = 100;

		// PrintNum1(i);
		// PrintNum2(i, j);

		// IntStream.range(1, 101).forEach(e->System.out.println(e));
	}
}
