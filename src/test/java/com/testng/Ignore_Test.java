package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	
	@Test(timeOut = 5000)
	private void ug_Student() throws InterruptedException {
		System.out.println("Engineering Student - 100");
		Thread.sleep(3000);
		System.out.println("hiiiiiii i am password");
		Thread.sleep(1000);
		System.out.println("heyyyyyyyyy");

	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		int a=1/0;
		
		System.out.println(a);

	}
	
	
	

}
