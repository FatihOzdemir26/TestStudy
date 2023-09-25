package com.fatih1;

public abstract class Insurance {

	/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behaviour as getQuote() and cancelInsurance(). Create 3
	 * subclasses Car, Pet, Health. Car class has its own attribute as carModel and
	 * Class Pet has petType attribute. Create 3 objects of the sub classes and
	 * store them in ArrayList. Using for loop/advanced for loop/iterator access all
	 * methods of the class.
	 */

	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " get quote for " + carModel);

	}

	@Override
	public void cancelInsurance() {

		System.out.println(insuranceName + " cancel insurance for " + carModel);

	}

}

class Pet extends Insurance {
	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;

	}

	String petType;

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " get quote for " + petType);

	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " cancel insurance for " + petType);

	}

}

class Health extends Insurance{

	
	Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " get quote for health insurance" );

		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " cancel health insurance " );

		
	}
	
}



