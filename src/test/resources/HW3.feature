Feature: HW3

  This is the description that i am adding to the feature file

  Background: The Input Form

  Scenario: First senario
    Given I open the browser
    And I am on the testpages
    When I fill first and last name
    Then I should See Validation Report

  Scenario: Second senario
    Given I open the browser
    And I am on the testpages
    When I fill first,last and age name input
    Then I should See my Validation Report


  Scenario: Third  senario
    Given I open the browser
    And I am on the testpages
    When I fill  all input
    Then I should See my submit






  /*
Go to https://testpages.eviltester.com/styled/validation/input-validation.html
Fill form and submit
Do this with 3 scenarios
Use background and scenario outline
*/