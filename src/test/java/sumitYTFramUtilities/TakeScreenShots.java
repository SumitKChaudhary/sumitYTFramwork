package sumitYTFramUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots
{
	public static void shreenShots(ChromeDriver driver, String path) throws IOException
	{
		
		File screenShot_file= driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot_file, new File(path));
		
		
	}

}
