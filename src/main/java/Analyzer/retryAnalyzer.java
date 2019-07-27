package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {
int count =0;
int retry_limit=3;
	public boolean retry(ITestResult result) {
		
		if(count<retry_limit)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
