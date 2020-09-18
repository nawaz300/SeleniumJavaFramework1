package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class ExtentReportsDemo {
 
	 private static WebDriver driver = null;
	 static ExtentTest test1;
	
	public static void main(String[] args) { 
		
		
		// initialize the HtmlReporter
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/extentRep1.html");
		
		//           ExtentReports extent = new ExtentReports();
		//--ver 3.0--ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//initialize ExtentReports and attach the Reporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
	    test1 = extent.createTest("Google Search Test One","Test to validate");   
		 
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		//String projectpath = System.getProperty("user.dir");	
		//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
		//WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test case");
        driver.get("https://google.com");
        test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
		test1.pass("Entered text in searchBox");
	    driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	    test1.pass("Pressed Enter Key");
	    
	    //driver.close();
	    //driver.quit();
	    test1.pass("closed the browser");
	    
	    test1.info("Test completed");
	    
	    //calling flush writes everything to the log files
	    extent.flush();
	}
	
}
