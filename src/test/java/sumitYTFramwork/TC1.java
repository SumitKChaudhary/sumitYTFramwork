package sumitYTFramwork;

/*-- TEST CASE -- 
 * 1. open browser
 * 2. hite the youtube URL in the address bar
 * 3. click on sign in button
 * 4. Fill the email id 
 * 5. click on next button
 * 6. fill the password
 * 7. click on next button
 * 8. User will redirect on youtube dashboard after loging automatically
 * 9. click on trending tab from the slid homeburger. 
 * */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TC1 
{
	ChromeDriver chroDriver;
	@BeforeMethod
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","/Users/sumitkumar/Downloads/chrom/chromedriver");
		
		 chroDriver = new ChromeDriver() ;
	}
	@Test
	public void singIn() throws InterruptedException
	{
		chroDriver.get("http://www.youtube.com/");
		chroDriver.manage().window().maximize();
		
		WebElement signInbutton= chroDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		
		signInbutton.click();
		
		chroDriver.findElement(By.id("identifierId")).sendKeys("sumitk440@gmail.com");
		chroDriver.findElement(By.id("identifierNext")).click();

		//getting error so wait required 
        
		WebDriverWait wait = new WebDriverWait(chroDriver, 40);
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))); 
        
        chroDriver.findElement(By.name("password")).sendKeys("SKumiatr@#170690");
        chroDriver.findElement(By.id("passwordNext")).click();
        
       // wait required here because when i run this code then permission prompt get receive 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Trending"))); 
        
		chroDriver.findElement(By.linkText("Trending")).click();
		
		
	}
	@Ignore
//	@AfterMethod
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(50000);
		chroDriver.close();
	}

}
