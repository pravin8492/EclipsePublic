package pojo;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	private int roll_no;
	private String email_id;
	@Autowired
	
	/*
	 * here we are  @autowired  in student class for address 
	 * as we want the dependency injection to be done automatically 
	 */
	private Address address;
	@Autowired
	private Subject subject;
	
//	public Subject getSubject() {
//		return subject;
//	}
//	public void setSubject(Subject subject) {
//		this.subject = subject;
//	}
	public void display() {
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(email_id);
		System.out.println(address);
		System.out.println(subject);
	}
}
