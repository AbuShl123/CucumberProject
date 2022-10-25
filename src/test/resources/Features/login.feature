# if to put @smoke annotation above feature -> all TCs will be for smoke
@regression # all for regression
@login
Feature: Library app Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed

  Accounts here: librarian, student, admin

  Background: for the scenarios in this feature user is expected to be on login page
    Given user is on the library login page

  @smoke @librarian @employee
  Scenario: Login as a librarian
    #Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  @student
  Scenario: Login as a Student
    #Given user is on the library login page
    When user enters student's username
    And user enters student's password
    Then user should see dashboard

   @admin @employee
  Scenario: Login as an Admin
    #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard