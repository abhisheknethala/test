package test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.googlesearchpage;

public class googlepagetest_POM {
	static WebDriver driver;
	public static void main(String[] args) {
		googlesearch();
		driver.quit();
	}
	public static void googlesearch() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		googlesearchpage.textbox_search(driver).sendKeys("india");
		//Thread.sleep(3000);
		googlesearchpage.textbox_search(driver).sendKeys(Keys.ENTER);
	}

}
