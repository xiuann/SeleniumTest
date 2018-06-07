package testRunner;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.FacebookLoginPage;

public class FacebookLoginFeature {
	
	private WebDriver driver = null;
	private static  Object [][] store = null;
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		DriverProvider dp = new DriverProvider();
		driver = DriverProvider.chromeDriver();
		driver.navigate().to("http://www.facebook.com");
						
	}	
	
		
	@Test(dataProvider = "excelSheet")
		public void loginTest(String username, String password) {
		FacebookLoginPage fb = PageFactory.initElements(driver, page.FacebookLoginPage.class);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#email")));
		
		fb.getUseridInputField().sendKeys(username);
		fb.getPasswordInputField().sendKeys(password);
		
		fb.getLoginButton().click();
		
	}
		
	
	   
	    
	    
	    @DataProvider(name="excelSheet")
	    public Object[][] retrievingMethod() throws IOException {

	      
	    	
	            FileInputStream excelFile = new FileInputStream(new File("resources/testData.xlsx"));
	            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	                                         
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            
	            store = new Object[sheet.getLastRowNum() ][2];   
	            
	            System.out.println("There are x number of rows: "+ sheet.getLastRowNum());
	            
	            
	            
	            for(int i= sheet.getFirstRowNum(); i < sheet.getLastRowNum(); i++) {
	            	
	            		XSSFRow row = sheet.getRow(i);
	            		System.out.println("There are x number of columns for this row: "+"Row: "+ sheet.getRow(i).getRowNum() + " column: " + row.getLastCellNum());
	         
	            		for(int j= row.getFirstCellNum() ;j < row.getLastCellNum() ; j++) {
	            		
	            			XSSFCell cell = row.getCell(j);
	            			
	            			String string = cell.getStringCellValue();
	            			
	            			System.out.print(cell.getStringCellValue());
	            			System.out.print(" ");
	            			
	            			
	            			
	            			store[row.getRowNum()][cell.getColumnIndex()] = string;
	                    	
	            			      			
	            		         		
	            		}
	            		System.out.println(" ");
	            		
	            	}
	            
	     
	            
	            return store;
	            
	                       
	 
	            
	    }       
	    
	         

	@AfterMethod
	public void afterMethod() {
		driver.close();
		
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


