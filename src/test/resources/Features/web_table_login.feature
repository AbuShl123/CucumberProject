@regression
Feature: user should be able to login with valid credentials
  Scenario: login
    Given user is on the Web Table login page
    When user enters the username "Test"
    And user enter password "Tester"
    And user clicks login button
    Then user should see url contains "orders"

  Scenario: login scenario with two params
    Given user is on the Web Table login page
    When user inputs username "Test" and password "Tester" and logins
    Then user should see url contains "orders"

#  Scenario: user enters below credentials
#    Given user is on the Web Table login page
#    When user enters below credentials
#      | username | password |
#      | Test     | Tester   |
#      | user     | password |
#    Then user should see url contains "orders"


