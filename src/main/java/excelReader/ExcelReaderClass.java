package excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReaderClass {
	

	    private static final String FILE_NAME = "resources/testData.xlsx";
	    private static  Object [][] store = null;
	    public static void main(String[] args) throws IOException {

	      
	    	
	            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
	            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	                                         
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            
	            store = new Object[sheet.getLastRowNum()][2];   
	            
	            
	            for(int i=0;i<sheet.getLastRowNum(); i++) {
	            	
	            		XSSFRow row = sheet.getRow(i);
	            	
	            		for(int j=0;j<=row.getLastCellNum(); j++) {
	            			XSSFCell cell = row.getCell(j);
	            			
	            			
	            			System.out.print(cell.getStringCellValue());
	            			System.out.println();
	            			
	            			store[row.getRowNum()][cell.getColumnIndex()] = cell;
	            			
	       		
	            			
	            			
	            		         		
	            		}
	            		
	            	}
	            	            
	            
	    	}
	         
	    
	    @DataProvider(name= "excelSheet")
	    public static Object[][] twoDimensionReturn(){
		   		   
		return store;
		   
	   }  
	            	
	            }
	            
	          
	            
	            
	            
	            
	            
	          
	         
      
	            
	
	       

	    
	