package com.registration.app.model;

public class AppUser {
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private boolean enabled;
	private String gender;
	private String email;
	private String encryptedPassword;

	private String countryCode;

	public AppUser(){

	}

	public AppUser(Long userId, String userName, String firstName,String lastName, boolean enabled, String gender, String email, String countryCode, String encryptedPassword){
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enabled = enabled;
		this.gender = gender;
		this.email = email;
		this.countryCode = countryCode;
		this.encryptedPassword = encryptedPassword;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public boolean getEnabled(){
		return this.enabled;
	}

	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getGender(){
		return this.gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getCountryCode(){
		return this.countryCode;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getEncryptedPassword(){
		return this.encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword){
		this.encryptedPassword = encryptedPassword;
	}
}
