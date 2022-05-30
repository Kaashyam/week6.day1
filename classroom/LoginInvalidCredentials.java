package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginInvalidCredentials extends BaseClass {

	@Given("Enter the username as {string}")
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

	}

	@But("Error message should be displayed")
	public void verifyError() throws Exception {

		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed();
		if (displayed) {
			System.out.println("Error message verified sucessfulluy");
		} else {
			System.out.println("Error message verification failed");
		}

	}

}
