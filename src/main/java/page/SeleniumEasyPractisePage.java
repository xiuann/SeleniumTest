package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeleniumEasyPractisePage {

	//Elements for Single Input Field
	//======================================================================
	@FindBy(how= How.XPATH, using="//*[@id=\"user-message\"]")
	WebElement enterMessageInput;
	
	@FindBy(how= How.XPATH, using="/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")
	WebElement showMessageButton;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"display\"]")
	WebElement messageDisplayField;
	//======================================================================
	//Elements for Input Two Fields
	@FindBy(how= How.XPATH, using="//*[@id=\"sum1\"]")
	WebElement enterValueAField;
	
	
	@FindBy(how= How.XPATH, using="//*[@id=\"sum2\"]")
	WebElement enterValueBField;
	
	@FindBy(how= How.XPATH, using="/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")
	WebElement getTotalButton;
	
	
	@FindBy(how= How.XPATH, using="//*[@id=\"displayvalue\"]")
	WebElement resultofAddingTwoDisplay;
	
	//==========================================================================
	
//	Functions for Single Input Field
//	-----------------------------------------------------------------------------
	
	public WebElement getMessageDisplayField() {
		return messageDisplayField;
	}

	public void setMessageDisplayField(WebElement messageDisplayField) {
		this.messageDisplayField = messageDisplayField;
	}

	public void enterMessage(String message) {
		enterMessageInput.sendKeys(message);
				
	}
	
	public void clickShowMessage() {
		showMessageButton.click();
		
	}
	
	public String retrieveTheMessage() {
		String message = messageDisplayField.getText();
		return message;
		
	}
	
	//Functions for Double Input Field
//	-------------------------------------------------------------------------------

	public void enterNumberA(String number) {

		enterValueAField.sendKeys(number);
		
		}
	
	public void enterNumberB(String number) {

		enterValueBField.sendKeys(number);
		
		}
	
	public void clickGetTotal() {
		getTotalButton.click();
		
	}
	
	public String verifyTheTotal() {
		
		String result = resultofAddingTwoDisplay.getText();
		
	
		
		return result;
	}

	public WebElement getResultofAddingTwoDisplay() {
		return resultofAddingTwoDisplay;
	}

	public void setResultofAddingTwoDisplay(WebElement resultofAddingTwoDisplay) {
		this.resultofAddingTwoDisplay = resultofAddingTwoDisplay;
	}
	
	
	
	
	
	}
