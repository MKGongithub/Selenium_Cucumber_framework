Feature: check google search functionality

Scenario: validate google search is working
Given open browser
And user in on google browser page
When user enter textin  search box on google
And  click enter
Then user is navigated to search results