package com.testng;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class Assert_Types {
	
	@Test
	private void credential() {
		
		
		String actual="Priya";
		String expect="Abi";
		
	//	SoftAssert s=new SoftAssert();
	//	s.assertEquals(actual, expect);
		Assert.assertEquals(actual, expect);
		System.out.println("Process is completed");
		

	}

}
