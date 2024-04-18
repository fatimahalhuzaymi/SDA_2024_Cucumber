Feature: My First Feature In The Project

  This is the description that i am adding to the feature file

Background: The name of Background

  Scenario: The name o senario
    Given I open the browser
    And I am on the google homepage
    When I search for amazon on google
    Then I should see amazon on the result


  Scenario: The name of second scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "fatimah" on google
    Then I should see "fatimah" on the results
    Then I close the browser


