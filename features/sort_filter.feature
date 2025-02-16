Feature: Validate Sorting functionality on Inventory page

  Background:
    Given user open Chrome
    And user open URL "https://www.saucedemo.com/"
    And user login with username "standard_user" and password "secret_sauce"
    #And user is on Inventory page

  #Scenario: Validate sorting of products by Name(A to Z)
    #Given user navigates to Inventory page
    #When user selects option "Name (A to Z)" from dropdown
    #Then list of products gets displayed in alphabetical order from A to Z

  #Scenario: Validate sorting of products by Name(Z to A)
    #When user selects option "Name (Z to A)" from dropdown
    #Then list of products gets displayed in reverse alphabetical order from Z to A

  Scenario: Validate sorting of products by Price(Low to High)
    When user selects option "Price(Low to High)" from dropdown
    Then list of products gets displayed in ascending order by price

  #Scenario: Validate sorting of products by Price(Low to High)
    #When user selects option "Price(High to Low)" from dropdown
    #Then list of products gets displayed in descending order by price