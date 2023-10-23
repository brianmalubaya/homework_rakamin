Feature: Add to Cart

  Scenario: User adds a product to the cart
    Given the user is logged in
    When the user adds a product to the cart
    Then the product should be in the cart

  Scenario: User tries to check out with no items
    Given the user is logged in
    When the user tries to check out with no items
    Then an error message should be displayed
