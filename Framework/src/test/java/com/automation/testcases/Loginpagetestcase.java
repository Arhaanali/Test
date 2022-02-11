
package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.Loginpagefactory;

public class Loginpagetestcase extends BaseClass

{


	@Test
	
	public void login()
	{
	
	    Logger=Reports.createTest("Login into My web");
		Logger.info("Start the Web app");
		
		Loginpagefactory login=PageFactory.initElements(driver, Loginpagefactory.class);
		
		
		login.clicktologin();
		
	
			
			//login.logincred(Excel.getStringdata("Login", 0, 0), Excel.getStringdata("Login", 0, 1));
		
		//username Asif@test.com pass : Asif@1234
		
	
		//Logger.pass("Pass");
		}


}
