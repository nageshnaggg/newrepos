package amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listen.class)
public class Amazon extends Amazonbase{
	
	 public	Properties pro;
	@Test(priority=1)
	public void login() throws InterruptedException, IOException
	{   
		try{
		 pro=new Properties();
		 String s= System.getProperty("user.dir")+"\\src\\test\\resources\\property.properties";
		    
		  FileReader reader=new FileReader(s);
	//FileInputStream fs= new FileInputStream(s);
	pro.load(reader);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		driver=launchbrowser(pro.getProperty("browser"));
		driver.navigate().to(pro.getProperty("url"));
		driver.findElement(By.xpath(pro.getProperty("signin"))).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).isDisplayed());
		driver.findElement(By.cssSelector(pro.getProperty("email"))).sendKeys(pro.getProperty("mobilenumber"));
		driver.findElement(By.cssSelector(pro.getProperty("continue"))).click();
		driver.findElement(By.cssSelector(pro.getProperty("password"))).sendKeys(pro.getProperty("passtext"));
		driver.findElement(By.cssSelector(pro.getProperty("submit"))).click();
		
		
	}

  @Test(priority=2)
	public void logout() throws InterruptedException
	{  Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(pro.getProperty("signoutmouse")))).build().perform();
	  boolean b=driver.findElement(By.linkText(pro.getProperty("signout"))).isDisplayed();
	System.out.println(b);
	}
	

  @AfterTest
	public void closeapp() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.close();
	}
	
	
	

}
