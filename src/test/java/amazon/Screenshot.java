package amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot extends Amazonbase {

	@Test
	public void snapshot() throws IOException
	{	
		

		driver=launchbrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
	WebElement element=	driver.findElement(By.xpath("//img[@src=\"https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/Appliances-QC-PC-186x116--B08RDL6H79._SY116_CB667322346_.jpg\"]"));
		
		File screen =((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);	    
	File dest=new File("D://screenshot.png");
		FileUtils.copyFile(screen,dest);
	
	}
	
	
}
