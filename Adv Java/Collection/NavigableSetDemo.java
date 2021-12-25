package com.collections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(23);
		set.add(74);
		set.add(89);

		System.out.println("lower: " + set.lower(74));
		System.out.println("floor: " + set.floor(74));
		System.out.println("ceiling: " + set.ceiling(74));
		System.out.println("higher: " + set.higher(74));

		System.out.println("first: " + set.first());
		System.out.println("last: " + set.last());

		System.out.println("set: " + set);

		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println("descendingSet: " + descendingSet);
//Headset limit -> anything less than 74 is fine
		NavigableSet<Integer> headSet = set.headSet(74, true);
		System.out.println("headSet: " + headSet);

		headSet.add(6);
		System.out.println("headSet: " + headSet);
		System.out.println("set: " + set);
		headSet.add(4);
		// headSet.add(75); // This is out of the range - throws IllegalArgumentException
		System.out.println("set: " + set);

		SortedSet<Integer> subSet = set.subSet(5, 74);//2 is not in the range of (5 to 74)
		// subSet.add(2); // throws IllegalArgumentException

		// Adding element in backed set (original set) and
		// see it getting reflected in subSet
		set.add(25);
		System.out.println("subSet: " + subSet);
	}
}
