package com.testng;

import org.testng.annotations.Test;

public class Excpected_Test {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void zero_Error() {
		
		int a=1/0;
		
		System.out.println(a);
	}

}
