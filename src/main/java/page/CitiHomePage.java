package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CitiHomePage {
	
	
	
	@FindBy(how= How.XPATH, using = "/html/body/header/div[2]/div/div[1]/nav/ul/li[2]/a")
	private WebElement bankingButton;
	
	
	@FindBy(how= How.CSS, using = "#lending")
	private WebElement lendingButton;
	
	
	
	public WebElement getBankingButton() {
		return bankingButton;
	}



	public WebElement getLendingButton() {
		return lendingButton;
	}



	public void clickingBankingButton(){
		bankingButton.click();
	}
	
	

	public void clickingLendingButton(){
		lendingButton.click();
	}
	
	
	
	

}
