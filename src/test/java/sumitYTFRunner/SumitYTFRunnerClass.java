package sumitYTFRunner;
/* Author 		:		Sumit Kumar Chaudhary
 * Class		:		Runner Class 
 * Purpose		:		Runner class take the keywords which is define in code from the testCase input file and run the test_case class
 * 						as per define keyword 
 * Date			:		9 June 2019 1 : 30 PM Sunday 
 * Project		:		Youtube Automation 
 * */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SumitYTFRunnerClass 
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		XmlSuite  suiteObject = new XmlSuite(); // suit Object
		suiteObject.setName("MY Yutube FrameWord Suite"); // Name Set
		
		XmlTest testObject = new XmlTest(suiteObject); //Test Object
		
		File testCaseInputFile = new File("../sumitYTFramwork/TestCaseInputFile/YoutubeAutomationTestCase.xls"); //test Case file
		
		Workbook myWorkbook = Workbook.getWorkbook(testCaseInputFile);
		
		Sheet testCase_Sheet = myWorkbook.getSheet(0);
		
		int rows = testCase_Sheet.getRows();
		
		ArrayList<XmlClass> al = new ArrayList<XmlClass>();
		
		for (int i=1 ; i<rows; i++)
		{
			Cell sheetCell = testCase_Sheet.getCell(5, i);
			
			if (sheetCell.getContents().equals("Y"))
			{
				Cell pkgName = testCase_Sheet.getCell(3,i);
				Cell class_name = testCase_Sheet.getCell(4, i);
				
				String classPath = pkgName.getContents()+"."+class_name.getContents();
				
				XmlClass xmClass = new XmlClass(classPath);// xmlClass
				
				al.add(xmClass);
			}
		}
		
		System.out.println(al.size());
		
		testObject.setClasses(al);
		
		ArrayList<XmlTest> al2 = new ArrayList<XmlTest>();
		
		al2.add(testObject);
		
		suiteObject.setTests(al2);
		
		ArrayList<XmlSuite> al3 = new ArrayList<XmlSuite>();
		
		al3.add(suiteObject);
		
		TestNG t = new TestNG();
		
		t.setXmlSuites(al3);
		t.run();
				
		
		
	}

}
