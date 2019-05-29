package sumitYTFramwork;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

import org.testng.annotations.Test;


import sumitYTFramworkBase.Sumit_YTFrameBaseClass;
import sumitYTFramworkpages.Sumit_YTFLogin;

public class TC1  extends Sumit_YTFrameBaseClass
{
	
	@Test
	public void singinTrending()
	{
		Sumit_YTFLogin singin = new Sumit_YTFLogin(chroDriver, pr);
		
		singin.youtubLogin("sumit@docquity.com", "Docquitysumit#8090");
        
		WebElement trend_Option= chroDriver.findElement(By.linkText(pr.getProperty("trendingOption")));
		
		trend_Option.click();
		
	}
	

}
