package testRunner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.SeleniumEasyPractisePage;

public class TC_TwoInputField {
	
private WebDriver driver;
	
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		System.out.println("Running before method");
		
		
		DriverProvider tb = new DriverProvider();
		driver = tb.chromeDriver();
		System.out.println("Opening the browser");
		driver.navigate().to("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

		
			
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Closing the browser");
		driver.close();
	}
	
	

	@Test(groups= "SeleniumEasy")
	public void tc_twoInputFields(){
		
		SeleniumEasyPractisePage sep = PageFactory.initElements(driver,page.SeleniumEasyPractisePage.class );
		
		String numberA = "20";
		String numberB = "25";
		
		
		sep.enterNumberA(numberA);
		sep.enterNumberB(numberB);
		
		sep.clickGetTotal();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(sep.getResultofAddingTwoDisplay()));
		
		
		int expected = Integer.parseInt(numberA)+Integer.parseInt(numberB) ;
		int actual = Integer.parseInt(sep.verifyTheTotal());
		assertEquals(actual, expected);
		
		System.out.println("Test Passed for two value input");
		
					
	
	
	
	
	

}
	}
