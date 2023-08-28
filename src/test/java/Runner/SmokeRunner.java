package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags= "@smoke",
        plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                //this failed.txt file holds all the scenarios which are failed  during execution
                "rerun:target/failed.txt"}


)

public class SmokeRunner {
}

