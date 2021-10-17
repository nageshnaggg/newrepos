package seleniumwebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium {

	
@Test
public void testapp()
{
	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	
	WebDriver cd=new ChromeDriver();
	cd.get("http://facebook.com");
	cd.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("8374566994");
//	cd.findElement(By.name("email")).sendKeys("8374566994");
	cd.findElement(By.id("pass")).sendKeys("password");
 cd.findElement(By.name("login")).click();
	
//	System.setProperty("webdriver.ie.driver","D:\\drivers\\IeDriverServer.exe");
//	WebDriver driver=new  InternetExplorerDriver();
//	driver.get("http://google.com");
//	driver.navigate();
//	System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());	



}      
	
	}


