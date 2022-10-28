Feature: user should be able to login with valid credentials

  @wip
  Scenario: login
    Given user is on the Web Table login page
    When user enters the username "Test"
    And user enter password "Tester"
    And user clicks login button
    Then user should see url contains "orders"

