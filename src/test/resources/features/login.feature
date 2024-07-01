Feature: login
  Scenario:
    Given I am on the login page
    When I Input a valid Username and Password
    And I click the login button
    Then I will be taken to the Products Page