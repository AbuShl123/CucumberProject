Feature: Library app Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed

  Accounts here: librarian, student, admin

  Scenario: Login as a librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user successfully logins the app
    And dashboard is displayed