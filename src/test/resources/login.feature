Feature: User Login

Scenario: Successful login with valid credentials
  Given the user is on the SauceDemo login page
  When the user enters valid username and password
  Then the user should be logged in

Scenario: Logout functionality
  Given the user is on the SauceDemo login page
  When the user clicks on the logout button
  Then the user should be logged out
