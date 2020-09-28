Feature: Reporting Feature
  Look at the reports generated

   @fastTests
   Scenario: Login with valid credentials
    Given I am on "mywebsite.com"
    When I enter username as "TinTin" and password as "Password@123"
    And I click on login button
    Then I should see "Welcome Tin Tin" 
    
    @regression
    Scenario: Login with other valid credentials
    Given I am on "mywebsite2.com"
    When I enter username as "Holika" and password as "Password@123"
    And I click on login button
    Then I should see "Welcome Holi" 
    
    @regression @slowTests
    Scenario: Login with other valid credentials
    Given I am on "mywebsite3.com"
    When I enter username as "Pranjal_123" and password as "Password@123"
    And I click on login button
    Then I should see "Welcome Pranjal" 