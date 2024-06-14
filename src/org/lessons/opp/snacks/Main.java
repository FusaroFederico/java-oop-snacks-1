package org.lessons.opp.snacks;

public class Main {

	public static void main(String[] args) {
		RegistroStudenti registro = new RegistroStudenti();
		Studente pino = new Studente("pino", "pini", 24);
		Studente pina = new Studente("pina", "pini", 21);
		Studente gino = new Studente("gino", "gini", 27);
		registro.addStudent(pino);
		registro.addStudent(gino);
		registro.addStudent(pina);
		registro.getStudentRegister();
	}

}
