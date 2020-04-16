package com.norha.spring;

public class BikeInsurance implements Insurance {
	private Offers offers;

	/*
	 * This Default constructor is must during the bean 
	 * In the Bean we can pass the Offers class object as argument but
	 * in case we are not passing it default constructor will called 
	 * at the time of bean initialization
	 */	
	public BikeInsurance() {
	}

	public BikeInsurance(Offers o) {
		this.offers = o;
	}

	@Override
	public String showStatus() {
		System.out.println(offers.getOffer());
		return "Your Bike is Insured";
	}

}
