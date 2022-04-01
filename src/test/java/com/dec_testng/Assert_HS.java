package com.dec_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_HS {
	
	@Test
	private void dataValidate() {
		
		
		String expected_UN="priya";
		
		String actual_UN="Anu";
		
		//Assert.assertEquals(actual_UN, expected_UN);
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(actual_UN, expected_UN);
		
		System.out.println("Data Verification");

	}

}
