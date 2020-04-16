package com.norha.spring;

public class BikeInsurance implements Insurance {
	private Offers offers;

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
