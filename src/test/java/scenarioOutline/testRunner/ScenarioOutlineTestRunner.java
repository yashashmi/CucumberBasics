package scenarioOutline.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/scenarioOutline/features/", glue = { "scenarioOutline/steps" })
public class ScenarioOutlineTestRunner {

}
