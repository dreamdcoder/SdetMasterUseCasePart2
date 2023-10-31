package com.sdetlabs.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		tags = "",
		features = "classpath:features",
		glue = {"com.sdetlabs.cucumber.runner","com.sdetlabs.cucumber.stepdefinitions"},
		
		plugin = {},
		
		monochrome = true)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
