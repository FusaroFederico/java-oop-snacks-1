package org.lessons.opp.snacks;

public class Studente {
	// instance variables
	private String firstName;
	private String lastName;
	private int age;
	
	// constructor method
	public Studente(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// getStudentInfo method
	public String getStudentInfo() {
		return firstName + " " + lastName + ", " + age + " anni";
	}
}
