package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.loginpage;


public class loginpagetest {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	loginpage Loginpage;
	
	driver = new ChromeDriver();
	Loginpage = new loginpage(driver);
	Thread.sleep(2000);
	
	Loginpage.navigateTo();
	Loginpage.login("standard_user", "secret_sauce");
	Thread.sleep(2000);
	Loginpage.navigateTo();
	Loginpage.login("invalid_user", "invalid_sauce");
	Thread.sleep(2000);
	
	System.out.println(Loginpage.getErrorMessage());
	Thread.sleep(2000);
	
	driver.quit();

}
}