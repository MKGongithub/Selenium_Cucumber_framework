Feature: validate magnus application login functionality through data driven

Scenario Outline:  check login is successful with valid multiple credietials

Given first open chrome browser
When user is on  Login page
And user Enter <username> and <password>
And Click on sign in button
Then user is navigated to home page

Examples:
|username|password|
|trainng@jalaacademy.com|jobprogram|
|training@jalaacademy.com|joprogram|
|training@jalaacademy.com|jobprogram|

