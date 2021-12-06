package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Home_Page;
import com.pomclass.Login_Page;

public class Page_Obj {
	
	public static WebDriver driver;
	
	private Home_Page home;
	
	private Login_Page login;
	
	public Page_Obj(WebDriver driver2) {
		this.driver=driver2;
	}

	public static Home_Page getInstance_home(){
		
		Home_Page home=new Home_Page(driver);
		return home;		
	}
	
	
	public Login_Page getInstance_Login() {
		
		Login_Page login=new Login_Page(driver);
		return login;

	}
	

}
