package com.naveenAutomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Qsn44 {
	public static void main(String[] args) {
		List<String> movies = new ArrayList<String>();
		movies.add("Predestination");
		movies.add("Life of pi");
		movies.add("Shawshank redemption");
		movies.add("Miracel");
		movies.add("Childrens of heaven");
		// 1. Java 8 foreach and lambda expression
		System.out.println("---Java 8 foreach and lambda expression---");
		movies.forEach(movie -> System.out.println(movie));
		// 2.using iterator
		System.out.println("--- Using iterator---");

		Iterator<String> moviesList = movies.iterator();
		while (moviesList.hasNext()) {
			System.out.println(moviesList.next());

		}

		// 3. Using iterator and java 8 foreach remaining Method
		System.out.println("---Using iterator and java 8 foreach remaining Method---");
		moviesList = movies.iterator(); 
		moviesList.forEachRemaining(movie -> System.out.println(movie));

		// 4. forach method
		System.out.println("---foreach method---");
		for (String m : movies) {
			System.out.println(m);
		}
		// 5 Normal loop
		System.out.println("---Normal loop---");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
		// 6.Using list iterator for both front and back iteration
		System.out.println("--- Using listiterator---");
		ListIterator<String> listItr = movies.listIterator(movies.size());

		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}
}
