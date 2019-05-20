package sumitYTFramwork;
/* TC 4
 *  Login
 *  Video play
 *  channel subscribe
 * */

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;

public class TC4 extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void channelSubscribtion()
	{
		chroDriver.navigate().to("http://www.youtube.com/");
		
		chroDriver.manage().window().maximize();
		
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
		  
		
		chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement subscribeButton = chroDriver.findElement(By.xpath("//*[contains(@aria-label, 'Subscribe to' )][1]"));
		  
		  //wait.until(ExpectedConditions.presenceOfElementLocated((By) subscribeButton));
		  
		subscribeButton.click();
		  
		  
	}

}
