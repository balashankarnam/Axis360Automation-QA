@Login_Using_Valid_Credentials
  Feature: Verify user is able to login using valid credentials

@LoginClassWeb
Scenario: The User lands on the Dashboard and login
Given Launch the Application
  And User clicks on login
  And user enter valid username
  And User click on login button

