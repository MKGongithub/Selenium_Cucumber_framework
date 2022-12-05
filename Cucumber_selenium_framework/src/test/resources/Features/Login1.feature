Feature: validate magnus application login functionality.
Scenario:  check login is successful with valid credietials

Given open chrome browser
When user is on  Login page
And user Enter username and password
And Click on sign in button
Then user is navigated to homepage

