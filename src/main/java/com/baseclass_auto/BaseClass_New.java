package com.baseclass_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_New {
	
	
	public static WebDriver driver;  // ----> null driver
	
	public static WebDriver get_Driver(String drivername) {
	
		if(drivername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
			
		}
		
		else if(drivername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		
			
			return driver;
		
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	
	public static void inputParameter(WebElement element, String value) {
		element.sendKeys(value);
	
	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	
	public static  void close() {
		driver.close();

	}
	
	
	public static void dropdown(WebElement element,String typ, String input) {
		
		Select s=new Select(element);
		

		if(typ.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(input);
			
		}
		
	
		else if(typ.equalsIgnoreCase("byvisibleText")) {
			
			s.selectByVisibleText(input);
			
		}
		
		
		else if (typ.equalsIgnoreCase("byIndex")) {
			
			
			int in = Integer.parseInt(input);
			s.selectByIndex(in);
			
		}
		
	}
	

}
