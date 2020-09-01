Feature: Hooks Samples

@SimpleScenario
  Scenario: Simple Before and After via hooks
    Given This is the first Step
    And Second Step
    Then Final Step

  Scenario Outline: Demo hook with Scenario Outline
    Given I want to write a step with "<name>"
    When I check for the "<marks>" in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | marks | status  |
      | name1 |     5 | success |
      | name2 | abc   | Fail    |
