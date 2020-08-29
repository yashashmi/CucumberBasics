package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", glue = {"Steps"}
		)
public class CucumberTestRunner {

}
