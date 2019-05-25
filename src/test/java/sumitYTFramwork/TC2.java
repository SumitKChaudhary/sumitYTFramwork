package sumitYTFramwork;

import org.testng.annotations.Test;
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
	public void clickSubscribeButtonaftersignin() throws InterruptedException
	{
		
			
			Sumit_YTFLogin signIn = new Sumit_YTFLogin(chroDriver);
		
			signIn.youtubLogin("sumitk440@gmail.com", "SKumiatr@#170690");
		
			chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			chroDriver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer'][1]")).click();
			
			System.out.println("Subscribe button click successfully");
			
	}
	
}
