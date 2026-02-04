package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagefactory {
	private WebDriver driver;
	private final String url = "https://www.saucedemo.com/";
	
	//webelements using @findBy
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(css="h3[data-test='error']")
	private WebElement errorMessage;
	
	//constructor
	public loginpagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//navigate to loginpage
	public void navigateTo(){
	if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}
	public void login(String username,String password) throws InterruptedException {
		Thread.sleep(2000);
		(usernameField).sendKeys(username);
		Thread.sleep(2000);
		(passwordField).sendKeys(password);
		Thread.sleep(2000);
		(loginButton).click();
	}
	
	public String getErrorMessage() {
		return (errorMessage).getText();
	}
	
	

}
