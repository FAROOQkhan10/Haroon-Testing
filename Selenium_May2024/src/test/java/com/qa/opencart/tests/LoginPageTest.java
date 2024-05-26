package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	
	
	
	@Test
																																		public void loginPageTitleTest() {
		
		
		String actualTitle = loginPage.getLoginPageTitle();
		
		Assert.assertEquals(actualTitle, "Account Login");
		
	}	
	
	@Test
	
	
	public void loginPageUrlTest() {
		
		String actualUrl = loginPage.getLoginPageUrl();	
		
		Assert.assertTrue(actualUrl.contains("route=account/login"));
		
		
		
	}
	
	@Test

	public void forgotPwdLinkTest() {
		
		Assert.assertTrue(loginPage.isForgotPwdLink());
		
		
		
	}
	
	@Test
	
	public void loginTest() {
		
		
		loginPage.doLogin("haroon.testing@gmail.com", "12345");
		
		
	}

}
