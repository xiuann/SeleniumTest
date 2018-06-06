package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
	
	@FindBy(how= How.CSS, using ="#email")
	private WebElement useridInputField;
	
	@FindBy(how= How.CSS, using="#pass")
	private WebElement passwordInputField;
	
	@FindBy(how= How.CSS, using="#loginbutton")
	private WebElement loginButton;

	
	//Methods for LogIn
	
	public WebElement getUseridInputField() {
		return useridInputField;
	}

	
	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	
	

}
