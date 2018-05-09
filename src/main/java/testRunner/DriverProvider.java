package testRunner;

import org.openqa.selenium.WebDriver;

public class DriverProvider {

	private WebDriver driver;
	
	
	
	
	public WebDriver chromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bishnu\\Documents\\Jeevan QA Practise Material\\chromedriver.exe");
		driver = new org.openqa.selenium.chrome.ChromeDriver();		
		return driver;
		
	}
		
	public WebDriver firefoxDriver(){
		return driver;
		
	}
	
	
	public WebDriver safariWebDriver(){
		return driver;
		
	}
	
		
		
	
	
	
	
	
}
