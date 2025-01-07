@JiraXray-[TestSet]
Feature: Add candidate on Recruitment

  Background:
    Given I am on the login page

  @JiraXray-[Test] @HappyPath @Recruitment @CP001
  Scenario: Add a new candidate
    When I choose the "Recruitment" option in the dashboard options menu
    And click the "Add" button
    And register the personal data of the candidate
      | firstName | middleName | lastName |
      | oscar     | andres     | roa      |
    And register the position of the candidate
      | vacancy               |
      | Payroll Administrator |
    And register the contact information of the candidate
      | email                 | contactNumber |
      | oscarandres@gmail.com | 453465464347  |
    And save the candidate filled information
    And shortlist the candidate