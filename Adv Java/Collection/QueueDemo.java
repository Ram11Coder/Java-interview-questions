package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
	public static void main(String[] args) {
		dequeTest();

	}

	private static void dequeTest() {
		System.out.println("\nInside deque Test");
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Walden");
		deque.add("Harry pottern");
		deque.add("Head first java");
		System.out.println("\nPrinting Queue");
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		System.out.println(deque.remove());

		deque.push("Walden");
		deque.push("Harry pottern");
		deque.push("Head first java");
		System.out.println("\nPrinting Stack");
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());

	}
}
