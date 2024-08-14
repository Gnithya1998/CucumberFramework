

Feature: GreenKart application product validation in home and offer page

@SmokeTest
Scenario Outline: Product availability check in both home page and offer page

Given user is landed on GreenKart home page
When user searches the availability of a particular product <Name> in the home page
Then user is navigated to the offer page and searches for the same product <Name>
And validated the product availability in both the pages

Examples:

| Name |
| Tom	|
| Straw	|