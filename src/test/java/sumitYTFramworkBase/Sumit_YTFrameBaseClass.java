package sumitYTFramworkBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class Sumit_YTFrameBaseClass
{
	public ChromeDriver chroDriver;
	@BeforeMethod
	public void browserLaunce()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chrom/chromedriver");
		
		chroDriver = new ChromeDriver();
		chroDriver.get("http://www.youtube.com/");
		chroDriver.manage().window().maximize();
		
	}
	//@Ignore
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		 Thread.sleep(500);
		 
		 chroDriver.close();
	}
	
	

}
