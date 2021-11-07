package com.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistration {

	public String regex;

	//method to validate first name
	public boolean firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	//method to validate last name
	public boolean lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	//method to validate email
	public boolean emailId(String emailIds) {
		regex = "^[a-zA-Z0-9]+([.][0-9a-zA-z]+)*@[a-z]+.[a-z]{2,3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailIds);
		return matcher.matches();
	}
	//method to validate mobile no 
	public boolean mobileNumber(String mobileNumber) {
		regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	//method to validate password
	public boolean passwordRule1(String password) {
        regex = "^[a-z](?=.*[A-Z]+).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}
