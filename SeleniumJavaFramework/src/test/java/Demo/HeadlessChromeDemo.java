package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}

 public static void test() {
	 
	 WebDriverManager.chromedriver().setup();
	 
	 ChromeOptions options = new ChromeOptions();
	 //optional  
	 options.addArguments("window-size=1366,768");
	 
	 options.addArguments("--headless");
	 
	 WebDriver driver = new ChromeDriver(options);
	 
	 driver.get("https://google.com");
	 System.out.println(driver.getTitle() ); 

		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 
	    driver.close();
	    driver.quit();
	    System.out.println("Completed");
	}
	
}
