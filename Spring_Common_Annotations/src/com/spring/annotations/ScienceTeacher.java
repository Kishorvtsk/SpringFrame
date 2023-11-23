package com.spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("My name is Dhoni..");
		System.out.println("Hi i am your science teacher.. ");
	
	}

}
