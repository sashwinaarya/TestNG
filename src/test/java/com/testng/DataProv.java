package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {
	
	@Test(dataProvider="test_data")
	private void gg(String usr, int pwd) {
		System.out.println("Username: " + usr);
		System.out.println("Password: "+ pwd);
	}

	
	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {
			       {"ranjith",123},
			       {"rajesh",432},
			       {"jegadeesh",567}
			 };
	   }

}
