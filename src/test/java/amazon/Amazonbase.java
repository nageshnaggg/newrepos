package amazon;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonbase {

	
	public WebDriver driver ;
		
	public WebDriver launchbrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\drivers.\\chromedriver.exe");
		    
			ChromeOptions cc=new ChromeOptions();	
			cc.addArguments("disable-notifications");
			//cc.addArguments("start-maximized");
		//	cc.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver =  new ChromeDriver(cc);
		}
		else if(browser.equals("edge"))

		{
			System.setProperty("webdriver.edge.driver","D:\\drivers\\msedgedriver.exe");
		   driver =new EdgeDriver();
		   
		}
		else if(browser.equals("fox"))
		{
			
			System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
			 //   FirefoxProfile pro =FirefoxProfile();
				
		/*		 ProfilesIni profile=new ProfilesIni();
				FirefoxProfile pro=profile.getProfile("Default User");
				 
				FirefoxOptions options =new FirefoxOptions();
				options.setProfile(pro);
				options.addArguments("-Private");

				*/
				driver = new FirefoxDriver();
		}
			
	return driver;
	}
	
}
