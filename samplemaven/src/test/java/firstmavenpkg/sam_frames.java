package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam_frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-bottom");
		WebElement a =driver.findElement(By.cssSelector("body"));
		System.out.println("bottom frame text:" + a.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		WebElement b=driver.findElement(By.id("content"));
		System.out.println(b.getText());
		
		//driver.switchTo().parentFrame();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElements(By.tagName("frame")).size());
	//	driver.switchTo().parentFrame().de
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		
	}
}
