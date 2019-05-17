package sumitYTFramwork;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

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

public class TC2 
{
	ChromeDriver driver; 
	@BeforeMethod
	public void browserLaunce ()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chrom/chromedriver");
		//webdriver.chrome.driver
		
		driver = new ChromeDriver();
	
	}
	
	@Test
	public void clickSubscribeButtonaftersignin()
	{
		
			driver.get("http://www.youtube.com/");
			driver.manage().window().maximize();
		
		  WebElement signInbutton= driver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		  
		  signInbutton.click();
		  
		  driver.findElement(By.id("identifierId")).sendKeys("sumitk440@gmail.com");
		  driver.findElement(By.id("identifierNext")).click();
		  
		  WebDriverWait wait = new WebDriverWait(driver, 40);
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		  
		  driver.findElement(By.name("password")).sendKeys("SKumiatr@#170690");
		  
		  driver.findElement(By.id("passwordNext")).click();
		 
		 
			List<WebElement> all_Subscribe= driver.findElements(By.xpath("//div[@id='subscribe-button' and @class='style-scope ytd-shelf-renderer']"));
	
			all_Subscribe.get(0).click();
			
			
		
			
	}
	@Ignore
	//@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
