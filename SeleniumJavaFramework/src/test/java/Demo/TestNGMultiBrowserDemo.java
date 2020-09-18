package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is :"+browserName);
		System.out.println("Thread id :"+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
			//driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
				//driver = new ChromeDriver();
				WebDriverManager.firefoxdriver().setup();
				   driver = new FirefoxDriver();
				}
			else if(browserName.equalsIgnoreCase("ie")) {
				//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
				//driver = new ChromeDriver();
				WebDriverManager.iedriver().setup();
				   driver = new InternetExplorerDriver();
				}
	}
	@Test
	public void test1() throws Exception {
		
		driver.get("https://google.com");
		Thread.sleep(4000);
	   
	}
	
	@AfterTest
    public void tearDownTest() {  
	  driver.close(); 
	  System.out.println("Test Completed Successfully");
	  
  }

}
