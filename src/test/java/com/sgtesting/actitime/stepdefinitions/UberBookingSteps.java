package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.en.*;

public class UberBookingSteps {
	
	@Given("^User wants to Select a car type \"([^\"]*)\" from uber app$")
	public void user_wants_to_Select_a_car_type_from_uber_app(String carType){
		System.out.println("Step 1:" + carType);
	}

	@When("^User selects cae \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
	public void user_selects_cae_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String DropLocation)  {
	  System.out.println("Step 2:"+ carType + pickUpLocation + DropLocation );
	}

	@Then("^Driver starts the journey$")
	public void driver_starts_the_journey(){
	   System.out.println("Step 3");
	}

	@Then("^Driver ends the journey$")
	public void driver_ends_the_journey() {
	   System.out.println("Step4");
	}

	@Then("^User pays (\\d+) USD$")
	public void user_pays_USD(int USD){
	   System.out.println("Step5 :" + USD);
	}

}
