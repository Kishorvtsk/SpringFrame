package com.spring.di;

public class Student {
	
	// this two is dependency..
		private int id; 
		private String studentName;
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	
	
	// to access private class used setter
	//public void setId(int id) { 
	//	this.id=id;
	//	System.out.println("setter method called: " +"setId");
    //	}
	
	// to access private class used setter
	//public void setStudentName(String studentName) {
	//	this.studentName=studentName;
	//	System.out.println("setter method called: " +"setName");
	//}
	
	
	
	
	
	public void displayStudentInfo() {
		System.out.println("Student name is : " +studentName	+ "and the id is : "+id);
	}

}
