package com.naveenAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read a text file and print the number of lines,number of words and number of
 * characters
 * 
 *
 */
public class Qsn25 {
	public static void main(String[] args) {
		File file = new File("D:\\FileHanding\\sample.txt");
		readFile(file);

	}

	private static void readFile(File file) {
		int charCount = 0, linecount = 0, wordcount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String currentLine = br.readLine().trim();// Remove extra space
			while (currentLine != null) {
//line count
				linecount++;

				// word count
				String words[] = currentLine.split(" ");
				wordcount += words.length;

//Char count
				for (String word : words)
					charCount += word.length();

				currentLine = br.readLine();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Total lines :" + linecount);
		System.out.println("Total words :" + wordcount);
		System.out.println("Total chars :" + charCount);

	}
}
