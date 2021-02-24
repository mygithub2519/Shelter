package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/features",
 glue={"stepDef"},
 monochrome = true,
 dryRun = false,
 plugin = {"pretty", "html:cucumber.html"}
 )

public class TestRunner {

}
