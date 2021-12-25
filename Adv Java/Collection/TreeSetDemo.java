package com.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Books /* implements Comparable */ {
	private String title;
	private String author;
	private int year;

	public Books(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return getTitle().compareTo(((Books) o).getTitle());
	}

}

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Books> set1 = new TreeSet<Books>();
		Books book1 = new Books("Harry potter", "Rowling", 1997);
		Books book2 = new Books("Harry potter", "Rowling", 1997);
		Books book3 = new Books("Wings of fire", "Arun Tiwari", 2000);
		Books book4 = new Books("The intelligent investor", "Benjamin graham", 1940);
		set1.add(book1);
		set1.add(book2);
		set1.add(book3);
		set1.add(book4);

		for (Books books : set1) {
			System.out.println(books);
		}

	

}

class TitleComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Books) o1).getTitle().compareTo(((Books) o2).getTitle());
	}
}
