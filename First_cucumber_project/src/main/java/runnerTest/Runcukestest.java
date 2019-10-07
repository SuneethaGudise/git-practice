package runnerTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 @RunWith(Cucumber.class)
 Cucumberoptions(
		feature = "Features"
		,glue = {"stepdefinitions"},
		format = {"pretty","html:test-outout"}
		)
		
public class Runcukestest {

}
