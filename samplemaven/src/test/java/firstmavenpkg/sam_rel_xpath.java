package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam_rel_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-pid='2' or @class='gb_Z']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	//@aria-label='Search for Images'
	// @class='gb_Z'
	//@data-pid='23'
}
