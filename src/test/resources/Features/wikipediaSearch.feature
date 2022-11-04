@regression
Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia search functionality and verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title

  Scenario Outline:
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue     | expectedTitle           |
      | Beethoven       | Ludwig van Beethoven    |
      | Steve Jobs      | Steve Jobs              |
      | Anime           | Anime                   |
      | Elon Musk       | Elon Musk               |
      | Albert Einstein | Albert Einstein         |
      | Mozart          | Wolfgang Amadeus Mozart |
      | Apple           | Apple                   |
