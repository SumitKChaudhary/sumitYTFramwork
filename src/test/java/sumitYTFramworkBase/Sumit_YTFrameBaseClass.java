package sumitYTFramworkBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

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
	
	public void closeBrowser()
	{
		 chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 chroDriver.close();
	}
	
	

}
