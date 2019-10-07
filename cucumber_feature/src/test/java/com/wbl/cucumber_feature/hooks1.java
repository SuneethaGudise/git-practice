package com.wbl.cucumber_feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooks1 {
	@Given("^this is given steps$")
	public void this_is_given_steps() throws Throwable {
		System.out.println("This is the Given step");
	}

	@When("^this is when steps$")
	public void this_is_when_steps() throws Throwable {
		System.out.println("This is the When step");
	}

	@Then("^this is then steps$")
	public void this_is_then_steps() throws Throwable {
		System.out.println("This is the Then step");
	}

}
