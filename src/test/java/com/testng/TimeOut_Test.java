package com.testng;

import org.testng.annotations.Test;

public class TimeOut_Test {
	
	
	@Test(timeOut = 3000)
	private void login_Page() throws InterruptedException {
		
		System.out.println("UserName");

		Thread.sleep(2000);
		System.out.println("Password");
		
		
		System.out.println("Submit");
	}
	

}
