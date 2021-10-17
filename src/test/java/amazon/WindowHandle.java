package amazon;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandle extends Amazonbase{
	
	
	
	
	
	
	

	@Test(priority=1)
	public void windowtest() throws InterruptedException
	{
		driver=launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.cssSelector("img[alt='Pay your credit card bill on Amazon']")).click();		
        System.out.println(driver.getTitle());
       System.out.println(driver.getWindowHandles());
       
	Set<String> s=driver.getWindowHandles();
	
	Iterator<String> i=s.iterator();
	
	String parent=i.next();
	String child=i.next();
	
	if(parent!=child)
	{
		driver.switchTo().window(child);
	}
	else
	{
	
		driver.switchTo().window(parent);
	
	}
	//WebDriverWait wait = new WebDriverWait(driver,20);
	;
	driver.findElement(By.cssSelector("[id='ap_email']")).sendKeys("nicejobman");
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
	
	}	









}
