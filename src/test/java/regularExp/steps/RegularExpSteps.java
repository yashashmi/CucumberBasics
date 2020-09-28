package regularExp.steps;

import io.cucumber.java.en.*;

public class RegularExpSteps {

	@Given("^I am on www\\.google\\.com$")
	public void i_am_on_www_google_com() {
		System.out.println("I am on www.google.com");
	}

	@When("^I enter search text as (.*)$")
	public void SearchText(String searchText) {
		System.out.println("I enter search text as: " + searchText);
	}

	@Given("^I navigate to (.*com)$")
	public void i_navigate_to_www_google_com(String url) {
		System.out.println("I navigate to : " + url);
	}

	@Given("^User (?:Navigates to|Opens|Launches) (www.*com)$")
	public void user_navigates_to_www_google_com(String url) {
		System.out.println("Navigation URL : " + url);
	}
}
