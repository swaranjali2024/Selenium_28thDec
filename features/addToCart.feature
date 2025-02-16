Feature: Validate add items to cart functionality

  Background:
    Given user open Chrome
    And user open URL "https://www.saucedemo.com/"
    And user login with username "standard_user" and password "secret_sauce"
    And list of products gets displayed in ascending order by price

Scenario: Add a product to the cart from the product page
  When user select product from products list
  And user click on "Add to Cart" button for selected product
  Then the product gets added to the cart
  And the cart should contain one item
  And the product should appear in the cart