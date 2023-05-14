package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps","hooks"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/reports/html/report.html",
                "json:target/reports/json/report.json",
                "junit:target/reports/xml/report.xml"
        }
)

public class TestRunner {
}
