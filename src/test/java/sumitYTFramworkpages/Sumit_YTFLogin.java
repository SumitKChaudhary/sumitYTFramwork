package sumitYTFramworkpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sumit_YTFLogin 
{
	public ChromeDriver chromeDriver;
	public Sumit_YTFLogin (ChromeDriver chromeDriver)
	{
		this.chromeDriver=chromeDriver;
	}
	
	public void youtubLogin(String email, String password)
	{
		chromeDriver.navigate().to("https://www.youtube.com");
		WebElement signInbutton= chromeDriver.findElement(By.xpath("(//paper-button[@id='button']/yt-formatted-string)[2]"));
		signInbutton.click();
		chromeDriver.findElement(By.id("identifierId")).sendKeys(email);
		chromeDriver.findElement(By.id("identifierNext")).click(); 
	  		
		chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
		chromeDriver.findElement(By.name("password")).sendKeys(password);
	  
		chromeDriver.findElement(By.id("passwordNext")).click();

	}
}