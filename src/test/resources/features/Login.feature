@JiraXray-[TestSet]
Feature: Login Orange HRM
  As a registered user
  I want to be able to login to the web app
  To access my account and use its features

  Background:
    Given I am on the login page

  @JiraXray-[Test] @HappyPath @Login @CP001
  Scenario: Login successful
    When I enter valid credentials
      | username | password |
      | Admin    | admin123 |
    Then I should be logged in and redirected to the Orange HRM dashboard