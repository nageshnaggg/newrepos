package Suitea;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import amazon.Amazonbase;

public class MouseoverTest extends Amazonbase {


	@Test()
	public void mousetes() throws InterruptedException {
		driver = launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
          
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();

//	Assert.assertTrue(driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isDisplayed(),"not displayed");

//	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Your Account']")).isDisplayed(),"not displayed your account");

	SoftAssert soft=new SoftAssert();
	soft.assertTrue(driver.findElement(By.xpath("//span[text()='Your Account']")).isDisplayed(),"not displayed your account");

	soft.assertTrue(driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isDisplayed(),"is dispalyed");
 System.out.println("hi bro");	
	soft.assertAll();
	}
	

	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
