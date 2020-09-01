package hooks.steps;

import io.cucumber.java.*;

public class Hook {

	@Before
	public void Before() {
		System.out.println("\n---This is before Scenario---\n");
	}

	@After(value = "@SimpleScenario")
	public void After() {
		System.out.println("\n---This is after Scenario would run only for @SimpleScenario tag---\n");
	}

	@BeforeStep
	public void BeforeStep() {
		System.out.println("\n---This is before each Step---\n");
	}

	@AfterStep
	public void AfterStep(Scenario scn) {
		if (scn.isFailed()) {

			System.out.println(String.format("\n---This is after each Step running only when step failed: \"%s\" ---\n",
					scn.getName()));
		}
	}

}
