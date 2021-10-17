package amazon;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebLinks extends Amazonbase{
	
	 int a=0;
	 int b=0;
	

	@Test(priority=1)
	public void findlinks() throws InterruptedException
	{
		driver=launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
	//	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(5000);
		System.out.println((driver.findElements(By.tagName("a")).size()));
		WebElement footer=driver.findElement(By.xpath("//div[@class=\"navFooterVerticalRow navAccessibility\"]"));
        footer.findElements(By.tagName("a")).size();
       int c= footer.findElements(By.tagName("a")).size();
	System.out.println(c);
	
	List<WebElement> foot= footer.findElements(By.tagName("a"));
	 
	Iterator<WebElement> it=foot.iterator();
	
	  while(it.hasNext())
	  {
		  String url=it.next().getAttribute("href");
		  System.out.println(url);
	  try {
		  HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
	   huc.setRequestMethod("HEAD");
	   huc.connect();
	   int res=huc.getResponseCode();
	  System.out.println(res);
	  if(res>=400)
	  {
		  System.out.println("it is a broken link");
		 
		  a++;
	  }
	  else
	  {
		 System.out.println(" it is a valid link");
		 b++;
	  }
	  }
	  catch(IOException e){
		  e.printStackTrace();
	  }
	  
	  
	  }
	
	System.out.println(a);
	System.out.println(b);
	
	}

}