package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		
		ChromeOptions cc=new ChromeOptions();	
		cc.addArguments("disable-notifications");
		cc.addArguments("start-maximized");
	    cc.addArguments("headless");
		WebDriver  dd= new ChromeDriver(cc);
		dd.get("http://facebook.com");
		System.out.println(dd.getCurrentUrl());
	  
	//	dd.findElement(By.xpath("//input[@id='email']")).sendKeys("8374566994");
      // dd.findElement(By.xpath("//input[@id='pass']")).sendKeys("nagmaha");
	  // dd.findElement(By.xpath("//button[@name='login']")).click();

	 // dd.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("venkatesh venky");
	 //  dd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//dd.close();
	}

}
