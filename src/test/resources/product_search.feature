Feature: Product Search

Scenario: Search for a product
  Given the user is logged in
  When the user searches for a product
  Then the search results should be displayed
