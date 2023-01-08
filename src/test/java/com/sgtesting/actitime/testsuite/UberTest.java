package com.sgtesting.actitime.testsuite;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\FeatureFiles\\Uber.feature"},
		glue = {"com.sgtesting.actitime.stepdefinitions"},
		plugin = {"pretty"},
		tags = "@Smoke"
		)
public class UberTest {

}
