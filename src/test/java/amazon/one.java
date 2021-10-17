package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class one {
	public WebDriver d;

	@Test(priority = 1)
	public void website() throws InterruptedException

	{
		select("//select[@id='select-demo']", "Friday");
	}

	public void select(String xpath, String value) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		Thread.sleep(5000);

		Select sell = new Select(d.findElement(By.xpath(xpath)));
		sell.selectByVisibleText(value);

	}

}
