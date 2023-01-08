package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearch {

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_Amazon_Page(){
	   System.out.println("Step1");
	}

	@When("I search for a product with name {string}  and price {int}")
	public void i_search_for_a_product_with_naem_and_price(String mobileName, String price){
		System.out.println("Step2");
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String mobileName){
	   System.out.println("Step3");
	}

	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(int id, String myName) {
	   System.out.println("Step4");
	}
}
