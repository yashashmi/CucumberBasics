package dependencyInjection.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/dependencyInjection/features/", glue = { "dependencyInjection/steps" })
public class DependencyInjectionTestRunner {

}
