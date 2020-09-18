package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		 
		test();
		
	}
	
	public static void test() throws Exception {
		     
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("ABCD"); 
	    
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	   // driver.findElement(By.linkText("https://www.simplilearn.com/selenium-tutorial-article")).click();
	    
	 // Waiting 30 seconds for an element to be present on the page, checking
	    // for its presence once every 5 seconds.  
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	 //With the availability of Selenium v3.11.0 the constructor of FluentWait have changed. Now the argument type for withTimeout and pollingEvery is Duration.   			
	         .withTimeout(Duration.ofSeconds(30))
	        .pollingEvery(Duration.ofSeconds(2))
	        .ignoring(NoSuchElementException.class);   

	    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	      public WebElement apply(WebDriver driver) {
	        WebElement linkElement =  driver.findElement(By.partialLinkText("ABCD - NIMH Data Archive - NIH"));
	        
	        if(linkElement.isDisplayed()) {
	        	System.out.println("Elment Found");
	        }
	        return linkElement;
	    }
	    });
	    element.click();
	    Thread.sleep(3000);
	    driver.close();
	    driver.quit();
		
	}



}
