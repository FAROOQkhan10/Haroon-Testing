package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected LoginPage loginPage;
	
	@BeforeTest
	
	public void setUp() {
		
		df = new DriverFactory();
		
		driver = df.initDriver("Chrome");
		loginPage = new LoginPage(driver);
		
	}
	
	@AfterTest
	
	public void tearDown()
	
	{
		
		
		driver.quit();
		
		
	}

}
