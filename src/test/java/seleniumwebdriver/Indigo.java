package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Indigo extends Testbase {

/*	@Test()
	public void airline() throws InterruptedException {
		driver = launchbrowser("chrome");

		driver.navigate().to("https://www.goindigo.in/");
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).isDisplayed());
		driver.findElement(By.xpath("//input[@class='form-control or-src-city']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='wrap'])[1]/div[4]")).isDisplayed());
		driver.findElement(By.xpath("(//div[@class='wrap'])[1]/div[4]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[1]/div/div/div/div/div[4]"))
			//	.click();
	}*/
	

	@Test(priority=1)
	public void searchfight() throws InterruptedException {
		driver = launchbrowser("chrome");
        
		
		driver.navigate().to("https://www.goindigo.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	Thread.sleep(5000);
		
	WebElement element=	driver.findElement(By.xpath("//input[@class='form-control or-src-city']"));
	element.click();	
	element.sendKeys("mumbai");
	element.sendKeys(Keys.ENTER);
	
	
	Thread.sleep(2000);

	WebElement dest=	driver.findElement(By.xpath("//input[@class='form-control or-dest-city']"));
//dest.click();
	dest.sendKeys("kolkat");
	
dest.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
	}

	@Test(priority=2) 
	  public void passanger() throws InterruptedException 
	  {  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='passenger']")).click();
	  driver.findElement(By.xpath("(//button[@title='Up'])[1]")).click();
	  //Thread.sleep(2000);
	  driver.findElement(By.xpath("(//button[@title='Up'])[1]")).click();
	  driver.findElement(By.xpath("(//button[@title='Up'])[1]")).click();
	  Thread.sleep(2000);
	// System.out.println(driver.findElement(By.xpath("//div[@class='passenger-done-blck passanger-done-slt']/button")).isDisplayed());
	WebElement e=driver.findElement(By.xpath("//div[@class='passenger-done-blck passanger-done-slt']/button"));
	Actions a=new Actions(driver);
	a.moveToElement(e).click().perform();
	   
	   }
	  
	  @Test(priority=3)
	  public void currency() throws InterruptedException 
	  {
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select form-control bw-currency-list']")).click();
	  
	  driver.findElement(By.linkText("US Dollars")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//label[@for='students']")).click();
	  
	 // driver.findElement(By.linkText("//span[text()='Search Flight']")).click();
  driver.findElement(By.xpath("//div[@class='col-md-5 col-12 padd-right ml-auto']/button/span")).click();
	  }
	
}
