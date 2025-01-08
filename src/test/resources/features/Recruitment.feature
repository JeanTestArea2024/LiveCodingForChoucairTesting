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
      | Oscar     | Andres     | Roa      |
    And register the position of the candidate
      | vacancy               |
      | Payroll Administrator |
    And register the contact information of the candidate
      | email                 | contactNumber |
      | oscarandres@gmail.com | 453465464347  |
    And save the candidate filled information
    And shortlist the candidate
    And save shortlist the candidate
    And schedule the candidate an interview
    And register the interview details
      | interviewTitle      | interviewer          | date       |
      | Recruitment Analyst | Timothy Lewis Amiano | 2025-01-24 |
    And save interview schedule
    And mark interview passed
    And save passed mark
    And offer job
    And save job offer
    And hire candidate
    And save recruitment offer
    And select the "Recruitment" option in the dashboard options menu
    And sort date of application by descending order
    //Then check that the candidate we just added appears correctly registered