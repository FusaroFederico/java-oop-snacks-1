package org.lessons.opp.snacks;

public class Auto {
	// instance variables
	private String carBrand;
	private String carModel;
	private int carHP;
	private int carYear;
	// constructor method
	public Auto(String carBrand, String carModel, int carHP, int carYear) {
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carHP = carHP;
		this.carYear = carYear;
	}
	// getters and setters
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarHP() {
		return carHP;
	}
	public void setCarHP(int carHP) {
		this.carHP = carHP;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
}
