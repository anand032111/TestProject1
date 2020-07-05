package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features/youtubelogin.feature",
glue={"StepDefinitions"},

monochrome = true,

//plugin = { "pretty", "html:target/Reports/HTML/Htmlreports"}
//plugin = { "pretty", "json:target/Reports/Json/reports/cucumber.json"}
plugin = { "pretty",  "junit:target/Reports/Junit/cucumber.xml"}		

		)

public class TestRunner {

}
