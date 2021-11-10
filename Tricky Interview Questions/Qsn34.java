package com.NaveenAutomation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Find the duplicates elements in the array
 * 
 *
 */
public class Qsn34 {
	public static void main(String[] args) {
		String[] infra = { "Azure", "GCP", "Amazon", "Oracle", "Ali Baba", "Sauce labs", "GCP", "Amazon", "Azure" };
		System.out.println("*********Brute force*********");
		// 1.Brute force
		for (int i = 0; i < infra.length; i++)
			for (int j = i + 1; j < infra.length; j++)
				if (infra[i] == infra[j])
					System.out.println(infra[i]);
		System.out.println("\n*********HashSet*********");
		// 2.HashSet
		Set<String> hashset = new HashSet<String>();
		for (String e : infra) {
			if (hashset.add(e) == false)
				System.out.println(e);
		}

		System.out.println("\n*********HashMap*********");

		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		for (String e : infra) {
			Integer count = infraMap.get(e);
			if (count == null)
				infraMap.put(e, 1);
			else
				infraMap.put(e, ++count);
		}

		// Print all duplicate elements

		Set<Entry<String, Integer>> entrySet = infraMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}

		System.out.println("\n********* Streams and filter *********");

		Set<String> dataSet = new HashSet<String>();

		Set<String> dupSet = Arrays.asList(infra).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet());

		System.out.println(dupSet);
		System.out.println("\n********* Streams grouping by *********");

		Set<String> eleSet = Arrays.asList(infra).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println(eleSet);

		System.out.println("\n********* Streams frequency *********");

		List<String> list = Arrays.asList(infra);
		Set<String> eleList = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());

		System.out.println(eleList);
	}
}
