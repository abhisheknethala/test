package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sam_kb_mouse {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement obj= driver.findElement(By.id("APjFqb"));
		//driver.findElement(By.id("APjFqb"));
		//obj.sendKeys("India");
		Actions a=new Actions(driver);
		a.moveToElement(obj).click();
		a.keyDown(Keys.SHIFT);
		//a.sendKeys("India");
		a.sendKeys("hello");
		a.keyUp(Keys.UP).build().perform();
		a.contextClick().perform();
	}

}
