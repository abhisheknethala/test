package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_gl_india {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement srch=driver.findElement(By.id("APjFqb"));
		srch.sendKeys("india");
		srch.sendKeys(Keys.ENTER);
		driver.quit();
		
	}

}
