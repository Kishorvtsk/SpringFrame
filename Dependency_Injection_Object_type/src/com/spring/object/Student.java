package com.spring.object;

public class Student {

	private int id;
	private MathCheat mathCheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void Cheating() {
		mathCheat.mathCheat();
		System.out.println("Hey my id is " + id + " take and do whatever you want to do ..");
	}
}
