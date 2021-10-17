package amazon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazongeneric extends Methods {

	@Test
	public void app() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers.\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		geturl("https://www.amazon.in/");
		System.out.println(gettitle());
		String xpath = "//a[@id='nav-link-accountList']";
		//Thread.sleep(5000);
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(getxpathelement(xpath)));
		openinnewtab(xpath);
		click(xpath);

		String email = "//input[@id='ap_email']";
		String mobilenumber = "8374566994";
		sendkeys(email, mobilenumber);
		screenshot(driver);
		String submit = "//input[@id='continue']";
		screenshots(getxpathelement(submit));
		click(submit);

		String password = "//input[@id='ap_password']";
		String passtext = "nag66994";
		sendkeys(password, passtext);
	//	Thread.sleep(3000);
		String submit1 = "//input[@id='signInSubmit']";
		click(submit1);
		System.out.println(gettitle());
		
		
		String movemenu = "//a[@id='nav-link-accountList']";
	    System.out.println(gettext(movemenu));
		movemouse(movemenu);
		String signout = "Sign Out";
		clickk(signout);

	}
}
