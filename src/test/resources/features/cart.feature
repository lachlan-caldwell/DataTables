Feature: As a user
  I need to be able to remove items from my cart
  So that I can change my mind before proceeding to checkout

  Scenario: Remove the only item from the cart
    Given I am on the product page
    And I add the first item to my cart
    And I click the cart icon
    When I click the remove item button
    Then No items are displayed in cart