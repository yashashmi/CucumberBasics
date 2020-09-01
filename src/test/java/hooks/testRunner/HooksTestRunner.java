package hooks.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/hooks/features/", glue = { "hooks/steps" })
public class HooksTestRunner {

}
