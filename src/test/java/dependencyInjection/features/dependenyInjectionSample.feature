Feature: Dependency Injection Samples

  Scenario: Scenario with multiple steps in different step defition files
    Given I open a login page
    And I enter username as "user_123" and password as "Password@123"
    When I click on login button
    Then I should see the "welcome" message

  Scenario: Scenario with multiple steps in mixed with other steps
    Given I open a login page
    And I enter username as "user_123" and password as "InvalidPassword"
    When I click on login button
    Then I should see the "error" message
