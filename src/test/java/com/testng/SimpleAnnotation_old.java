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

public class SimpleAnnotation_old {
	
	//STCM
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");

	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	
	@BeforeClass
	private void url() {
		System.out.println("amazon.com");

	}
	
	
	@BeforeMethod
	private void login() {
		System.out.println("Enter your credentials");

	}
	
	
	@Test(priority=-2, invocationCount=2)
	private void apple() {
		System.out.println("Apple Search");

	}
	
	@Test(invocationCount=10)
	private void mobileSearch() {
		System.out.println("Mobile Search");

	}
	
	@Test
	private void LaptopSearch() {
		System.out.println("Laptop Search");

	}
	
	@Test(priority=-1)
	private void TvSearch() {
		System.out.println("TV Search");

	}
	
	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}
	
	@AfterClass
	private void homePage() {
		System.out.println("Home Page");

	}
	
	@AfterTest
	private void close() {
		System.out.println("Close");

	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete All cookies");

	}
	
	
	
	
	

}
