package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrdersSteps {
	
	@Given("^a registered user exists$")
	public void a_registered_user_exists() {
	    System.out.println("Step 1");
	}

	@Given("^user is on amazon login page$")
	public void user_is_on_amazon_login_page() {
		System.out.println("Step 2");
	}

	@When("^user enters username$")
	public void user_enters_username(){
		System.out.println("Step 3");
	}

	@When("^user enters password$")
	public void user_enters_password(){
		System.out.println("Step 4");
	}

	@When("^user navigates to order page$")
	public void user_navigates_to_order_page() {
		System.out.println("Step 5");
	}

	@When("^user clicks on Previous Order Details$")
	public void user_clicks_on_Previous_Order_Details(){
		System.out.println("Step 6");
	}

	@Then("^user checks the previous order details$")
	public void user_checks_the_previous_order_details(){
		System.out.println("Step 7");
	}

	@When("^user clicks on Open Order Details$")
	public void user_clicks_on_Open_Order_Details(){
		System.out.println("Step 8");
	}

	@Then("^user checks the open order details$")
	public void user_checks_the_open_order_details() {
		System.out.println("Step 9");
	}

	@When("^user clicks on Cancelled Order Details$")
	public void user_clicks_on_Cancelled_Order_Details(){
		System.out.println("Step 10");
	}

	@Then("^user checks the Cancelled order details$")
	public void user_checks_the_Cancelled_order_details(){
		System.out.println("Step 11");
	}

}
