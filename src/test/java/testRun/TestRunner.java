package testRun;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"Features"},
        glue={"stepDefinition"},
        plugin= {"pretty","json:target/json-report/cucumber.json"},
        //dryRun=true,
        monochrome=true,
        tags="@digital"
      )

public class TestRunner {
}
