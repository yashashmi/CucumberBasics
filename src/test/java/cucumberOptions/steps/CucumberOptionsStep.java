package cucumberOptions.steps;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class CucumberOptionsStep {
	@Given("I am on {string}")
	public void i_am_on(String url) {
		System.out.println("I navigate to: " + url);
	}

	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
		System.out.println("I enter username as: " + username);
		System.out.println("I enter password as: " + password);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("I click on login button");
	}

	@Then("I should see {string}")
	public void i_should_see(String message) {
		Assert.assertEquals(message, "Welcome Tin Tin");
	}
}
