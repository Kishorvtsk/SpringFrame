package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	/*
	 * public College(Principal principal) { 
	 * this.principal = principal;
	 *  }
	 */

/*	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
*/
/*	
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("Using set principal method");
	}
*/
	public void test() {
		
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is : " +collegeName);
		System.out.println("testing this method");
	}
	
}
