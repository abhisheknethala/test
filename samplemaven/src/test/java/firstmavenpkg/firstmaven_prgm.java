package firstmavenpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.

//import org.openqa.selenium.chrome.ChromeDriver;

public class firstmaven_prgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//String pagetitle=driver.getTitle();
		//System.out.println(pagetitle);
		
		driver.quit();

	}

}
