package com.NaveenAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Qsn36 {
	static String path = "C:\\Test\\fileHadle.txt";

	public static void main(String[] args) {

		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(path));
			String line = bf.readLine();

			while (line != null) {
				if (!line.isBlank()) {
					String words[] = line.trim().toLowerCase().split(" ");
					// System.out.println(Arrays.toString(words));
					for (String word : words)
						if (wordMap.containsKey(word))
							wordMap.put(word, wordMap.get(word) + 1);
						else
							wordMap.put(word, 1);
				}
				line = bf.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		wordMap.forEach((K, V) -> System.out.println(K + " : " + V));
		System.out.println("=======Maximum count of words========");
		Map<String, Integer> maxMap = new HashMap<String, Integer>();
		/*
		 * wordMap.entrySet().stream().filter(entry -> entry.getValue() ==
		 * Collections.max(wordMap.values())) .forEach(e -> maxMap.put(e.getKey(),
		 * e.getValue()));
		 * 
		 * 
		 */
		wordMap.entrySet()
					.stream()
						.filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
								.forEach(e -> maxMap.put(e.getKey(), e.getValue()));

		System.out.println(maxMap);
	}
}
