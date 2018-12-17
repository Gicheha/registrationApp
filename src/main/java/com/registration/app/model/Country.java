package com.registration.app.model;

public class Country {

	private String countryCode;
	private String countryName;

	public Country(){

	}

	public Country(String countryCode, String countryName){
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public String getCountryCode(){
		return this.countryCode;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryName(){
		return this.countryName;
	}

	public void setCountryName(){
		this.countryName = countryName;
	}
}
