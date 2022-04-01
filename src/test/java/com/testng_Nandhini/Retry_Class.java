package com.testng_Nandhini;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{

	int count=1;
	int limit=5;
	
	public boolean retry(ITestResult result) {
		
		if(count <= limit) { //1<=5 //2<=5
			count++;
			return true;
			
		}
		
		
		return false;
	}
	
	

}
