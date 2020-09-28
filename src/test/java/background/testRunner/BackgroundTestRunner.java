package background.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/background/features/", glue = { "background/steps" })
public class BackgroundTestRunner {

}
