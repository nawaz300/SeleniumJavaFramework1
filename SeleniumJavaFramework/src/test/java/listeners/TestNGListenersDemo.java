package listeners;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
    
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		WebDriverManager.firefoxdriver().setup();
		  WebDriver driver = new FirefoxDriver();
	
	driver.get("https://google.com");
	
	driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
 
    driver.findElement(By.name("a")).sendKeys(Keys.RETURN);
    driver.close();

	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	
}
