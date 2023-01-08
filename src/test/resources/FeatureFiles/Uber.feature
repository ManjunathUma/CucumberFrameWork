Feature: Uber Booking feature

@Smoke
Scenario: Booking Cab Sedan 
Given User wants to Select a car type "sedan" from uber app
When User selects cae "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab SUV
Given User wants to Select a car type "suv" from uber app
When User selects cae "suv" and pick up point "Hyderbad" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Sanity
Scenario: Booking Cab Mini
Given User wants to Select a car type "Mini" from uber app
When User selects cae "mini" and pick up point "Bangalore" and drop location "Goa"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

