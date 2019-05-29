package sumitYTFramwork;
/* TC 4
 *  Login
 *  Video play
 *  channel subscribe
 * */

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;
import sumitYTFramworkpages.Sumit_YTF_VideoPlay;

public class TC4 extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void channelSubscribtion()
	{
		Sumit_YTFLogin signIn = new Sumit_YTFLogin(chroDriver,pr);
		
		signIn.youtubLogin("sumitk440@gmail.com", "SKumiatr@#170690");
		
		Sumit_YTF_VideoPlay video_Play = new Sumit_YTF_VideoPlay(chroDriver,pr);
		
		video_Play.videoPlay();
		
		chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	WebElement channelSubscribe = chroDriver.findElement(By.xpath("//*[contains(@aria-label, 'Subscribe to' )][1]"));
	
		WebElement channelSubscribe= chroDriver.findElement(By.xpath(pr.getProperty("channel_SubsButton")));
		  //wait.until(ExpectedConditions.presenceOfElementLocated((By) subscribeButton));
		  
		channelSubscribe.click();
		  
		  
	}

}
