package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("My name is Sourabh..");
		System.out.println("Hi i am your maths teacher.. ");
	
	}

}
