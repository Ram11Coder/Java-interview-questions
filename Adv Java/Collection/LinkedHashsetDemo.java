package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Ram");
		set1.add("Rahul");
		set1.add("Anu");
		System.out.println(set1);

		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Ram");
		set2.add("Rahul");
		set2.add("Anu");
		System.out.println(set2);
	}
}
