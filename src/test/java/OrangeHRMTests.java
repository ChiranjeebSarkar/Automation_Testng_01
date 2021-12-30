import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class OrangeHRMTests {
	WebDriver driver ;
	
	
  @Test
  public void Test1() {
	  
	  
	 /* driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	//input[@id='btnLogin']
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']")));
	  int rows = driver.findElements(By.xpath("//tr[@class='odd' or @class='even']")).size();
	  System.out.println(rows);
	  //To print all the contents of the rows from a table using for loop
	  for(int i =1 ;i<=rows ;i++)
	  {
		  
		  String Contents = driver.findElement(By.xpath("(//tr[@class='odd' or @class='even'])["+i+"]")).getText();
		  System.out.println(Contents);
	  } */
	  
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  //
	   driver = new ChromeDriver();
	   driver.get("https://www.sportchek.ca/");
driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("24122021");
  }
  
  
  ////input[@name='bdaytime']
  
  
  @AfterClass
  public void afterClass() {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.quit();
	  
  }

}
