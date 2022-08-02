package Assigment.Merve.runnner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/featureFiles",
        glue = "Assigment/Merve/stepDefinitions",
        dryRun = false,
        tags = "@wikipedia"
)
public class cukesRunnner {

}
