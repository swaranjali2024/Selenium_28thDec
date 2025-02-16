Feature: Validate checkout functionality

  Background:
    Given user open Chrome
    And user open URL "https://www.saucedemo.com/"
    And user login with username "standard_user" and password "secret_sauce"
    And the product gets added to the cart

Scenario: Validate successful checkout
  When user clicks on checkout button
  #And user enter "First Name"
  #And user enter "Last Name"
  #And user enter "Postal Code"
  And User fills in the checkout fields with valid data
  Then user click on continue button
  #And user verify order details including order name, total price
  And user click on Finish button
  And order is successfully dispatched

