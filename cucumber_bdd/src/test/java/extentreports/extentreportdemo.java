package extentreports;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportdemo{
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeMethod
	public void starttest() {
		extent=new ExtentReports();
		spark=new ExtentSparkReporter("target/Spark.html");
	}
	@Test

	public void extenttest() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		
		extent.attachReporter(spark);
		
		// create a test node in report
		ExtentTest test=extent.createTest("Homepage Test").assignAuthor("abhi").assignCategory("regression").assignDevice("chrome");
		test.pass("HomePage Successfull");
		test.info("value entered");
		test.pass("login test completed successfully");
		
		// create a test node in report
		ExtentTest test1=extent.createTest("loginfail Test").assignAuthor("abhi").assignCategory("smoke").assignDevice("chrome");
		test1.pass("HomePage Successfull");
		test1.info("value entered");
		test1.pass("Homepage test fails");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("Google"))
		{
			test.log(Status.PASS, "navigated top specified url");
		}
		else {
			test.log(Status.FAIL, "test failed");
		}
				
		driver.quit();
	}
	@AfterMethod
	public void teardown() {
		extent.flush();
	}

}
