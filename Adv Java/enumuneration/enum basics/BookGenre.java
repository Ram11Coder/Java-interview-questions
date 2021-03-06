package com.enums;

public enum BookGenre {
	HORROR, BIOGRAPHY;// if we adding additional methods then ; needed

	public static void main(String[] args) {
		for (BookGenre bookGenre : BookGenre.values()) {
			System.out.print("\nName: " + bookGenre); // toString
			System.out.print(", name(): " + bookGenre.name());
			System.out.print(", Ordinal: " + bookGenre.ordinal());
			System.out.print(", Declaring Class: " + bookGenre.getDeclaringClass());
			System.out.print(", compareTo(HORROR): " + bookGenre.compareTo(BookGenre.HORROR));
			System.out.print(", equals(HORROR): " + bookGenre.equals(BookGenre.HORROR));
		}
	}
}
