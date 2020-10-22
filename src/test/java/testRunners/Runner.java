package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import main.testConfig;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/",glue={"stepDefinitions"},
        plugin={"pretty","html:target/cucumber"})
public class Runner {
}
