package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

	private static WebDriver driver;
	
	
	
	
	public static WebDriver chromeDriver(){
		System.out.println("Trying the exe file");
		
		System.setProperty("webdriver.chrome.driver", "test/resources/chromedriver_linux.exe");
		
		driver = new ChromeDriver();	
		
		System.out.println("The driver is working");
		
		return driver;
		
	}
		
	public WebDriver firefoxDriver(){
		return driver;
		
	}
	
	
	public WebDriver safariWebDriver(){
		return driver;
		
	}
	
		
		
	
	
	
	
	
}
