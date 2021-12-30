package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public  WebDriver getDriver() {
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 return driver;

	}

}
