package Suitea;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import amazon.Amazonbase;

public class Multipletabs extends Amazonbase{
	
	
	
	

	@Test(priority=1)
	public void multitabsopen() throws InterruptedException
	{
		driver=launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
	//	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(5000);
		
		String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
	//	WebElement web=driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']"));

		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[1]")).sendKeys(s);
	//	driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[2]")).sendKeys(s);
	//	driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[3]")).sendKeys(s);
	//	driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[4]")).sendKeys(s);
 String presentwin=driver.getWindowHandle();
     Set<String> g=driver.getWindowHandles();

	
	
     Iterator<String> iterate =g.iterator();
     
     while(iterate.hasNext())
     {
    	 
    	 driver.switchTo().window(iterate.next());
    	System.out.println(driver.getTitle());
     Thread.sleep(5000);
     }
     
     driver.switchTo().window(presentwin);
     
	
	}
	
	
	@AfterTest
	public void quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	

}