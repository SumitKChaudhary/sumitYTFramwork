package sumitYTFramworkpages;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sumit_YTF_VideoPlay 
{
	public ChromeDriver chromeDriver;
	public Properties pr;
	public Sumit_YTF_VideoPlay(ChromeDriver chromeDriver, Properties pr)
	
	{
		this.chromeDriver=chromeDriver;
		this.pr=pr;
	}
	
	public void videoPlay()
	{
		chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		List<WebElement > videoClick=	chromeDriver.findElements(By.xpath(pr.getProperty("videoElement")));
		
		videoClick.get(1).click();
    
	}

}
