
Feature: Test Orange HRM Application Functionality

  Scenario: Validate Login Functionality
    Given user is on login page
    When user enter valid username and valid password
    Then user click on login button