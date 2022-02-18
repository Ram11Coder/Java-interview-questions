package com.di.obj;

public class AnotherStudent {
	private String name;
	MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void cheat() {
		cheat.cheat();
		System.out.println("Cheater name is : " + name);
	}

}
