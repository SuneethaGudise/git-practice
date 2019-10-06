package runnerTest;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\src\\main\\java\\FaceBookFeature\\Facebook.feature"//Path of th the feature file
		,glue = {"stepDefinition"}, // path or package of step definition file
		format = {"pretty","html:test-out-out","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"} //generate different format
		,monochrome = true // make the console output in readable format it should be true .if false it gives non readable format
		,strict =false //fails the test execution if there are undefined or pending steps in stepdefinition file
		,dryRun = false	//to check if mapping is proper between feature file and step definition file	
		)
public class TestRunner{
	
	
}
/*if import cucumber shows error as cucumber not resolved type
 
 
step1: write the import statement manually and the error will be gone.

import cucumber.api.junit.Cucumber;

Step 2: Also, remove the scope for cucumber-junit dependency in pom.xml file */