Feature: Test Free CRM Application

  Scenario: Validate login page and Home Page Functonality
    Given user is on Login Page
    When user enter valid username and password
      | Admin@gmail.com  | admin12    |
      | ashish@gmail.com | ashish@123 |
      | sayali@gmail.com | sayali@123 |
    Then user close the application
