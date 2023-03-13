Feature: Test Cogmento CRM Application

	#@LoginPage
  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button
	
  Scenario: Validate Home Page Functionality
    Then user validate home page logo
    And user validate home page title
	
	#@ContactPageTC_001
  Scenario: validate Contact Page functionality
    When user click on contact link
    Then validate user is on contact page
    Then user click on create button
    And user fill up different personal information as like fname,last name, middle name and emial id
    Then user click on save button
    And we validate is created or not
