import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
	String projectpath = System.getProperty("user.dir");	
	System.out.println("path = "+projectpath);
	
	System.setProperty("webdriver.gecko.driver", projectpath+"/drivers/geckodriver/geckodriver.exe/");	
    WebDriver driver = new FirefoxDriver();	
	
	//System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe/");	
	//WebDriver driver = new ChromeDriver(); 
	
	//System.setProperty("webdriver.ie.driver", projectpath+"/drivers/IEdriver/IEDriverServer.exe/");
	//WebDriver driver = new InternetExplorerDriver(); 
	
	driver.get("https://www.seleniumhq.org/");
	/* try {
	  Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace(); 
	} */
	// driver.close();	
	}
	
	}


