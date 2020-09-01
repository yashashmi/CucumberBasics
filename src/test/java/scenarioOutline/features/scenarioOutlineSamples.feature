Feature: Scenario Outline Samples
  I want to use this template for my feature file

  Scenario Outline: Simple Scenario
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
