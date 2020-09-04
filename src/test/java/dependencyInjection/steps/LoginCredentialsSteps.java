package dependencyInjection.steps;

import io.cucumber.java.en.*;

public class LoginCredentialsSteps {

	private UserInfo userInfo;

	// This constructor won't work until "cucumber-picocontainer" dependency is put
	// in POM.xml
	public LoginCredentialsSteps(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Given("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
		userInfo.UserName = username;
		userInfo.Password = password;

		System.out.println("I enter username as: " + username);
		System.out.println("I enter password as: " + password);
	}

}