package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	private WebDriver driver;
	private final String url= "https://www.saucedemo.com/";
	
	//locators
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector("h3[data-test='error']");
	
	//constructor
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void navigateTo(){
	if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}
	
	
	// perform login
	
	public void login(String username,String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(usernameField).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(passwordField).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(loginButton).click();
	}
	public String getErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}

}
