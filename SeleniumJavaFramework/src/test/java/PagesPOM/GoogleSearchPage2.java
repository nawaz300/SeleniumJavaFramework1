package PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage2 {

	WebDriver driver; 
	By text_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPage2(WebDriver driver1) {
		this.driver = driver1;
	}
	
	public void setTextInSearchBox(String text) {
		
	driver.findElement(text_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
			
		}
	
	
}
