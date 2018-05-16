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

public class TC_CheckBox1 {
	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		System.out.println("Running before method");
		
		
		DriverProvider tb = new DriverProvider();
		driver = tb.chromeDriver();
		System.out.println("Opening the browser");
		driver.navigate().to("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		

		
			
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Closing the browser");
		driver.close();
	}
	
	

	@Test(description ="Test_For_Single_CheckBox",groups= "SeleniumEasy")
	public void tc_singleCheckBox(){
		SeleniumEasyPractisePage sep = PageFactory.initElements(driver,page.SeleniumEasyPractisePage.class );

		
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(sep.getCheckBox()));
		
		sep.clickCheckBox();
		String actual = sep.checkBoxCheckedMessage();
		String expected = "Success - Check box is checked" ;
		assertEquals(actual, expected);
		
		
	
}
	
	
	
	@Test(description ="Test_To_Check_MultipleCheckBox_AllChecked",groups= "SeleniumEasy")
	public void tc_MultipleCheckBox_Checked(){
		SeleniumEasyPractisePage sep = PageFactory.initElements(driver,page.SeleniumEasyPractisePage.class );
		sep.clickMultipleCheckBox1();
		sep.clickMultipleCheckBox2();
		sep.clickMultipleCheckBox3();
		sep.clickMultipleCheckBox4();
		System.out.println(sep.checkAllButton());
		
	}
		
		
		
	@Test(description ="Test_To_Check_MultipleCheckBox_UnChecked",groups= "SeleniumEasy")
	public void tc_MultipleCheckBox_Unchecked(){
			SeleniumEasyPractisePage sep = PageFactory.initElements(driver,page.SeleniumEasyPractisePage.class );
			sep.clickMultipleCheckBox1();
			sep.clickMultipleCheckBox2();
			sep.clickMultipleCheckBox3();
			sep.clickMultipleCheckBox4();
			System.out.println(sep.checkAllButton());
	}
	
	

}
