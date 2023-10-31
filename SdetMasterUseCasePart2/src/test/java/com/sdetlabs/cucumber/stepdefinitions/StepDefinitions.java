package com.sdetlabs.cucumber.stepdefinitions;

import org.testng.Assert;

import com.sdetlabs.RestfulWS;
import com.sdetlabs.SoapWS;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	static Integer StatusCode;

	@Given("Json Place Holder site")
	public void json_place_holder_site() {
		// Write code here that turns the phrase above into concrete actions
		RestfulWS.setup();
	}

	@When("Rest Assured Request is {string}")
	public void rest_assured_request_is(String RequestType) {
		// Write code here that turns the phrase above into concrete actions

		if (RequestType.equals("Get"))
			StatusCode = RestfulWS.GetRequestStatusCode();
		else if (RequestType.equals("Put"))
			StatusCode = RestfulWS.PutRequestStatusCode();
		else if (RequestType.equals("Post"))
			StatusCode = RestfulWS.PostRequestStatusCode();
		else if (RequestType.equals("Patch"))
			StatusCode = RestfulWS.PatchRequestStatusCode();
		else if (RequestType.equals("Delete"))
			StatusCode = RestfulWS.DeleteRequestStatusCode();
	}

	@Given("Calculator site")
	public void calculator_site() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("Soap Request is {string}")
	public void soap_request_is(String RequestType) {
		// Write code here that turns the phrase above into concrete actions
		if (RequestType.equals("Get"))
			StatusCode = SoapWS.GetRequestStatusCode();
		else if (RequestType.equals("Post"))
			StatusCode = SoapWS.PostRequestStatusCode();
	}

	@Then("the status code should be {int}")
	public void the_status_code_should_be(Integer code) {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertEquals(StatusCode, code);
	}

}
