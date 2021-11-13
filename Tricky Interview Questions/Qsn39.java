package com.naveenAutomation;

import java.util.ArrayList;
import java.util.List;

public class Qsn39 {
	public static void main(String[] args) {
		Student s1 = new Student("John", 1, 80, 16);
		Student s2 = new Student("Walker", 2, 60, 19);
		Student s3 = new Student("Lisa", 3, 50, 15);
		Student s4 = new Student("Jack", 4, 90, 18);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);

		for (Student student : studentList) {
			System.out.println(student);
		}

		// studentList.stream().forEach(e -> System.out.println(e));
		studentList.stream().filter(e -> e.getMarks() > 50)
				.forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));

		int maxMarks = studentList
							.stream()
								.map(e -> e.getMarks())
										.max(Integer::compare)
											.get();
		System.out.println(maxMarks);
		
		studentList.stream().filter(e->e.getMarks()==maxMarks).forEach(e->System.out.println(e));
	}
}
