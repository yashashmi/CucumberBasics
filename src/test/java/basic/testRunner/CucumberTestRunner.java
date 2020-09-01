package basic.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/basic/features/", glue = {"basic/steps"}
		)
public class CucumberTestRunner {

}
