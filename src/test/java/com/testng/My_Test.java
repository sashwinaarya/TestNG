package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
	@Test
	private void uName() {
		String expected="Sashwin";
		String actual="Sashwin";
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	private void passWord() {
		int expect_pass=12345;
		int actual_pass=54321;
		
		Assert.assertEquals(actual_pass, expect_pass);

	}
		

	
	

}
