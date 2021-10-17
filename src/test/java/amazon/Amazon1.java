package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Amazon1 {
	public WebDriver d;
	
	@Test(priority=2)
	public void website()
	{	
		
	
	 Select sell=new Select(select());
	sell.selectByIndex(4);
	 
	
	}
	
	@Test(priority=1)
	public WebElement select()
	{

		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	 d=new ChromeDriver();
		
d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

	 By drops=By.xpath("//select[@id='select-demo']");
	
  return  d.findElement(drops);
  
	
}
}