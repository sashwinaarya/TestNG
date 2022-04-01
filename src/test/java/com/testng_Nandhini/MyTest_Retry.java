package com.testng_Nandhini;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class MyTest_Retry {
	
	
	@Test
	private void uName() {
		String expected="Anu";
		String actual="Abi";
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	private void uPassword() {
		int expected=12345;
		int actual=12345;
		
		Assert.assertEquals(12345, 12345);

	}

}
