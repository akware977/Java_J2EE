package com.akshay.springCore;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String Brand;

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Its  working";
	}

	
}
