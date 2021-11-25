package com.naveenAutomation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * WHy hashmap key should be immutable in java?
 * 
 * Why string is popular HashMap key in java?
 * 
 *
 */
public class TestMap {
	public static void main(String[] args) {

		Map<Employee, String> empMap = new HashMap<Employee, String>();
		Employee e1 = new Employee(22, "Ram");
		empMap.put(e1, "Permanent");
		System.out.println(empMap.get(e1));
		e1.setAge(20);
		e1.setName("Raman");
		/**
		 * Here we will get null because hashcode generated based on new age and name,
		 * so new hashcode generated then pointing to a new index that contains null
		 * value
		 * 
		 */
		System.out.println(empMap.get(e1));// null
		empMap.put(e1, "Temp");// New entry will be created
		System.out.println(empMap.get(e1));
		/*
		 * Advantage of using String as a key
		 */
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Ram", 100);
		System.out.println(m1.get("Ram"));// Here String is immutable so the hash code is cached in memory for quick
											// access
		String e2 = "Rocky";
		m1.put(e2, 200);
		e2 = "Raj";
		m1.put(e2, 300);
		System.out.println(m1.get(e2));
		System.out.println(m1.get("Rocky"));
		System.out.println(m1.get("Raj"));
		System.out.println(m1.get("Ram"));
		
		/**
		 * That's why whenever we create a hashmap key is immutable obj 
		 * so we will get better performance and code control
		 */
	}
}
