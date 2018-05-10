package testRunner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CitiHomePage;
import page.SeleniumEasyPractisePage;

public class TC_SingleInputField {

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
	public void tc_SingleInputField(){
		SeleniumEasyPractisePage sep = PageFactory.initElements(driver,page.SeleniumEasyPractisePage.class );
		String message = "Hello My Name is Jeevan";
		
		sep.enterMessage(message);
		sep.clickShowMessage();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(sep.getMessageDisplayField()));
		
		System.out.println("The message retrieved from the page is " + sep.retrieveTheMessage());
		
		
		
		
	
		System.out.println("Test Passed");
		
	
	
	
	
}
	}
