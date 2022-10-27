@regression
Feature: Google Search Feature
  User story: As a user when i am on the google search page
  I should be able to search whatever i want and see any relevant information

  Scenario: Search Functionality result title verification
    Given user is on google search page
    When user types apple in the google search box and clicks on enter
    Then user sees apple - Google Search is in the google title

  Scenario: Search Functionality result title verification
    Given user is on google search page
    When user types "anime" in the google search box and clicks on enter
    Then user sees "anime - Поиск в Google" is in the google title