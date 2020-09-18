package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath; 
	static XSSFWorkbook workbook; 
	static XSSFSheet sheet;
	
	//Constructor
	public ExcelUtils(String excelPath, String sheetName) {
		try {
		//projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNum(1,1);
	}
	
	public static int getRowCount() {
		int rowCount=0;
		try {
			//projectpath = System.getProperty("user.dir");
			//workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of Rows :"+rowCount);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount=0;
		try {
			//projectpath = System.getProperty("user.dir");
			//workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No.of Columns :"+colCount);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
		
		public static String getCellDataString(int rowNum, int colNum) {
			String cellData=null;
			try {
			//projectpath = System.getProperty("user.dir");
			//workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			return cellData;
			
		}
		
		public static void getCellDataNum(int rowNum, int colNum) {
			try {
			//projectpath = System.getProperty("user.dir");
			//workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			
		}
		

}
