package com.norha.spring;

public class CarInsurance implements Insurance {
	private Offers insuranceOffers;
	
	public Offers getInsuranceOffers() {
		return insuranceOffers;
	}

	public void setInsuranceOffers(Offers q) {
		this.insuranceOffers = q;
	}

	@Override
	public String showStatus() {
		System.out.println(insuranceOffers.getOffer()+" CAR DISCOUNT 10%");
		return "Your Car is Insured";
	}

	

}
