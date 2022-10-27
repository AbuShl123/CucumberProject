@regression
Feature: Wikipedia search functionality and verification

  @wip
  Scenario: Wikipedia search functionality and verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Джобс, Стив" is in the wiki title