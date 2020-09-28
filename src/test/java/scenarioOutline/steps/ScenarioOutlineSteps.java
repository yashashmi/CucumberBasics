package scenarioOutline.steps;

import io.cucumber.java.en.*;

public class ScenarioOutlineSteps {
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		System.out.println("I want to write a step with: " + string);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println(String.format("I check for the %d in step", int1));
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		System.out.println(String.format("I verify the %s in step", string));
	}

}
