package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadioButtonPage {
	@FindBy(how= How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
	private WebElement maleRadioButton;
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")
	private WebElement femaleRadioButton;
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")
	private WebElement textFieldCheck;
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"buttoncheck\"]")
	private WebElement getCheckedValueButton;
	
		

	public void clickMaleButton() {
		maleRadioButton.click();
			
	}
	
	
	public void clickGetCheckedValue() {
		getCheckedValueButton.click();
	}
	
	
	public String checkReturnedText() {
		String text = textFieldCheck.getText();
		return text;
	}
	
	
	public void clickFemaleButton() {
		femaleRadioButton.click();
	}	
	
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}


	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}
	
}
