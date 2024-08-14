

Feature: Add a product of three quantity and checkout the product

@RegressionTest
Scenario Outline:

Given user is landed on GreenKart home page
When user searches the availability of a particular product <Name> in the home page
And add <NumberOf> quantity of the product
And move to add to cart section
Then user navigates to the checkout page
And validate same product visibility
And validate the visibility of apply and place order button

Examples:

|	Name	| NumberOf	|
|	Tom	  |			3			|
| Cauli |     5     |
 
