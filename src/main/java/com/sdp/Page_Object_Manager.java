package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Home_Page;
import com.pomclass.Login_Page;

public class Page_Object_Manager {
	
	
	public static WebDriver driver;
	
	//private classname objName
	
	private Home_Page home;
	
	private Login_Page login;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}


	public  Home_Page getInstance_home() {
		
		home=new Home_Page(driver);
		
		//home=new Home_Page(driver);
		return home;
		
	}
	
	public Login_Page getInstance_Login() {
		
		 login=new Login_Page(driver);
		 return login;

	}

}
