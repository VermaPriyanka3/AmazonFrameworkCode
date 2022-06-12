package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;
	public ConfigDataProvider() {
		try {
			File src = new File ("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis); 		
		}
		catch (Exception e) {
			System.out.println("Not able to load the config file >>" +e.getMessage());
		}

	}
	public String getDataFromConfig(String KeyToSearch) {
		return prop.getProperty(KeyToSearch);
	}
	
	public String getBrowser() 
	{
	return prop.getProperty("Browser");
	}
	
	public String getURL() 
	{
	return prop.getProperty("TestURL");
	}
	
}