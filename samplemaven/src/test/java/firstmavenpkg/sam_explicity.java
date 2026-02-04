package firstmavenpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sam_explicity {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		System.out.println(driver.findElement(By.id("visibleAfter")).getText());
		
	driver.findElement(By.id("visibleAfter")).click();
		driver.quit();
	}
}
