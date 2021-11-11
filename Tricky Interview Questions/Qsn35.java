package com.NaveenAutomation;

import java.io.IOException;

/**
 * How to launch the application
 * 
 *
 */
public class Qsn35 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		/*
		 * Process pr = runtime.exec("notepad.exe C:\\Ideas\\My startup Ideas.txt");
		 * Thread.sleep(4000); pr.destroy();
		 */

		String s[] = { "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com" };
		runtime.exec(s);
	}
}
