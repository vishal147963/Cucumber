Feature: Test different Application

  Background: Setup the browser property
    Given user open blank browser

  Scenario: Validate Google Home Page Title
    When user is on google page
    Then validate google home page title

  Scenario: Validate facebook Login Page Title
    When user is on facebook page
    Then validate facebook Login page title

  Scenario: Validate Orange HRM Login Page Title
    When user is on Orange HRM
    Then validate Orange HRM Login Page title
