/* @Author 		:		Sumit Kumar
 * Class Name	:		SumitYTFLogFile
 * Perpose		:		Configor the logcapute File and Define message and Class name on permitrised method
 * Date			:		7 June 2019
 * */
package sumitYTFramUtilities;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class SumitYTFLogFile
{

	public static void captureLog(String className, String logMessage)
	{
		// Cofigure the log setting file 
		DOMConfigurator.configure("../sumitYTFramwork/LogCaptureFile.xml");
		
		//Take Appache 4G logger class's get logger static method. 
		
		Logger l = Logger.getLogger(className);
		l.info(logMessage);
	}
}
