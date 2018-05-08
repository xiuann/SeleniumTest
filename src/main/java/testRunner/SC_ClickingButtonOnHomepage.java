package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CitiHomePage;

public class SC_ClickingButtonOnHomepage {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		
		
		
		DriverProvider tb = new DriverProvider();
		driver = tb.chromeDriver();
		driver.navigate().to("https://online.citi.com/US/login.do");

		
			
	}
	
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	
	
	@Test
	public void tc_clickingBankingButton(){
		
		CitiHomePage chp = PageFactory.initElements(driver,page.CitiHomePage.class );
		
		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.elementToBeClickable(chp.getBankingButton()));
		
				
		chp.clickingBankingButton();
		
		
		
		
		
	}
	
	@Test
	public void tc_clickingLendingButton(){
		CitiHomePage chp = PageFactory.initElements(driver,page.CitiHomePage.class );
		
		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.elementToBeClickable(chp.getLendingButton()));
		
		
		
		
		
		chp.clickingLendingButton();

	
	}
	
	
	
	
	
	
	
	
	

}
