package org.lessons.opp.snacks;

public class RegistroStudenti {
	// instance array of students objects
	private Studente[] studentRegister; 
	
	// constructor method
	public RegistroStudenti() {
		studentRegister = new Studente[30]; // max 30 students
	}
	// addStudent method
	public void addStudent(Studente student) {
		for(int i = 0; i < studentRegister.length; i++) {
			if (studentRegister[i] == null ) {
				studentRegister[i] = student;
				break;
			}
		}
	}
	// getStudentRegister
	public void getStudentRegister() {
        for (int i = 0; i < studentRegister.length; i++) {
        	if (studentRegister[i] != null ) {
            System.out.println(studentRegister[i].getStudentInfo());
        	} else {
        		break;
        	}
        }
    }
}
