package com.Vtsk;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String name;
	private List<String> answers;
	
	public Question() {		
	}
	
	public Question(int id, String name, List<String> answer) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void display() {
		System.out.println(id+" "+name);
		System.out.println("anser are :");
		
		 Iterator<String> itr=answers.iterator();  
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}
	

}
