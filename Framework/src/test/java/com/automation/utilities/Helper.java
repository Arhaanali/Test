package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//screenshorts , alerts, frames, sysn issue, window, javascript executor
	
	public static String takesceenshortsas(WebDriver driver) {
		
		File Scrs =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("Captured screen shot");
		
		String CaptureScreenshotspath = System.getProperty("user.dir")+ "/Screenshorts/"+ getdatetime() +".png";
		
		try {
			FileHandler.copy(Scrs, new File(CaptureScreenshotspath));
		} catch (IOException e) {
			System.out.println("Get Message for Screenshorts" + e.getMessage());
		}
		return CaptureScreenshotspath;
	}

	
	public static String getdatetime() {
		
		DateFormat Customformat = new SimpleDateFormat("MM_DD_YYYY_HH_mm_ss");
		
		Date currentdate = new Date();
		
		return Customformat.format(currentdate);
	}
	
}
