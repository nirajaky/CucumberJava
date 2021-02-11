package StepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/", glue = {"StepDefination"},
    plugin = {"pretty", "html:target/HtmlReports.html"})
public class TestRunner {

}
