package dataTables.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/dataTables/features/", glue = { "dataTables/steps" })
public class DataTableTestRunner {

}