package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_New {
	
	@Test(dataProvider = "password_Data")
	private void credentials(String uname, int passwd) {
		System.out.println("Username: " +uname);
		System.out.println("Password: " +passwd);

	}
	
	@DataProvider
	private Object[][] password_Data() {
		
		return new Object[][] {
			
			{"Sashwin", 1234},
			{"Sanvika",54321},
			{"Priya",23434546}
			
		};
				

	}

}
