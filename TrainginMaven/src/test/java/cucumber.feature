#Feature: feature to login functionality
#@Regression
#Scenario: Check login is successful with credentials
#Given is on login page
#When user enters username and password
#And user click onlogin button
#Then user is navigated to the home page
#@tage9
#Scenario: Check login is successful with Valid credentials
#
#Given User is on Home Page
#When User Navigate to LogIn Page
#When Enters username and password
#| usernames |Password |
#| locked_out_user |secret_sauce|
#Then verify
#
#
#@smoke
#Scenario Outline: Check login is success with valid credentials
#Given browser is open
#And user is on login page
#When user enter <username> and <password>
#And ser click on login
#Then user navigate to the home page
#Examples:
#| username      | status       |
#| standard_user | lmno         |
#| standard_user | secret_sauce |
#
Feature: Test Background Feature
  Description: The purpose of this feature is to test the Background keyword

  Background: 
    Given User is on the login page
    When user enters username "standard_user" and password "secret_sauce"
  Scenario: Check login is successful with credentials
    And user click on login button

  Scenario: Check login is successful with credentials
    Then Verification of login page
