package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", glue = "steps", monochrome = true, publish = true, tags = "@login")
public class CucumberRunner extends BaseClass {

}
