package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;

public class LoginValidCredentials extends BaseClass {

	/* @Given("Enter the username as {string}")
	public void enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	} */

	@Then("Login should be successful and Homepage should be displayed")
	public void verifyHomepage() throws Exception {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage verified sucessfulluy");
		} else {
			System.out.println("Homepage verification failed");
		}
	}

}
