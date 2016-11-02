package org.digitalmirko.spring;

public class bikeInsurance implements Insurance {

	@Override
	public String showStatus() {
				
		return "Your Bike is Insured";
	}

}
