package firstmavenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam_radio_checkbx_btn {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demo.guru99.com/test/radio.html");
	WebElement obj1=driver.findElement(By.id("vfb-7-1"));
	obj1.click();
	System.out.println(obj1.isEnabled());
	System.out.println(obj1.isDisplayed());
	System.out.println(obj1.isSelected());
	driver.quit();
}
}
