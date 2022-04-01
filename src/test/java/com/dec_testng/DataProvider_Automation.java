package com.dec_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Automation {	
	Object[][] login= {
			
			{"Arun","12345"},
			{"priya","67890"},
			{"Siva", "112233"}
	};
	
	@DataProvider(name="login_details")
	private Object[][] loginDetails() {
		return login;

	}
	
	@Test(dataProvider = "login_details")
	private void automationPractise(String uname, String passwd) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();;
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(uname);
				
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys(passwd);
		
		
		WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		submit.click();
		
		
		driver.close();


	}

}
