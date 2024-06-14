package org.lessons.opp.snacks;

public class ContoBancario {
	
	// instance variables
	private int accountNumber;
	private double accountBalance;
	
	// constructor method
	public ContoBancario(int accountNumber) {
		this.accountNumber = accountNumber;
		this.accountBalance = 0.0d;
	}
	
	// depositMoney method
	public void depositMoney(double money) {
		accountBalance += money;
	}
	
	// withdrawMoney method
		public void withdrawMoney(double money) {
			accountBalance -= money;
		}
}
