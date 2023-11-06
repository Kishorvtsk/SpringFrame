package com.spring.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		/*
		 * Student stu = new Student(); MathCheat cheat = new MathCheat();
		 * stu.setMathCheat(cheat);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("Bean.xml file loaded");
		Student student = context.getBean("student", Student.class);
		student.Cheating();

		AnotherStudent anotherStudent=context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}
}
