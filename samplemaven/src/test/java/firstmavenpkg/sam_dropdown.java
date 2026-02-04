package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sam_dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement obj= driver.findElement(By.name("country"));
		Thread.sleep(2000);
		Select ele=new Select(obj);
		ele.selectByValue("INDIA");
		Thread.sleep(2000); 
		//ele.selectByValue("")
		//Thread.sleep(2000);
		boolean abhi=obj.isDisplayed();
		boolean abhi1=obj.isEnabled();
		ele.selectByVisibleText("ANTARCTICA");
		
		System.out.println(abhi);
		System.out.println(abhi1);
		
		
		driver.quit();
		
		
	}
	

}
