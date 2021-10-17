package amazon;



import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover extends Amazonbase 
{
	


	@Test(priority=1)
	public void mousetest() throws InterruptedException
	{
		driver=launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
		
		Actions a =new Actions(driver);
	
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();

	//	
	//	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	//	Thread.sleep(5000);
}
	
	
	
	
}