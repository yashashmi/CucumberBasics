package cucumberOptions.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumberOptions/features/", glue = { "cucumberOptions/steps" }, plugin = {
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"rerun:target/cucumber-reports/rerun.txt" }, tags = "not @slowTests" )
public class CucumberOptionsTestRunner {

}
