package hooks.steps;

import io.cucumber.java.en.*;

public class HooksSteps {
	@Given("This is the first Step")
	public void this_is_the_first_step() {
		System.out.println("This is the first Step");
	}

	@And("Second Step")
	public void second_step() {
		System.out.println("Second Step");
	}

	@Then("Final Step")
	public void final_step() {
		System.out.println("Final Step");
	}
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		System.out.println("I want to write a step with: " + string);
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
		System.out.println(String.format("I check for the %d in step", Integer.parseInt(string)));
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		System.out.println(String.format("I verify the %s in step", string));
	}

}
