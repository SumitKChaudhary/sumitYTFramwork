package sumitYTFramwork;

/* Author 			: 	 Sumit Kumar Chaudhary
 * Class			:	 Login on youtube and click on trending form the side menu bar
 * Date of creation	:	 7 June 2019 
 * 
 * */
/* Test Case -- To verify the trending functionality after login
 * Test Case Steps 
1 Open browser
2. Hit the youtube URL in the address bar
3. click on sign in button
4. Fill the email id 
5. click on next button
6. fill the password
7. click on next button
8. User will redirect on youtube dashboard after login automatically
9. click on trending tab from the slid hamburger. 

*/
import org.testng.Assert;
import org.testng.annotations.Test;
import sumitYTFAssert.YTFAssertion;
import org.testng.annotations.Test;
import sumitYTFramUtilities.SumitYTFLogFile;
import sumitYTFramUtilities.TakeScreenShots;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;

public class TC1  extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void singinTrending() throws IOException, InterruptedException
	{
		Sumit_YTFLogin singin = new Sumit_YTFLogin(chroDriver, pr);
		
		
		singin.youtubLogin(pr.getProperty("email_Id"), pr.getProperty("password"));

		SumitYTFLogFile.captureLog("TC1", " 1. Login SuccessFully");
		
		

		WebElement trend_Option= chroDriver.findElement(By.linkText(pr.getProperty("trendingOption")));
		
		trend_Option.click();
		
		//Hard Assertion given by Selenium for compare two elements 
		//Here i'm comparing the URL which is get after click on trending from the side options
		Thread.sleep(500);
		String expectedResult = "https://www.youtube.com/feed/trending"; 
		Assert.assertEquals(chroDriver.getCurrentUrl(), expectedResult);
		
		
		SumitYTFLogFile.captureLog("TC1", "2. Trend Get click Successfully ");
		
		TakeScreenShots.shreenShots(chroDriver, "../YTFramework/MyScreenShotes/TrendsClick.png");
		
		SumitYTFLogFile.captureLog("TC1", "3. Screen shots Take Successfully");
		
		
	}
	

}
