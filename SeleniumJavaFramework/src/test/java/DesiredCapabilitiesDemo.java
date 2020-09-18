import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");	
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		// Use this method to avoid Deprecated error 
        InternetExplorerDriverService service = new InternetExplorerDriverService.Builder().usingDriverExecutable(new File(projectpath+"/drivers/IEdriver/IEDriverServer.exe/"))
                .usingAnyFreePort()
                .build();
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.merge(caps);
        WebDriver driver = new InternetExplorerDriver(service, options);
		
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("ignoreProtectedModeSettings", true);
		
		//System.setProperty("webdriver.ie.driver", projectpath+"/drivers/IEdriver/IEDriverServer.exe/");
		//@SuppressWarnings("deprecation")
		//WebDriver driver = new InternetExplorerDriver(caps); 
		
        driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial"); 
	    
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
	     driver.close();
	     driver.quit();
 
	}

}
