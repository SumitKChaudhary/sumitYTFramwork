package sumitYTFramworkBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class Sumit_YTFrameBaseClass
{
	public ChromeDriver chroDriver;
	public Properties pr; 
	@BeforeMethod
	public void browserLaunce() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chrom/chromedriver");
		
		chroDriver = new ChromeDriver();
		chroDriver.get("http://www.youtube.com/");
		chroDriver.manage().window().maximize();
		
		File objectRepository_file = new File("../YTFramework/SumitYTFram_ObjectRepo.properties");
		FileInputStream fileInput = new FileInputStream(objectRepository_file);
		
		pr = new Properties();
		
		pr.load(fileInput);
		
	}
	//@Ignore
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		 Thread.sleep(2000);
		 
		 chroDriver.close();
	}

}
