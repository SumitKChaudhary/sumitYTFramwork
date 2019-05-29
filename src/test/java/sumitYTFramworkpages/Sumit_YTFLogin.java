package sumitYTFramworkpages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sumitYTFramworkBase.Sumit_YTFrameBaseClass;


public class Sumit_YTFLogin 
{
	public ChromeDriver chromeDriver;
	public Properties pr;
	public Sumit_YTFLogin (ChromeDriver chromeDriver, Properties pr)
	{
		this.chromeDriver=chromeDriver;
		this.pr=pr;
	}
	
	public void youtubLogin(String email, String password)
	
	{
		// All locators using from the object directory and Base class load the directory
		WebElement signInbutton= chromeDriver.findElement(By.xpath(pr.getProperty("SignButton")));
		signInbutton.click();
	
		WebElement email_TextBox=  chromeDriver.findElement(By.id(pr.getProperty("email_ID_TextBox")));
		
		email_TextBox.sendKeys(email);
		
		WebElement eNextButton= chromeDriver.findElement(By.xpath(pr.getProperty("email_NextButton")));
		
		eNextButton.click();
	  		
		chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
		WebElement pass_TextFields= chromeDriver.findElement(By.name(pr.getProperty("pass_TextBox")));
		
		pass_TextFields.sendKeys(password);
	  
		WebElement pNextButton= chromeDriver.findElement(By.id(pr.getProperty("pass_NextButton")));
		
		pNextButton.click();

	}
}