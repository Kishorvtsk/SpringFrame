package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;
	
	public Human(){
		
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constructor is getting called which has Heart as arg..");
	}
	 
	@Autowired
	@Qualifier("humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("name of the animal is : " +heart.getNameOfAnimal()+ "no of heart present: " +heart.getNoOfHeart());
		}
	}
}
