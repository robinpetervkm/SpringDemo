package com.norha.spring;

public class BikeInsurance implements Insurance {
	private Offers insuranceOffers;
	
	public Offers getInsuranceOffers() {
		return insuranceOffers;
	}

	public void setInsuranceOffers(Offers o) {
		this.insuranceOffers = o;
	}

	@Override
	public String showStatus() {
		System.out.println(insuranceOffers.getOffer()+" BIKE DISCOUNT 5%");
		return "Your Bike is Insured";
	}

}
