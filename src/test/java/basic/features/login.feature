Feature: Login Feature
  As a user I should be able to login to mywebsite.com

   Scenario: Login with valid credentials
    Given I am on "mywebsite.com"
    When I enter username as "TinTin" and password as "Password@123"
    And I click on login button
    Then I should see "Welcome Tin Tin" 
