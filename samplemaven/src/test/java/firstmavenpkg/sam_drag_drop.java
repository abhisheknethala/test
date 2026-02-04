package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sam_drag_drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@class='placeholder']/li")).sendKeys("3000");
		//Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		act.dragAndDrop(From, To).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
