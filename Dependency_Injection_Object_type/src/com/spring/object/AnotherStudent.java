package com.spring.object;

public class AnotherStudent {

	// another object of MathCheat Class
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.mathCheat();
	}

}
