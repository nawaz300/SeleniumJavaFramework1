package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		seleniumWaits();
		
	}
	
	public static void seleniumWaits() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250ms default polling time
		
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdf")));
	    
	    //driver.findElement(By.name("abcd")).click();
	    
	    driver.close();
	    driver.quit();

		
	}

}
