package dependencyInjection.steps;

import io.cucumber.java.en.*;

public class DependencyInjectionSteps {

	private UserInfo userInfo;

	// This constructor won't work until "cucumber-picocontainer" dependency is put
	// in POM.xml
	public DependencyInjectionSteps(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Given("I open a login page")
	public void i_open_a_login_page() {
		System.out.println("I open a login page");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("I click on login button");
	}

	@Then("I should see the {string} message")
	public void i_should_see_the_welcome_message(String messsage) {
		System.out.println("You attempted to login with Username as: " + userInfo.UserName + " and Password as: "
				+ userInfo.Password);
		System.out.println("I should see the " + messsage + " message");
	}

}
