package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Browser name is : " + browserName);
		
		if(browserName.trim().equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			
			
			
		}
		
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
			
			
		}
		
		else if(browserName.trim().equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
			
		}
		else {
			
			System.out.println("Please pass the correct Browser...");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
		
		
		
		
	}
	

}
