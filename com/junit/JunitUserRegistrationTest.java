package com.junit;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitUserRegistrationTest {

	// instance variable of junitUserRegistration to access the class elements
	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

	@Test
	public void givenFirstName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.firstName("Dibyesh");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.firstName("DIBYeSH");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenLastName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.lastName("Mishra");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenLastName_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.lastName("MiShra");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenEmailId_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.emailId("dibyesh207@gmail.com");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenEmailId_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.emailId("dibyesh.gmail.com");
		Assert.assertEquals(false, actualResult);
	}

}