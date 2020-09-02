package background.steps;

import io.cucumber.java.en.*;

public class BackgroundStep {
	@Given("I have this common step")
	public void i_have_this_common_step() {
		System.out.println("I have this common step" );
	}


	@Given("I have this one more common step")
	public void i_have_this_one_more_common_step() {
		System.out.println("I have this one more common step" );
	}
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action" );
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes" );
	}
	
	@When("I take an action")
	public void i_take_an_action() {
		System.out.println("I take an action" );
	}
	@Then("I verify results")
	public void i_verify_results() {
		System.out.println("I verify results" );
	}
}
