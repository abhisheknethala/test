package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class samwindowhandling {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		String intialhandle=driver.getWindowHandle();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/imghp?hl=en&ogbl");
		System.out.println(driver.getWindowHandles().size());
		driver.switchTo().window(intialhandle);
		Thread.sleep(2000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		driver.quit();		
		
	}

}
