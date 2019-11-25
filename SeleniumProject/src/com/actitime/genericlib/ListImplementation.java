package com.actitime.genericlib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImplementation implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			String testName = result.getMethod().getMethodName();
            System.out.println("execute FAILED....................");
            EventFiringWebDriver eDriver = new EventFiringWebDriver(Browser.driver);
        		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
        		File dstFile = new File("./sreenshot/"+testName+".png");
            FileUtils.copyFile(srcFile, dstFile);
		
		}catch (Exception e) {
		}
        
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
