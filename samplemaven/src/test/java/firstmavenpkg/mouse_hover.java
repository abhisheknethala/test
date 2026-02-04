package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement element= driver.findElement(By.linkText("Images"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
