package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CitiHomePage;



public class SC_ClickingLendingHomeButton {
	private WebDriver driver;
	
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		System.out.println("Running before method");
		
		
		
		driver = DriverProvider.chromeDriver();
		driver.navigate().to("https://online.citi.com/US/login.do");

		
			
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Running after method");
		driver.close();
	}
	
	

	@Test
	public void tc_clickingLendingButton(){
		CitiHomePage chp = PageFactory.initElements(driver,page.CitiHomePage.class );
		
		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.elementToBeClickable(chp.getLendingButton()));
		
		
		
		
		
		chp.clickingLendingButton();

	
	}
	
	
	
	
	
	
	
	
	
	

}
