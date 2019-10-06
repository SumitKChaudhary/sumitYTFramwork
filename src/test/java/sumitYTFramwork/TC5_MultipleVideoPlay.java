/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 06-Oct-2019
 *  FILE NAME  		: 	 TC5_MultipleVideoPlay.java
 *  PROJECT NAME 	:	 sumitYTFramwork
 * 	Class Time		:    9:29:35 am
 */
package sumitYTFramwork;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;

public class TC5_MultipleVideoPlay extends Sumit_YTFrameBaseClass
{
	@Test
	public void playYoutubeMultipleVideos() throws InterruptedException
	{
		// store all video elements in the list of web elements variable 

		List<WebElement> allElements= chroDriver.findElements(By.id(pr.getProperty("allVideo")));
		
		//fetch one by one and store another web elements variable 
		for (WebElement onVideoelement : allElements)
		{
			// click the video element which is get on onVideoelement variable 
			onVideoelement.click();
			
			Thread.sleep(5000);// wait for a second 
			chroDriver.navigate().back();// click the browser back button 
		}
	}

}
