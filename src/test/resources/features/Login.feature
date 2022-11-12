
Feature: Library app login feature
  User Story : As a user, i should able to login with credentials.

 Background: Assuming user is on the login page
   Given user is on the login page

  @librarian @employee
  Scenario: Login as a librarian
    Given user enters librarian username
    And user enters librarian password
    Then user should see the dashboard


  @student
 Scenario: Login as a student
      Given user enters student username
      And user enters student password
      Then books should be  displayed