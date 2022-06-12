Feature: Login
Description: This feature is to test the login Functionality 

Scenario: Successful login with valid credentials 
Given User is on Homepage 
When User enters username and password
Then User can visit the home page 

Scenario: Successful Logout 
When User Logout from the application 
Then User cannot visit the home page 
