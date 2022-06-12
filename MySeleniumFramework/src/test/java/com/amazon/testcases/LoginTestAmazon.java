package com.amazon.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amazon.utilities.BaseClass;
import com.amazon.pages.LoginPage;
import org.openqa.selenium.interactions.Actions;
import com.amazon.utilities.ExcelDataProvider;
import com.amazon.utilities.Helper;

public class LoginTestAmazon extends BaseClass {
	@Test
	public void loginApp() {

		
		//Intialize the webelement , LoginPage using pagefactory 
		//Loginpage.class will initialize the logon page , .class extension will got to login page and look for all the locators and initialize
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.LoginToAmazon(excel.getStringData("Login" , 0, 0), excel.getStringData("Login", 0, 1));

		
	}


}
