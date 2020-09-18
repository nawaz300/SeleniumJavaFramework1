package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGdemo2 {
	
	 WebDriver driver;
	
	@BeforeTest
	public void setUpTest(){
		 
		
		//String projectpath = System.getProperty("user.dir");	
		//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
		//driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	}
	
	@Test
    public void googleSearchTest2() {
		
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	   
	}
	
	
	@Test
    public void googleSearchTest3() {
		
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	   
	}
	
	@AfterTest
    public void tearDownTest(){  
	  driver.close();
	}

}
