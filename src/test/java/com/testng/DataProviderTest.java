package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	Object[][] data={

			{"Anu","12345"},
			{"priya", "A@rya"},
			{"Sanvika","Arun"}

		};

	@DataProvider(name = "logindetails")
	private Object[][] credentials() {
		return data;
	}
	

	
	@Test(dataProvider = "logindetails")
	private void loginScenario(String uname, String passwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
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


