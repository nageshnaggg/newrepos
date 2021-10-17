package amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Methods {

	public WebDriver driver;

	public void geturl(String url) {
		driver.get(url);
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public WebElement getxpathelement(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	public void sendkeys(String xpath, String sendvalue) {

		getxpathelement(xpath).sendKeys(sendvalue);

	}

	public void click(String xpath) {

		getxpathelement(xpath).click();
	}

	public void screenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		String c = "D://" + d.toString().replaceAll(":", "-");
		// File f = new File(c);
		// f.mkdir();
		File dest = new File(c + "//screenshot.png");
		FileUtils.copyFile(src, dest);
	}

	public void screenshots(WebElement element) throws IOException {
		File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String c = "D://" + d.toString().replaceAll(":", "-");
		File dest = new File(("D:c") + "//screenshot1.png");
		FileUtils.copyFile(src, dest);
	}

	public WebElement linktest(String link) {
		return driver.findElement(By.linkText(link));
	}

	public void clickk(String link) {

		linktest(link).click();

	}

	public void movemouse(String xpath) {
		Actions aa = new Actions(driver);
		aa.moveToElement(getxpathelement(xpath)).build().perform();
	}

	/*
	 * public boolean getxpathelemen(String xpath) { WebElement e =
	 * driver.findElement(By.xpath(xpath)); if (e == null) { return false; } else {
	 * return true; } }
	 * 
	 * public void openinnewtab(String xpath) { String newtab =
	 * Keys.chord(Keys.CONTROL, Keys.ENTER); while (!getxpathelemen(xpath)) {
	 * driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-next-rounded\"]")).
	 * click(); } getxpathelement(xpath).sendKeys(newtab); }
	 */
	public void openinnewtab(String xpath) {
		String newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);

		getxpathelement(xpath).sendKeys(newtab);
	}
	
 public String gettext(String xpath) {
	 
	return getxpathelement(xpath).getText();
	 
 }
}
