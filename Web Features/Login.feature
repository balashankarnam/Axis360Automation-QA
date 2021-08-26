@Login_Using_Valid_UserName
  Feature: Verify user is able to login using valid username

    @LoginClassWeb
    Scenario Outline:The user should be able to login using valid username
      Given User clicks on login button
      And User enter valid name {String} and clicks on login
      And User lands on dashboard
      Examples:
        |Username|
        |BTPhoton1|