Feature: test the Application

  Scenario: Test the Google Application
    When user is on google home page
    Then user validate Google Home page Title
    And user validate Google Home page Url

  Scenario: Test the Facebook Application
    When user is on Facebook home page
    Then user validate Facebook Home page Title
    And user validate Facebook Home page Url