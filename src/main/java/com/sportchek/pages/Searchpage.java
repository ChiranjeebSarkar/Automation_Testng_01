//Page Factory 

package com.sportchek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchpage{
	WebDriver driver;
	/**

     * All WebElements are identified by @FindBy annotation

     */
	@FindBy(xpath="//input[@data-form-blocking='input']")
    WebElement searchbox;
	
	@FindBy(xpath="//input[@value='SEARCH']")
    WebElement search_button;
	
	
	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void search(String product) {
		// TODO Auto-generated method stub
		searchbox.sendKeys(product);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        search_button.click();
	}
	
}
