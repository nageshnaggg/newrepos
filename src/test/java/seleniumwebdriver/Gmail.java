package seleniumwebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Gmail {

public	WebDriver dd;
	@Test
	public void testapp() throws InterruptedException
	{
		
		
	System.setProperty("webdriver.chrome.driver","D:\\drivers.\\chromedriver.exe");
		
	    dd= new ChromeDriver();
		dd.get("https://accounts.google.com/signin/v2/identifier");
		dd.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rockey66699");
		dd.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		dd.findElement(By.xpath("//input[@name='password']")).sendKeys("nag66994");
		dd.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
	}	
		
		
@AfterTest
public void app() throws InterruptedException
{
Thread.sleep(5000);	
dd.quit();
}

	
	
	
	
	
	}
