@feature
Feature: As a user I want to verify that the city of Frankfurt is in Germany and return their corresponded latitude and longitude

  Scenario: verify that the city of Frankfurt is in Germany and return their corresponded latitude and longitude
    Given I have an api "http://api.citybik.es/v2/networks"
    When I send request to the api
    Then I should see in the response that city of Frankfurt is in Germany
    And return their corresponded latitude and longitude