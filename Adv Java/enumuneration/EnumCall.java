package com.enumuneration;

public class EnumCall {
	public static void main(String[] args) {
		Color col = Color.RED;
		System.out.println(col.name());
		System.out.println(col.getVal());

		for (Color color : col.values()) {
			System.out.println(color);
		}
		col.setVal("pink");
		System.out.println(col.name());
	}

}
