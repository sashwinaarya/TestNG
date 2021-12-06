package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	@Test(dataProvider = "test_Data")
	private void credentials( String username, String password) {
		System.out.println("UN: " +username);
		System.out.println("PW: " +password);

	}
	
	@org.testng.annotations.DataProvider
	private Object[][] test_Data() {
		
		return new Object[][] {
			
			{"Nandhini","1234"},
			{"Sashwin","54321"},
			{"Sanvika", "123456"}
		};
		

	}
	

}
