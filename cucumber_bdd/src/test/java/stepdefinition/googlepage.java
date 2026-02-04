package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlepage {
	
	WebDriver driver;
	
	@Given("browser is open")
public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Given("user is on google searchpage")
public void user_is_on_google_searchpage() {
	driver.get("https://www.google.com");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("user enters a text in search")
public void user_enters_a_text_in_search() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("india");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("user is navigate to result")
public void user_is_navigate_to_result() {
	
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
	

}
