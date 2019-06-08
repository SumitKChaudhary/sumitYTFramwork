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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;

/* Author 			: 	 Sumit Kumar Chaudhary
 * Class			:	 Login on youtube and click on subscribe button
 * Date of creation	:	 7 June 2019 
 * 
 * */
/*-- TEST CASE -- 
 * 1. open browser
 * 2. hite the youtube URL in the address bar
 * 3. click on sign in button
 * 4. Fill the email id 
 * 5. click on next button
 * 6. fill the password
 * 7. click on next button
 * 8. User will redirect on youtube dashboard after loging automatically
 * 9. click on subscribe buttton
 * */

public class TC2  extends Sumit_YTFrameBaseClass
{	
	@Test
	public void clickSubscribeButtonaftersignin() throws IOException 
	{
		
			
			Sumit_YTFLogin signIn = new Sumit_YTFLogin(chroDriver, pr);
		
			signIn.youtubLogin(pr.getProperty("email_Id"), pr.getProperty("password"));

			SumitYTFLogFile.captureLog("TC2", " 1. Login SuccessFully");
		
			chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			WebElement Click_subscribeButton= chroDriver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
			Click_subscribeButton.click();
			
			SumitYTFLogFile.captureLog("TC2", " 2. Subscribe button gets click successfully");
			
			TakeScreenShots.shreenShots(chroDriver, "../YTFramework/MyScreenShotes/ClickSubscribeButton.jpg");
			
			SumitYTFLogFile.captureLog("TC2",  "3. Screen get Tacked");
			
	}
	
}
