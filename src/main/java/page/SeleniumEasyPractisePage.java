package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeleniumEasyPractisePage {

	// Elements for Single Input Field
	// ======================================================================
	@FindBy(how = How.XPATH, using = "//*[@id=\"user-message\"]")
	WebElement enterMessageInput;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")
	WebElement showMessageButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"display\"]")
	WebElement messageDisplayField;

	// Functions for Single Input Field
	// -----------------------------------------------------------------------------

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

	// ======================================================================
	// Elements for Input Two Fields
	@FindBy(how = How.XPATH, using = "//*[@id=\"sum1\"]")
	WebElement enterValueAField;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sum2\"]")
	WebElement enterValueBField;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")
	WebElement getTotalButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"displayvalue\"]")
	WebElement resultofAddingTwoDisplay;

	// ==========================================================================

	// Functions for Double Input Field
	// -------------------------------------------------------------------------------

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

	// Elements for Single CheckBox
	// =====================================================================
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"isAgeSelected\"]")
	WebElement checkBox;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"txtAge\"]")
	WebElement checkBoxMessage;
	
	
	// Functions for Single CheckBox
	// -------------------------------------------------------------------------------

	public void clickCheckBox() {
		checkBox.click();
		
	}
	
	
	public String checkBoxCheckedMessage() {
		String message = checkBoxMessage.getText(); 
		
		if (checkBoxMessage.isDisplayed()) {
			System.out.println("The message is displayed after clicking checkbox");
		}
				
		return message;
		
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}
	
	
	
	// Elements for Multiple CheckBox
		// =====================================================================
		
		
		@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label/input")
		WebElement multiplecheckBox1;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label/input")
		WebElement multiplecheckBox2;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[3]/label/input")
		WebElement multipleCheckBox3;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[4]/label/input")
		WebElement multipleCheckBox4;
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"check1\"]")
		WebElement checkVerificationButton ;
		
		
		
		// Functions for Multiple CheckBox
		// -------------------------------------------------------------------------------

		public void clickMultipleCheckBox1() {
			multiplecheckBox1.click();
			
		}
		

		public void clickMultipleCheckBox2() {
			multiplecheckBox2.click();
			
		}

		public void clickMultipleCheckBox3() {
			multipleCheckBox3.click();
			
		}

		public void clickMultipleCheckBox4() {
			multipleCheckBox4.click();
			
		}
	
	
		
		public String checkAllButton() { ;
			checkVerificationButton.click();
			String textToDeterminedCheckedOrUnchecked = checkVerificationButton.getText();
			return textToDeterminedCheckedOrUnchecked;
			
			
		}
	//---------------------------------------------------------------------------------------------	
	//Elements for Single RadioButton Demo
	@FindBy(how= How.XPATH, using= "/html/body/div[2]/div/div[1]/div/div[2]/ul/li/ul/li[1]/a")
	private WebElement radioDemo_inputFormsButton;
	
	@FindBy(how= How.XPATH, using= "/html/body/div[2]/div/div[1]/div/div[2]/ul/li/ul/li[1]/ul/li[3]/a")
	private WebElement radioDemo_radioButtonDemoButton;
	
	@FindBy(how= How.XPATH, using= "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
	private WebElement radioDemo_maleRadioButton;
	
	@FindBy(how= How.XPATH, using= "//*[@id=\"buttoncheck\"]")
	private WebElement radioDemo_getCheckedValueButton;
	
	@FindBy(how= How.XPATH, using= "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")
	private WebElement radioDemo_RadioMaleButtonIsCheckedText;


	

	//---------------------------------------------------------------------------------------------
	//Getters for Single RadioButton Demo
	
	public WebElement getRadioDemo_inputFormsButton() {
		return radioDemo_inputFormsButton;
	}

	public WebElement getRadioDemo_radioButtonDemoButton() {
		return radioDemo_radioButtonDemoButton;
	}

	public WebElement getRadioDemo_maleRadioButton() {
		return radioDemo_maleRadioButton;
	}

	public WebElement getRadioDemo_getCheckedValueButton() {
		return radioDemo_getCheckedValueButton;
	}

	public WebElement getRadioDemo_RadioMaleButtonIsCheckedText() {
		return radioDemo_RadioMaleButtonIsCheckedText;
	}

	
	


}