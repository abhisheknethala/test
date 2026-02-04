package firstmavenpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam_alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		
		alert.dismiss();
		Thread.sleep(2000);
		
		driver.quit();
		

		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		//Thread.sleep(2000);
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.get("https://demo.guru99.com/test/delete_customer.php");
		driver1.findElement(By.name("cusid")).sendKeys("123456");
		driver1.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert alert1=driver1.switchTo().alert();
		String msg1=driver1.switchTo().alert().getText();
		System.out.println(msg1);
		Thread.sleep(2000);
		
		alert1.dismiss();
		Thread.sleep(2000);
		driver1.quit();*/
		
		
	}

}
