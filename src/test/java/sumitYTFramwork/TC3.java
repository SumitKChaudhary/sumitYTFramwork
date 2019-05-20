package sumitYTFramwork;

 
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;

/* Test Case e
 * Sing in
 * play video
 * click on like button*/
public class TC3  extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void playVideoTest()
	{
			chroDriver.navigate().to("https://www.youtube.com");
			WebElement signInbutton= chroDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
			signInbutton.click();
			chroDriver.findElement(By.id("identifierId")).sendKeys("sumit@docquity.com");
			chroDriver.findElement(By.id("identifierNext")).click(); 
		  		
			chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
			chroDriver.findElement(By.name("password")).sendKeys("Docquitysumit#8090");
		  
			chroDriver.findElement(By.id("passwordNext")).click();

			chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
			List<WebElement > videoClick=	chroDriver.findElements(By.id("video-title"));
			videoClick.get(1).click();
        
        	WebElement likeButton = chroDriver.findElement(By.xpath("//button[contains(@aria-label,'like this video')][1]"));
        	likeButton.click();
        	
        
	}

}
