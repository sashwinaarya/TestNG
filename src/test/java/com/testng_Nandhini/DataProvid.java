package com.testng_Nandhini;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvid {
	
	@Test(dataProvider = "credential_Data")
	private void credential(String username,String Pass) {
		
		System.out.println(username);
		System.out.println(Pass);

	}
	
	@DataProvider
	private Object[][] credential_Data() {
		
		return new Object[][] {
			
			{"anu", "anu123"},
			{"priya","priya123"},
			{"abi","abi123"}
		};
		

	}

}
