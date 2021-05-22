Feature: Use the website to find restaurants So that I can order food As a hungry customer I want to be able to find restaurants in my area

@smoketest
  Scenario: Search for restaurants in an area
    Given user is on home page
    When user search for restaurants in "136 Market Avenue, Winnipeg, MB, Canada"
    And  click on find restaurants in your area
    Then user should see some restaurants in "136 Market Avenue, Winnipeg, MB, Canada"
