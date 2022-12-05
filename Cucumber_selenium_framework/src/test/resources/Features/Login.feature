Feature: varifying Login functionality

  Scenario: checking loging is successfully or not
    Given open loging page
    When Enter valid username
    And Enter valid password
    Then Login successfully navigated to page opened
