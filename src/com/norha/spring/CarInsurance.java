package com.norha.spring;

public class CarInsurance implements Insurance {

	@Override
	public String showStatus() {
		return "Your Car is Insured";
	}

}
