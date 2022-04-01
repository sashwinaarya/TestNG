package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Depends_OnMethods {
	

	
	@Test
	private void mobile() {
		System.out.println("Mobile");

	}
	
	@Test
	private void laptop() {
		System.out.println("Laptop");

	}
	
	@Test(dependsOnMethods = "laptop")
	private void offer() {
		System.out.println("Offer");

	}



}
