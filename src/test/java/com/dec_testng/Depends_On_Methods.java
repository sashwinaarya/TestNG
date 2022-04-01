package com.dec_testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	@Test(dependsOnMethods = "credential")
	private void home_Page() {
		System.out.println("Assert Home Page must be displayed");
	}
	
	@Test(priority = 1)
	private void credential() {
		System.out.println("Enter with valid credentials");
	}

}
