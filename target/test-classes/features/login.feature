Feature: login
  Scenario:
    Given I am on the login page
    When  I input a valid username and password
#    When I login with the following details
#      | username               | password      |
#      | standard_user          | secret_sauce  |
#      | problem_user          | secret_sauce  |
    And I click the login button
    Then I will be taken to the Products Page