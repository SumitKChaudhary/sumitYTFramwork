package sumitYTFramwork;
/* TC 4
 *  Login
 *  Video play
 *  channel subscribe
 * */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4
{
	ChromeDriver driver;
	@BeforeMethod
	public void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chrom/chromedriver");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void channelSubscribtion()
	{
		driver.navigate().to("http://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com");
		WebElement signInbutton= driver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		signInbutton.click();
		  driver.findElement(By.id("identifierId")).sendKeys("sumit@docquity.com");
		  driver.findElement(By.id("identifierNext")).click(); 
		  WebDriverWait	wait = new WebDriverWait(driver, 40);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		  driver.findElement(By.name("password")).sendKeys("Docquitysumit#8090");
		  driver.findElement(By.id("passwordNext")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("video-title")));
		  List<WebElement > videoClick=	driver.findElements(By.id("video-title"));
		  videoClick.get(1).click();
		  
		  
		  WebElement subscribeButton = driver.findElement(By.xpath("//*[contains(@aria-label, 'Subscribe to' )][1]"));
		  
		  //wait.until(ExpectedConditions.presenceOfElementLocated((By) subscribeButton));
		  
		  subscribeButton.click();
		  
		  
	}

}
