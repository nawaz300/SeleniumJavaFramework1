package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	/* public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		testData(projectpath+"/excel/data.xlsx", "Sheet1");
		
	} */
	WebDriver driver;
	
	@BeforeTest
	public void setUpTest(){
	
		PropertiesFile.getProperties();
	
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	}
	
	@Test(dataProvider="test1Data")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.	findElement(By.id("txtUsername")).sendKeys(username);
		driver.	findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	
	@DataProvider(name = "test1Data")
	public Object[][] getData() {
		String projectpath = System.getProperty("user.dir");
		Object data[][] = testData(projectpath+"/excel/data.xlsx", "Sheet1");
		return data;
		
	}

	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount(); 
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
		
			}
			//System.out.println();
		}
		return data;
		
	}
	
}
