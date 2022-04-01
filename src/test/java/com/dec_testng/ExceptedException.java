package com.dec_testng;

import org.testng.annotations.Test;

public class ExceptedException {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void methodDemo() {
		
		int a=1/0;
		
		System.out.println(a);

	}

}
