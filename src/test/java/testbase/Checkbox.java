package testbase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox extends Testbase{

	@Test
	public void testcheckbox() throws InterruptedException
	{
		
		WebDriver driver =launchbrowser("chrome");
		
		driver.get("https://www.zoho.com/signup.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[onclick='toggleTosField()']")).click();
	boolean c=driver.findElement(By.cssSelector("input[onclick='toggleTosField()']")).isEnabled();
	System.out.println(c);	
	Thread.sleep(3000);
		driver.quit();
		
	}
}
