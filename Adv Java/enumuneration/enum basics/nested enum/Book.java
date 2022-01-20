package com.enums;
//Nested enum
public class Book {
	public enum BookGenreWithAge {
		BIOGRAPHY(12), HORROR(15);

		private BookGenreWithAge(int minAgeToRead) {
			this.minAgeToRead = minAgeToRead;
		}

		private int minAgeToRead;

		public int getMinAgeToRead() {
			return minAgeToRead;
		}

	}

	public static void main(String[] args) {
		for (BookGenreWithAge bookGenre : BookGenreWithAge.values()) {
			System.out.print("\nName: " + bookGenre); // toString
			System.out.print(", name(): " + bookGenre.name());
			System.out.print(", Ordinal: " + bookGenre.ordinal());
			System.out.print(", Declaring Class: " + bookGenre.getDeclaringClass());
			System.out.print(", compareTo(HORROR): " + bookGenre.compareTo(BookGenreWithAge.HORROR));
			System.out.print(", equals(HORROR): " + bookGenre.equals(BookGenreWithAge.HORROR));
			System.out.print(", minAgeToRead: " + bookGenre.getMinAgeToRead());
		}

	}
}