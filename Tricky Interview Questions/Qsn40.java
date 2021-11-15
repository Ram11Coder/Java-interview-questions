package com.NaveenAutomation;

import java.lang.reflect.Field;

/**
 * String is immutable and we are violating to print the reflective value
 *
 */
public class Qsn40 {
	static {
		Field value;
		try {
			value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Ram", value.get("Hola ram"));
			value.set("How are you?", value.get("¿Cómo estás?"));
			value.set("I am fine", value.get("Estoy bien"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		System.out.println("Hello Ram");
		System.out.println("How are you?");
		System.out.println("I am fine");
	}
}
