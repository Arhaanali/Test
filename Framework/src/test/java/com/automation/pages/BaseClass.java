package com.automation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.Browserfactory;
import com.automation.utilities.ConfigdataProvider;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public WebDriver driver;
	public ExtentReports Reports;
	
	
	public ExcelDataProvider Excel;
	public ConfigdataProvider conf;
	public ExtentTest Logger;
	
	@BeforeSuite
	
	public void setforapp()
	{
		//ASif commit for Git 
		Reporter.log("Before Suit Setup for APP" ,true);
		ExcelDataProvider Excel  =new ExcelDataProvider();
		conf=new ConfigdataProvider();
	
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/" + Helper.getdatetime() +"_Myreport.html"));
		Reports =new ExtentReports();
		Reports.attachReporter(extent);
		
	}
	@BeforeClass
	
	public void setup() 
	
	{ 
		Reporter.log("Before Class  for APP" ,true);
		driver=Browserfactory.StartApp(driver , conf.getUrl(), conf.getBrowser());
		
	}
	
@AfterClass
 public void Teardown() 
   {
	
  	Browserfactory.Quitbrowser(driver);
  	Reporter.log("After Class Setup Teardown" ,true);
}
@AfterMethod
public void Teardownmethod(ITestResult results) throws IOException {
	
	if (results.getStatus()==results.FAILURE) {
		
		//Helper.takesceenshortsas(driver);
		
		
		
		
		Logger.fail("My fail test cases sceenshots", MediaEntityBuilder.createScreenCaptureFromPath(Helper.takesceenshortsas(driver)).build());
		
	}
	else if(results.getStatus()==results.SUCCESS)
	{
		
		Logger.pass("My fail test cases sceenshots", MediaEntityBuilder.createScreenCaptureFromPath(Helper.takesceenshortsas(driver)).build());
	}
	Reports.flush(); 	
	
	Reporter.log("After Method Reports for APP" ,true);
}
}
