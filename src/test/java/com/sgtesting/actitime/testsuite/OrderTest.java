package com.sgtesting.actitime.testsuite;

import org.junit.runner.RunWith;


@cucumber.api.CucumberOptions(
		features = {"src/test/resources/FeatureFiles/Order.feature"},
		glue = {"com.sgtesting.actitime.stepdefinitions"},
		plugin = {"pretty"}
	
		)
public class OrderTest {

}
