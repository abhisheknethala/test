package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.loginpagefactory;
public class loginpagefactorytest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		loginpagefactory pagefactorylogin;
		
		driver = new ChromeDriver();
		pagefactorylogin = new loginpagefactory(driver);
		Thread.sleep(2000);
		
		pagefactorylogin.navigateTo();
		pagefactorylogin.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
		pagefactorylogin.navigateTo();
		pagefactorylogin.login("invalid_user", "invalid_sauce");
		Thread.sleep(2000);
		
		System.out.println(pagefactorylogin.getErrorMessage());
	
		
		driver.quit();
		
	}
	

}
