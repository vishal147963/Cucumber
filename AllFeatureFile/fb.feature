Feature: Test Facebook Application

  Scenario: Validate Register test functionality
    Given user is on fb register page
    When user enter "Vrushali" and "Patil"
    And user enter valid 909099 and "anjali@gmail.com"
    And user enter 15 and "Dec" and 2002
    Then user click on Register button