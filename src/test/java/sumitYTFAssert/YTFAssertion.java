package sumitYTFAssert;

/* Author 		:		Sumit Kumar Chaudhary
 * Class		:		YTFAssertion 
 * Purpose		:		Assertion class compare two value actual and expected for
 * 					    ensuring that case working fine or not as per requirement
 * Date			:		8 June 2019 10 : 24 AM Sunday 
 * Project		:		Youtube Automation 
 * */

public class YTFAssertion
{
	
	
	public static Boolean ytfAssert(String expected, String Actual, boolean testMessage)
	{
		
		
		if (expected.equals(Actual))
		{
			
			 System.out.println(testMessage);
			return true;

		}
		else 
		{
			
			System.out.println(testMessage);
			return false;
		}
	}

}
