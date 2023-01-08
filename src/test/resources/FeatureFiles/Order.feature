Feature: Home Page
In order to check my order details
As a registered user
I want to specify the features of order deatisl page

Background:
Given a registered user exists
Given user is on amazon login page
When user enters username
And user enters password
And user navigates to order page

Scenario: check Previous Order Details
When user clicks on Previous Order Details
Then user checks the previous order details

Scenario: check Open Order Details
When user clicks on Open Order Details
Then user checks the open order details

Scenario: check Cancelled Order Details
When user clicks on Cancelled Order Details
Then user checks the Cancelled order details
