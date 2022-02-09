package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpagefactory {
	
	
	public WebDriver driver;
	
	public Loginpagefactory(WebDriver Ldriver) 
	{
		
		this.driver = Ldriver;
		
    }
     @FindBy(xpath="//input[@id='login-email']") WebElement uname;
     @FindBy(xpath="//input[@id='login-password']") WebElement pass;
     @FindBy(xpath="//body/div[2]/div[2]/div[3]/main[1]/div[1]/div[3]/section[1]/div[1]/form[1]/button[1]") WebElement loginbutton;
     @FindBy(xpath="//a[@class='nav-link px-2']//following::ul[1]//li[1]") WebElement clickatloginlink;
   //header/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]
     
   
     
     public  void logincred(String Email , String pascode) 
     {
    	 
    
			uname.click();
			
			uname.sendKeys(Email);
			
			pass.click();
			
			pass.sendKeys(pascode);
			
			
			loginbutton.click();
			
	
     }


	public void clicktologin() {
		
		clickatloginlink.click();
	try {	Thread.sleep(3000);
} catch (InterruptedException e) {
	//TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	


	

}
