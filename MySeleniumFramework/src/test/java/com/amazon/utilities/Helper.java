package com.amazon.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Helper {

	//Screenshots , Alerts , Frames , Windows, Sync Issues, JavaScript Executor 

	public static String captureScreenshot (WebDriver driver)
	{
		//TakesScreenshot is a interface , which has a method called getScreenshotAs and the return type is file for this 
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+ getCurrentDateTime()+ ".png";

		//Store it in a location 
		try {
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot Captured");
		} catch (IOException e) {
			System.out.println("Unable to print the screenshot"+e.getMessage());
		}
		return screenshotPath;
	}
	

	public static String getCurrentDateTime()
	{
		DateFormat customformat = new SimpleDateFormat("MM/dd/yyyy_HH_mm_ss");

		Date currentDate= new Date();

		return customformat.format(currentDate);
	}

}
