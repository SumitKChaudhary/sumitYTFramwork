package sumitYTFramwork;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Test Case e
 * Sing in
 * play video
 * click on like button*/
public class TC3 
{
	ChromeDriver chomeDriver; 
	@BeforeMethod
	public void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chrom/chromedriver");
		
		chomeDriver = new ChromeDriver();
	}
	@Test
	public void playVideoTest()
	{
		chomeDriver.navigate().to("https://www.youtube.com");
		WebElement signInbutton= chomeDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		signInbutton.click();
		  chomeDriver.findElement(By.id("identifierId")).sendKeys("sumit@docquity.com");
		  chomeDriver.findElement(By.id("identifierNext")).click(); 
		  WebDriverWait	wait = new WebDriverWait(chomeDriver, 40);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		  chomeDriver.findElement(By.name("password")).sendKeys("Docquitysumit#8090");
		  chomeDriver.findElement(By.id("passwordNext")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
        List<WebElement > videoClick=	chomeDriver.findElements(By.id("video-title"));
        videoClick.get(1).click();
        	WebElement likeButton = chomeDriver.findElement(By.xpath("//*[contains(@aria-label, 'like this video')[1]]"));//#waves  //*[@id="background"]
        	
       // 	wait.until(ExpectedConditions.presenceOfElementLocated((By) likeButton));
        	
        	likeButton.click();
        
	}

}
