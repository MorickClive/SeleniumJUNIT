package Main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import webpage_AutoTrader.HomePage;
import webpage_Fashion.Portal;


public class JTEST extends Common {
	
	// Driver
	private WebDriver webDriver;	// Chrome Start up
	private HomePage webSite; 		// Navigations
	private static Actions builder; 		// Mouse actions
	
	// Test parameters
    static SpreadSheetReader sheetReader;
    static ArrayList<List<String>> Entries = new ArrayList<>();;
    
	// reports
    private static ExtentReports report;
    private static ExtentTest test;
    private static String reportFilePath = "Report.html";
    
    // helper vars
	private WebElement target; // custom capture
	private static int testNo = 0; // incremented and used to capture record handled
	private List<String> testDetails; // Details for row id respective for the test #
	
	
	/////
	//  Behaviours
	/////
	
	
	@BeforeClass
	public static void BeforeC(){
       
		// add from spreadsheet
		// this will be the data we are testing with, each entry is for a specific test.
		sheetReader = new SpreadSheetReader(System.getProperty("user.dir") + "\\res\\Automated_tests.xlsx");
		for(int x = 1; x <= 10; x++){
			Entries.add(sheetReader.readRow(x, "AutoTest"));
		}

		// Reports
        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("New User Login");
        extentHtmlReporter.config().setDocumentTitle("Report_UserInsert");
        
        report.attachReporter(extentHtmlReporter);
	}
	
	@Before
	public void Before(){	
		// The test we are on and generating
		testDetails = Entries.get(testNo);
        test = report.createTest("Automated Test #" + testDetails.get(0));
		
		// Prep Detail
		// check here for specific browser settings
        System.out.println(testDetails.get(8).toString());
        
		if(testDetails.get(8).toString().contentEquals("C")){
			System.out.println("Using Chrome.");
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();}
		else{ 	
			System.out.println("Using FireFox.");
			webDriver = new FirefoxDriver();}
		
		
		webSite = new HomePage();
		webSite = PageFactory.initElements(webDriver, HomePage.class);
		webDriver.navigate().to("http://www.autotrader.co.uk/");
        
		builder = new Actions(webDriver);
	}
	
	/////
	//  START OF TESTS
	/////
	
	// Functions appear to run in function name-toString order
	
	// Test 1 -- find a car
	@Test
	public void Test1(){
		test.log(Status.INFO, "<b>Input details: </b><br>"+String.valueOf(testDetails));
		test.log(Status.INFO, "This test does not make use of the Spreadsheet data, despite being able to call them");
		
		webSite.get_carSearch().click();
		
		// if the text is expected, succeed
		if(webDriver.findElement(By.xpath("//*[@id='main-content']/div[2]/h1")).getText().equals("Find New & Second Hand Cars for Sale")){
			test.log(Status.PASS, "Test Successful!");
		}else{
			test.log(Status.FAIL, "Test failed to reach car search page.");
		}
		
		// must end
		++testNo; // new test details
	}
	
	// Test 2 -- 
	@Test
	public void Test2(){
		test.log(Status.INFO, "<b>Input details: </b><br>"+String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 3 -- 
	@Test
	public void Test3(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 4 --
	@Test
	public void Test4(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 5 --
	@Test
	public void Test5(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 6 --
	@Test
	public void Test6(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 7 --
	@Test
	public void Test7(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 8 --
	@Test
	public void Test8(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 9 --
	@Test
	public void Test9(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	// Test 10 -- 
		// don't forget underscore - else it'll be placed in front of 1
	@Test
	public void Test_10(){
		test.log(Status.INFO,String.valueOf(testDetails));
		
		test.log(Status.FAIL, "This test has yet to be implemented.");
		//fail("This test has yet to be implemented.");
		
		// must end
		++testNo; // new test details
	}
	
	
	/////
	//  END OF TESTS
	/////
	
	@After
	public void After(){
		webDriver.quit();
	}
	
	@AfterClass
	public static void AfterC(){
		// allows generation of report
		report.flush();
	}
}

// previous system

//@Test @Ignore
//public void Test(){
//	
//	webDriver.navigate().to(webSite.getURL());
//	//webSite.goto_Information.siteMap();
//	 builder.moveToElement(webSite.goto_Main.getWomen()).perform();
//	//Sleep(5000);
//	// ktarget = webDriver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
//	
//	test.log(Status.INFO, "Test has run");
//	//assertEquals(inputDAT, expectedDAT);		
//}
//
//@Test @Ignore
//public void Test2(){
//	
//	webDriver.navigate().to(webSite.getURL());
//	//webSite.goto_Information.siteMap();
//	 builder.moveToElement(webSite.goto_Main.getWomen()).perform();
//	//Sleep(5000);
//	// ktarget = webDriver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
//	
//	test.log(Status.INFO, "Test has run");
//	//assertEquals(inputDAT, expectedDAT);		
//}

