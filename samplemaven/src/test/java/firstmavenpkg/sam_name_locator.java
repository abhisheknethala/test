package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam_name_locator {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("hello welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement usrnm= driver.findElement(By.name("user-name "));
		usrnm.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pwd= driver.findElement(By.name("password"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement lgin= driver.findElement(By.name("login-button"));//.click();
		lgin.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
