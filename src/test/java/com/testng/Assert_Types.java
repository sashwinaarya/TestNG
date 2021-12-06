package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Types {
	
	@Test
	private void credential() {
		
		
		String actual="Priya";
		String expect="Abi";
		
		Assert.assertEquals(actual, expect);
		System.out.println("Process is completed");
		
		String e=null;
		
		Assert.assertNull(e);
		System.out.println("Completed");

	}

}
