package seleniumwebdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Webdriver {
	
@Test
public void testapp()
{
	//System.setProperty("webdriver.edge.driver","D:\\drivers\\msedgedriver.exe");
    //EdgeDriver cd=new EdgeDriver();
//	cd.get("http://youtube.com");

System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
ChromeOptions fd=new ChromeOptions();
fd.addArguments("start-maximized");
//fd.addArguments("incognito");
//fd.addArguments("headless");
//fd.addArguments("enable-extensions");
fd.addArguments("user-data-dir=C:/Users/Nagesh/AppData/Local/Google/Chrome/User Data/");
WebDriver cd=new ChromeDriver(fd);
//cd.get("http://youtube.com");

	
/*	System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
  //  FirefoxProfile pro =FirefoxProfile();
	
	 ProfilesIni profile=new ProfilesIni();
	FirefoxProfile pro=profile.getProfile("Default User");
	 
	FirefoxOptions options =new FirefoxOptions();
	options.setProfile(pro);
	options.addArguments("-Private");

	
	FirefoxDriver fd= new FirefoxDriver(options);
	fd.get("http://youtube.com");*/
}

}
