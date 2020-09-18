package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception  {
		test();
	}
	
	public static void test() throws Exception {
		
		//String projectpath = System.getProperty("user.dir");	
		//System.out.println("path = "+projectpath);
		
		//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
		//ChromeOptions options = new ChromeOptions();
		 //optional  
		// options.setAcceptInsecureCerts(true);
		//WebDriver driver = new ChromeDriver(options);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	    //facing invalid argument exception
		//driver.get("tinyupload.com");
		//driver.findElement(By.name("pole_plik")).click();
		
		
		driver.get("https://filewhopper.com/");
		driver.findElement(By.xpath("//label[contains(text(),'Choose file')]")).click();
		
		Runtime.getRuntime().exec("E:\\AutoIT Scripts\\FileUploadScript");
		
		Thread.sleep(3000);
		//driver.close();
		
	}

}
