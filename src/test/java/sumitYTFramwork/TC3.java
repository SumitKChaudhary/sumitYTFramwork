package sumitYTFramwork;

 
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;
import sumitYTFramworkpages.Sumit_YTF_VideoPlay;
/*
* Author 			: 	 Sumit Kumar Chaudhary
* Class				:	 Login on youtube and like the video after play
* Date of creation	:	 7 June 2019 
* 
/* Test Case e
 * Sing in
 * play video
 * click on like button*/
public class TC3  extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void likeVideo() throws IOException
	{
			Sumit_YTFLogin  signIn = new Sumit_YTFLogin(chroDriver,pr);
			
			signIn.youtubLogin(pr.getProperty("email_Id"), pr.getProperty("password"));
			
			SumitYTFLogFile.captureLog("TC3", "1. Login Sucess fully");
			
			Sumit_YTF_VideoPlay video_Play = new Sumit_YTF_VideoPlay(chroDriver,pr);	
			
			video_Play.videoPlay();
			
			SumitYTFLogFile.captureLog("TC3", "2. Video Gets play");
			
			WebElement likeButton_Click= chroDriver.findElement(By.xpath(pr.getProperty("videoLike")));
			
			likeButton_Click.click();
			
			TakeScreenShots.shreenShots(chroDriver, "../YTFramework/MyScreenShotes/LikeVideo.jpg");
			
			SumitYTFLogFile.captureLog("TC3", "3. Screen taked successfully");
        
	}

}
