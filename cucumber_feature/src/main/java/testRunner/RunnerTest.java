package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature"
,glue={"stepDefinition"}
)
public class RunnerTest {

}
/*if import cucumber shows error as cucumber not resolved type


step: write the import statement manually and the error will be gone.

import cucumber.api.junit.Cucumber;

Step 2: Also, remove the scope for cucumber-junit dependency in pom.xml file */