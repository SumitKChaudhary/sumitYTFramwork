package sumitYTFramwork;

 
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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

/* Test Case e
 * Sing in
 * play video
 * click on like button*/
public class TC3  extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void likeVideo()
	{
			Sumit_YTFLogin  signIn = new Sumit_YTFLogin(chroDriver,pr);
			
			signIn.youtubLogin("Sumitk440@gmail.com", "SKumiatr@#170690");
			
			Sumit_YTF_VideoPlay video_Play = new Sumit_YTF_VideoPlay(chroDriver,pr);	
			
			video_Play.videoPlay();
			
			WebElement likeButton_Click= chroDriver.findElement(By.xpath(pr.getProperty("videoLike")));
			
			likeButton_Click.click();
        
	}

}
