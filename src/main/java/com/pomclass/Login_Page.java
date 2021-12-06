package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver; // null driver	

	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="passwd")
	private WebElement password;
	

	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement submit;
	
	public Login_Page(WebDriver main_driver) {
		this.driver=main_driver;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSubmit() {
		return submit;
	}
	

}
