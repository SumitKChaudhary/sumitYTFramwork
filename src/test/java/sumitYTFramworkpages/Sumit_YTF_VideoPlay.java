package sumitYTFramworkpages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sumit_YTF_VideoPlay 
{
	public ChromeDriver chromeDriver;
	public Sumit_YTF_VideoPlay(ChromeDriver chromeDriver)
	
	{
		this.chromeDriver=chromeDriver;
	}
	
	public void videoPlay()
	{
		chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		List<WebElement > videoClick=	chromeDriver.findElements(By.id("video-title"));
		videoClick.get(1).click();
    
    	WebElement likeButton = chromeDriver.findElement(By.xpath("//button[contains(@aria-label,'like this video')][1]"));
    	likeButton.click();
	}

}
