package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Multipletabs extends Amazonbase{
	
	
	
	

	@Test(priority=1)
	public void multitabsopen() throws InterruptedException
	{
		driver=launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	//	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(5000);
		
		String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
	//	WebElement web=driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']"));

		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[1]")).sendKeys(s);
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[2]")).sendKeys(s);
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[3]")).sendKeys(s);
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[4]")).sendKeys(s);
     String presentwin=driver.getWindowHandle();
     Set<String> g=driver.getWindowHandles();
   
   /*  for(String ss:g)
     {
    	 driver.switchTo().window(ss);
     	System.out.println(driver.getTitle());
     }*/
     
     //we cant use normal loop in sets y cause set is not index based
     List <String> ll=new ArrayList<String>(g);
 	
 	System.out.println(ll);
     for(int i=0;i<ll.size();i++)
     {
    	 driver.switchTo().window(ll.get(i));
      	System.out.println(driver.getTitle()); 
     }
	//converting set into list we can get elements in a index manner
	
  /* Iterator<String> iterate =g.iterator();
     
     while(iterate.hasNext())
     {
    	 
    	 driver.switchTo().window(iterate.next());
    	System.out.println(driver.getTitle());
     Thread.sleep(5000);
     }
      */
     driver.switchTo().window(presentwin);
    
	
	}
	
	
	
	

}