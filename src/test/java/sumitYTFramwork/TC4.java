package sumitYTFramwork;

/*
* Author 			: 	 Sumit Kumar Chaudhary
* Class				:	 Login on youtube and subscribe the channel after play Video
* Date of creation	:	 7 June 2019 
* 
/* TC 4
 *  Login
 *  Video play
 *  channel subscribe
 * */

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import sumitYTFramUtilities.SumitYTFLogFile;
import sumitYTFramUtilities.TakeScreenShots;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;
import sumitYTFramworkpages.Sumit_YTF_VideoPlay;

public class TC4 extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void channelSubscribtion() throws IOException
	{
		Sumit_YTFLogin signIn = new Sumit_YTFLogin(chroDriver,pr);
		
		signIn.youtubLogin(pr.getProperty("email_Id"), pr.getProperty("password"));
		
		SumitYTFLogFile.captureLog("TC4", "1. Login Success");
		
		Sumit_YTF_VideoPlay video_Play = new Sumit_YTF_VideoPlay(chroDriver,pr);
		
		video_Play.videoPlay();
		
		SumitYTFLogFile.captureLog("TC4", "1. Video play Successfully");
		
		//chroDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	
		WebElement channelSubscribe= chroDriver.findElement(By.xpath(pr.getProperty("channel_SubsButton1")));
		  
		if(channelSubscribe.isEnabled())
		{
			channelSubscribe.click();
			
			SumitYTFLogFile.captureLog("TC4", "Subscribed the channel");
			
			TakeScreenShots.shreenShots(chroDriver, "../YTFramework/MyScreenShotes/SubscribeChannel1.jpg");
			
			SumitYTFLogFile.captureLog("TC4", "Screen shot get capture");
		}
		else
		{
			System.out.println("Subscribe button element not found please check the element value");
		}
		
		
		  
		
		  
	}

}
