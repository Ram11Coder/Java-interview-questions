package com.di.obj;

public class Student {
	int id;
	MathCheat mathCheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.cheat();
		System.out.println("Student id is : " + id);
	}
}
