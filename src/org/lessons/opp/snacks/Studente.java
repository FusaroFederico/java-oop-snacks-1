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
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
}
