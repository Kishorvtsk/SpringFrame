package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		//Student stu = new Student();
		//stu.setStudentName("Kishor");
		
		//stu.displayStudentInfo();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Student kishor =context.getBean("student",Student.class);
		kishor.displayStudentInfo();
		
		/* for setter object
		 * Student sonu=context.getBean("studentTwo", Student.class);
		 * sonu.displayStudentInfo();
		 */
		
		
	}

}
