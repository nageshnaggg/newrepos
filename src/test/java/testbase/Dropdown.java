package testbase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Testbase {


	@Test
	public void dropdownbox() throws InterruptedException
	{
		

	WebDriver driver =launchbrowser("chrome");
	
	driver.navigate().to("https://www.goindigo.in/");
	
	//driver.findElement(By.xpath("//input[@class='form-control or-src-city parsley-success']")).click();
	
	driver.findElement(By.xpath("//input[@name=\"passenger\"]")).click();
	
	driver.findElement(By.xpath("//div[@class=\"no-of-counts\"]/button[2]")).click();
	
	
	driver.findElement(By.xpath("//div[@class=\"no-of-counts\"]/button[2]")).click();

	
	
	
	
	
	
	
	
	
	
	
	
	//driver.navigate().back();
//	Thread.sleep(3000);
//WebElement from =driver.findElement(By.cssSelector("input[name='or-src']")).click();
/*
Select s= new Select(driver.findElement(By.cssSelector("input[name='or-src']")));
	
	s.selectByVisibleText("KOLKATA");
	
	Thread.sleep(5000);
	driver.quit();
	*/
	}
}