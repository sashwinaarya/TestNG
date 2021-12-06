package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvide {
	
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("Mohan") String username, String password) {
		System.out.println("UN: " +username);
		System.out.println("PW: " +password);

	}
	

}
