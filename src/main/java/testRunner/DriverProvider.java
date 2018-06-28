package testRunner;

import java.net.URL;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

	private static WebDriver driver;
	
	
	
	
	public static WebDriver chromeDriver(){
		System.out.println("Trying the exe file");
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "resources/linuxDriver/chromedriver.exe");
		
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
