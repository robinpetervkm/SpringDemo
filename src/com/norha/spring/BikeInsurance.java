package com.norha.spring;

public class BikeInsurance implements Insurance {
	private Offers offers;
	
	public Offers getOfferS() {
		return offers;
	}

	public void setRobin(Offers o) {
		this.offers = o;
	}

	@Override
	public String showStatus() {
		System.out.println(offers.getOffer());
		return "Your Bike is Insured";
	}

}
