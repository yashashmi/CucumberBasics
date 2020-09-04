Feature: Regular Expression Samples

#(.*)
  Scenario: Capture group sample
    Given I am on www.google.com
    When I enter search text as something
    
#(.*com)
Scenario: Capture group sample2
    Given I navigate to www.google.com
    And I navigate to www.yahoo.com
    
#Using reg expression
Scenario: Different keywords but same step definition
    Given User Navigates to www.google.com
    And User Opens www.yahoo.com
    And User Launches www.bing.com