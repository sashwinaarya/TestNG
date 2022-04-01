package com.dec_testng;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeOut_Exception {
	
	@Test(timeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
	private void login_Page() throws InterruptedException {
		
		System.out.println("username");
		
		System.out.println("password");
		Thread.sleep(5000);
		
		System.out.println("submit");

	}
	
	
	//m1
	//m2

}
