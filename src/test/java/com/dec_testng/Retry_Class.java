package com.dec_testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {

	int count=1;
	
	int limit=5;
	public boolean retry(ITestResult result) {
		
		//1<=5
		if(count <= limit) {
			count++;
			return true; // execute 
		}
		
		return false;
	}

}
