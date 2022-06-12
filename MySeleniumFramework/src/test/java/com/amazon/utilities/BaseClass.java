package com.amazon.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.amazon.utilities.LaunchBrowser;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import java.lang.Object;

import org.testng.annotations.BeforeSuite;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.IOException;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel; 
	public ConfigDataProvider config; 
	public ExtentReports report; 
	public ExtentTest logger;
	


	@BeforeSuite
	public void setUpSuite() {
		
		//Reporter.log("Setting up reports and Test is getting ready" , true);
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File (System.getProperty("user.dir")+"/Reports/Amazon.HTML"));
		report=new ExtentReports();
		report.attachReporter(extent);
		//Reporter.log("Setting is done - Test can be started", true); 
		
	}

	@BeforeClass 
	public void setup() {
		//Reporter.log("Trying to start browser and getting application ready" , true);
		//THIS IS THE BASIC EXAPMLE OF ABSTRACTION < WHERE WE ARE HIDING THE IMPLEMENTATION AND ONY SHOWING THE FUNCTIONALITY
		driver=LaunchBrowser.startApplication(driver, config.getBrowser() , config.getURL());
		Reporter.log("Browser and Application is up and running" , true);
	}

	@AfterClass
	public void tearDown() {
		LaunchBrowser.quitBrowser(driver);
		
	}
    @AfterMethod
	public void tearDownMethod(ITestResult result ) 
    {
    	//Reporter.log("Test is about to end" , true);
		if (result.getStatus()==ITestResult.FAILURE)
        {
			logger.fail("Test Failed");
			try {
				logger.addScreenCaptureFromPath(Helper.captureScreenshot(driver));
			} catch (IOException e) {
				System.out.println("Unable to print the screenshot"+e.getMessage());
				e.printStackTrace();
			}
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Success");
			try {
				logger.addScreenCaptureFromPath(Helper.captureScreenshot(driver));
			} catch (IOException e) {
				System.out.println("Unable to store the screenshot"+e.getMessage());
				e.printStackTrace();
			}
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			logger.skip("Test Skipped");
			try {
				logger.addScreenCaptureFromPath(Helper.captureScreenshot(driver));
			} catch (IOException e) {
				System.out.println("Unable to store the screenshot"+e.getMessage());
				e.printStackTrace();
			}
		}
		report.flush();
		
		Reporter.log("Test completed >> Reports Generated", true);
	}
}

