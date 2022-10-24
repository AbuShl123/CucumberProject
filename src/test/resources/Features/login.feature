# if to put @smoke annotation under feature -> all TCs will be for smoke
@Regression # all for regression
Feature: Library app Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed

  Accounts here: librarian, student, admin

  @smoke @regression
  Scenario: Login as a librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  @regression
  Scenario: Login as a Student
    Given user is on the library login page
    When user enters student's username
    And user enters student's password
    Then user should see dashboard