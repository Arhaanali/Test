package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigdataProvider 


{
	public Properties pro;
	
	public ConfigdataProvider() 
	
	
	{
		
		File Scrfile =new File ("./Config/Browser.properties");
		
		FileInputStream FISS;
		try {
			FISS = new FileInputStream(Scrfile);
		
		
		pro = new Properties();
		
		pro.load(FISS);
		
		
		} 
		
		catch (Exception e) {
			
			 System.out.println("Config file Issue " + e.getMessage());
		
		}
	}
	
	public void getdatafromconfig() {
		
		
	}
	
	public String  getBrowser() {
		
		return pro.getProperty("Browser");
		
		

	}
	public String  getUrl() {
		
		return pro.getProperty("URL");
		
		
		
		
	}
	
	
}
