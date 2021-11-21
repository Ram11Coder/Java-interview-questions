package com.enumuneration;

public enum Color {
	RED("red"), GREEN("green"), YELLOW("yellow");

	private String val;

	private Color(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
