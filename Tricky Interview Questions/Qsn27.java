package com.NaveenAutomation;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * What will be the o/p when you compare site URL with its ip address
 *
 */
public class Qsn27 {
	public static void main(String[] args) {
		try {
			System.out.println(new URL("https://www.hubspot.com/").equals(new URL("https://199.60.103.226")));
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	}                                                                                       
}
