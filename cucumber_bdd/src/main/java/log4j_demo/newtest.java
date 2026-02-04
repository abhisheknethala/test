package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newtest {
	
	private static Logger logger= (Logger) LogManager.getLogger(log4jdemo.class);
	
	WebDriver driver;
	
	@BeforeClass
	public void abhi() { 
		System.out.println("ready to open browser");
		 driver=new ChromeDriver();
		 logger.info("Browser is open");
		 
		 driver.manage().window().maximize();
	}
	@Test
	public void abhi1() { 
		
		 logger.info("here is test open");
		 driver.get("https://www.google.com/");
		 String name= driver.getTitle();
		 System.out.println(name);
		 }
	@AfterMethod
	public void teardown() {
	driver.quit();
}
}
