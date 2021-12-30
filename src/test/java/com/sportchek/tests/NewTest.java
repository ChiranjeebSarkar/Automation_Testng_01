package com.sportchek.tests;

import org.testng.annotations.Test;

import com.sportchek.pages.Searchpage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void testSearch() {
	  Searchpage searhPage =new Searchpage(driver);
	  searhPage.search("Shoes");
  }
  @BeforeClass
  public void beforeClass() {
	 WebDriverManager.chromedriver().setup();
	 
	 driver = new ChromeDriver();
	   driver.get("https://www.sportchek.ca/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
