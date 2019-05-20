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
		
		chroDriver.get("http://www.youtube.com/");
		chroDriver.manage().window().maximize();
		
		  WebElement signInbutton= chroDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		  
		  signInbutton.click();
		  
		  chroDriver.findElement(By.id("identifierId")).sendKeys("sumitk440@gmail.com");
		  chroDriver.findElement(By.id("identifierNext")).click();
		  
		  WebDriverWait wait = new WebDriverWait(chroDriver, 40);
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		  
		  chroDriver.findElement(By.name("password")).sendKeys("SKumiatr@#170690");
		  
		  chroDriver.findElement(By.id("passwordNext")).click();
		  chroDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  chroDriver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer']")).click();
			
		System.out.println("Subscribe button click successfully");
			
	}
	
}
