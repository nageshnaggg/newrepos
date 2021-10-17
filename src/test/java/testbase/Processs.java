package testbase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Processs extends Testbase {

	@Test
	public void app() throws InterruptedException
	{
	WebDriver driver =launchbrowser("chrome");
	
	driver.get("http://facebook.com");
String b=driver.getCurrentUrl();
System.out.println(b);

String c=driver.getTitle();
System.out.println(c);
//boolean f =driver.findElement(By.cssSelector("input#email")).isEnabled();
//System.out.println(f);	
driver.findElement(By.cssSelector("input#email")).sendKeys("8374566994");
String g=driver.findElement(By.cssSelector("input#email")).getAttribute("value");
System.out.println(g);	
Thread.sleep(5000);
	
	//driver.findElement(By.cssSelector("input#pass")).sendKeys("nag");
	
	//driver.findElement(By.xpath("//button[@name='login']")).click();
	
	//Thread.sleep(5000);	
		driver.quit();
		
	}
}
