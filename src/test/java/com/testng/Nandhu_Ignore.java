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

public class Nandhu_Ignore {
	

	
	@Test
	private void login() {
		System.out.println("Kidzzzzzz");

	}
	
	@Test(dependsOnMethods = "login")
	private void home_Page() {
		System.out.println("Womennnnn");

	}



}
