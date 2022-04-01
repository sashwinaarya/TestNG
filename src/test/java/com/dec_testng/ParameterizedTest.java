package com.dec_testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"Username","Password"})
	private void credential(@Optional("Sashwin") String username, @Optional("A@rya")String password) {
		System.out.println("Username: " +username);
		System.out.println("Password: " +password);

	}
	
	/*
	 * @Test(dataProvider = "credential") private void adactineProject() {
	 * 
	 * //Systemset property //webdriver //url //uname //password //submit }
	 */

}
