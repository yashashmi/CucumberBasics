package regularExp.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/regularExp/features/", glue = { "regularExp.steps" })
public class RegularExpTestRunner {

}
