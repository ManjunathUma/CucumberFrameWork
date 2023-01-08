Feature: Amazon Search

Scenario: Search a Product
Given I have a search field on Amazon Page
When I search for a product with name "Apple Iphone" and price "100000"
Then Product with name "Apple Iphone" should be displayed
Then Order id is 12345 and username is "Manjunath"