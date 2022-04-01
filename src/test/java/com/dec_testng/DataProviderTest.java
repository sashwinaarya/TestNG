package com.dec_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="test_data")
	private void login(String usr, int pwd) {
		System.out.println("Username: " + usr);
		System.out.println("Password: "+ pwd);
	}

	
	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {
			       {"ranjith",123},
			       {"rajesh",432},
			       {"jegadeesh",567}
			 };
	   }

	

	}


