package com.testng_Nandhini;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	
	@Test
	@Parameters({"UserName","Password"})
	private void credential(@Optional("Anu") String username,@Optional("Priya") String Pass) {
		
		System.out.println(username);
		System.out.println(Pass);
		

	}
	
	
}
