package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon2 {

	
	public WebDriver d;
	
	@Test(priority=2)
	public void website(WebElement xpath,int val)
	{	
		
	 Select sell=new Select(xpath);
	sell.selectByIndex(val);
	 
	
	}
	
	@Test(priority=1)
	public void select()
	{

		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	 d=new ChromeDriver();
		
d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

	WebElement xpath=d.findElement(By.xpath("//select[@id='select-demo']"));
	
  
		website(xpath,4);
	
}
}
