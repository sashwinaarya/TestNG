package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
	public WebDriver driver; // null driver		
			
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	
	public Home_Page(WebDriver driver2) {
		
		this.driver=driver2;  // runner class driver
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getSignin() {
		return signin;
	}




}
