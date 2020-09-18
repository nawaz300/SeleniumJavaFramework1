package test;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.tools.ant.taskdefs.optional.PropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import Demo.Log4jDemo;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGdemo {
	
	 WebDriver driver;
	 public static String browserName=null;
	// public static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	@BeforeTest
	public void setUpTest(){
		//String projectpath = System.getProperty("user.dir");	
		PropertiesFile.getProperties();
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
		//logger.info("browser started");
	}
	
	@Test
    public void googleSearchTest() {
		
		
		driver.get("https://google.com");
		//logger.info("Navigated To Google");
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	   
	}
	
	@AfterTest
    public void tearDownTest(){  
	  driver.close();
	  PropertiesFile.setProperties();
	  
  }

}
