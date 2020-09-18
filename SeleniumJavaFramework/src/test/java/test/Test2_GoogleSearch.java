package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesPOM.GoogleSearchPage;
import PagesPOM.GoogleSearchPage2;

public class Test2_GoogleSearch {
	
	static WebDriver driver1;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
public static void googleSearchTest() {
		
		String projectpath = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
		driver1 = new ChromeDriver(); 
		
		GoogleSearchPage2 searchPageObj = new  GoogleSearchPage2(driver1);
		
		driver1.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("Selenium Tutorial");
		searchPageObj.clickSearchButton();
		
		driver1.close();
		
	}

}
