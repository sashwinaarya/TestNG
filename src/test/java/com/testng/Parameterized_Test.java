package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	//@Parameters({“refname1”, “refname2”})
	
	@Parameters({"Username" ,"password"})
	private void credential(@Optional("Sanvika") String username, @Optional("Sanvika")String password) {
		
		System.out.println("UN: " +username);
		System.out.println("PW: " +password);

	}
	

}
