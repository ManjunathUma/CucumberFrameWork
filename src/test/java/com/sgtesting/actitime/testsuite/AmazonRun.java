package com.sgtesting.actitime.testsuite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/FeatureFiles/Amazon.feature"},
		glue = {"com.sgtesting.actitime.stepdefinitions","MyHooks"},
		plugin = {"pretty"}
	
		)
public class AmazonRun {

}
