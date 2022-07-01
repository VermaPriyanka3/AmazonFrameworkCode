package com.amazon.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.utilities.BaseClass;

//For storing all the locators 

public class LoginPage extends BaseClass {

	//WebDriver driver ;
	
	//Create a constructor , which will help for initializing the Webdriver and pass the driver value otherwise it wont recognize 
	//ldriver will come from the main test case , whatever we will pass in driver the value will come here 
	public LoginPage (WebDriver ldriver) {
		this.driver = ldriver; 
	}
	//Xpaths 
	@FindBy(xpath=".//input[@type='email']") 
	WebElement username ; 
	
	@FindBy(xpath=".//input[@type='password']")
	WebElement password ; 
	
	@FindBy(xpath=".//input[@id='continue']")
	WebElement Continue; 
	
	@FindBy(xpath=".//input[@id='signInSubmit']")
	WebElement signInButton;
	
	public void LoginToAmazon(String Appusername, String AppPassword)
	{
	
		username.sendKeys(Appusername);
		Continue.click();
		password.sendKeys(AppPassword);
		signInButton.click();
		
		//Will intialize  the page now in 
		//test
		//123
	}

}
