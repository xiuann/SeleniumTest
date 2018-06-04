package stepDefinition;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SeleniumEasyPractisePage;
import testRunner.DriverProvider;



public class RadioButton {
	private WebDriver driver = null;
	private SeleniumEasyPractisePage sep = null;
	
	
	@Given("^I am on Selenium Easy page$")
	public void i_am_on_Selenium_Easy_page() throws Throwable {
	
		DriverProvider dp = new DriverProvider();
		driver = dp.chromeDriver();
		driver.navigate().to("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		sep = PageFactory.initElements(driver, page.SeleniumEasyPractisePage.class);
	   
	}
	
	@When("^I click Input Forms$")
	public void i_click_Input_Forms() throws Throwable {
		sep.getRadioDemo_inputFormsButton().click();
		
	  
	}

	@Then("^I click Radio Buttons Demo$")
	public void i_click_Radio_Buttons_Demo() throws Throwable {
		sep.getRadioDemo_radioButtonDemoButton().click();
	   
	}

	@Then("^I click Male Button under Radio Button Demo$")
	public void i_click_Male_Button_under_Radio_Button_Demo() throws Throwable {
	    
		sep.getRadioDemo_maleRadioButton().click();
		
		
	}

	@Then("^I click get checked value$")
	public void i_click_get_checked_value() throws Throwable {
		sep.getRadioDemo_getCheckedValueButton().click();
	  
	}

	@Then("^I should see Radio button Male is checked$")
	public void i_should_see_Radio_button_Male_is_checked() throws Throwable {
		String expected = "Radio button 'Male' is checked";
		String actual = sep.getRadioDemo_RadioMaleButtonIsCheckedText().getText();
		
		Assert.assertEquals(actual, expected);
	System.out.println("Radio Demo Single Button Male Checked Passed");
	}
	
	
	@After
	public void close() {
		driver.close();
	}
	
}
