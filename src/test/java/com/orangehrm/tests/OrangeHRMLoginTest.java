package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.oragehrm.pages.OrangeHRMLoginPage;

public class OrangeHRMLoginTest extends BaseTest{
  @Test
  public void loginTest() {
	  
	  WebDriver driver = getDriver();
	  OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage(driver);
	  loginPage.login();
	  System.out.println(" Hi testing for git push");
  }
}
