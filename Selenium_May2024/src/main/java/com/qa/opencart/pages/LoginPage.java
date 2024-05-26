package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	
	//private By locators
	
	
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPassLink = By.linkText("Forgotten Password");
	
	// Page constructor
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;	
		
		
	}
	
	//Page method or behaviour of the page
	
	
	public String getLoginPageTitle() {
		
		
		String title = driver.getTitle();
		
		System.out.println("Login Page Title : " + title);
		return title;
	}
	
	public String getLoginPageUrl() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Login page URL : " + url );
		return url;
	}
	
	
	public boolean isForgotPwdLink() {
		
		return driver.findElement(forgotPassLink).isDisplayed();
	}
	
	
	public void doLogin(String un, String pwd) {
		
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();

		
		
	}
	
	

}
