Feature: Test Free CRM Application

  Scenario: Validate login page and Home Page Functonality
    Given user is on Login Page
    When user enter valid username and password
      | username              | password   |
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click on login button
    And user validate home page title