package runnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\src\\main\\java\\FaceBookFeature\\Facebook.feature"
		,glue = {"C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\src\\main\\java\\stepDefinition\\Facebookfeature.java"},
		format = {"pretty","html:test-outout"}
		)

public @interface Cucumberoptions {

}
