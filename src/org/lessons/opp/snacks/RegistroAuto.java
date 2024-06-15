package org.lessons.opp.snacks;

public class RegistroAuto {
	// instance array of Auto objects
	private Auto[] carRegister;
	private int counter = 0;
	// constructor method
	public RegistroAuto() {
		carRegister = new Auto[100];
	}
	// addCar method
	public void addCar(Auto car) {
		carRegister[counter] = car;
		counter ++;
	}
}
