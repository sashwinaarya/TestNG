package com.dec_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
	@Test
	private void userName() {
		
		String expected_un="Sanvika";
		
		String actual_un="Sanvika";
		
		Assert.assertEquals(actual_un, expected_un);
		
	}
	
	@Test
	private void password() {
		String expected_un="Sanvika123";
		
		String actual_un="Sanvika";
		
		Assert.assertEquals(actual_un, expected_un);
		

	}

}
