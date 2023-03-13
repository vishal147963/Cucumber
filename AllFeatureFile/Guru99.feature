Feature: Test Guru99 Application

  Scenario: validate Contact Information
    Then user is on register page
    When user enter first name, last name, phone and email id

  Scenario: validate Mailing information
    Given user is on registe page and user should be add contact information
    When user enter addres, city , state ,postal code and country

  Scenario: validate user information
    Given user is on registe page and user should be add contact and mailing information
    When user enter username password and confirm password
    Then user click on submit button
    And user will be navigate to success page

