package com.automation.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	
	
	
	public static WebDriver StartApp(WebDriver driver,String AppURL, String browsername) {
		if(browsername.contains("Chrome")) 
		
		{
			
			
			ChromeOptions options = new ChromeOptions();

			options.addExtensions(new File("C://Users//asif.ali//Desktop//Drivers//chromedriver_win32//chromedriver.exe"));

			driver = new ChromeDriver(options);
		
//		System.setProperty("WebDriver.chrome.driver", "./Drivers//chromedriver.exe");
//		
//		driver= new ChromeDriver();
//		
		
		} 
		
		else if(browsername.contains("Firefox")) 
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\asif.ali\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
			System.out.println("Firefox");
			
			
		}
		
		else if(browsername.contains("IE"))
		{
			
           System.setProperty("WebDriver.firefox.driver", "./Drivers/IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();
			
		

			System.out.println("IE");
		}
		else 
		
		{

			System.out.println("Browser not supported");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		System.out.println("App URL " + AppURL);
		driver.navigate().to(AppURL);
		
		System.out.println("App URL " + AppURL);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	
	
	return driver;
		
		
	}
	
	
	
	public static void Quitbrowser(WebDriver driver)  
	
	{
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		 driver.quit();
	}
	
}


