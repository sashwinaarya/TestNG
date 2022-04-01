package com.dec_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
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
		System.out.println("Amazon.com");

	}
	@BeforeMethod
	private void Login() {
		System.out.println("Login with credential");

	}
	
	
	@Test(priority = -1)
	private void mobileSearch() {
		System.out.println("Mobile Search");

	}
	
	@Test(priority = -1)
	private void BookSearch() {
		System.out.println("Book Search");

	}
	
	@Ignore
	@Test(invocationCount = 3, priority = 2)
	private void LaptopSearch() {
		System.out.println("Laptop Search");

	}
	
	@Test(enabled = false)
	private void onida_tv() {
		System.out.println("Searching TV");

	}
	
	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}
	
	@AfterClass
	private void VerifyHomePage() {
		System.out.println("Home Page");

	}
	
	@AfterTest
	private void Close_Button() {
		System.out.println("Close the Browser");

	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete all the cookies");

	}
	
	
	

}
