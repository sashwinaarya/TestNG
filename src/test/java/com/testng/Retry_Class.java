package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{
	
	int count=1;
	int limit=3;

	public boolean retry(ITestResult result) {
		
		if(count <= limit)	{//1<=5
			
			count++; // increment the counter
			return true;//execute
			
		}
		
		
		return false; //exit
	}

	

}

