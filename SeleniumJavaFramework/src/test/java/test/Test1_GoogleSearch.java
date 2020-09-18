package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesPOM.GoogleSearchPage;

public class Test1_GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectpath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
		driver = new ChromeDriver(); 
		
		driver.get("https://google.com");
		
		GoogleSearchPage.text_search(driver).sendKeys("Selenium Tutorial");  
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
	}

}
