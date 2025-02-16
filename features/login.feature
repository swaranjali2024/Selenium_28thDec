Feature: To validate Login functionality

  Background:
    Given user open Chrome
    And user open URL "https://www.saucedemo.com/"

  Scenario: Validate successful login test case
    When user login with username "standard_user" and password "secret_sauce"
    #When user enter username "stadard_user"
    #And user enter password "secret_sauce"
    #And user click on Login button
    #Then user validate successful login screen
    Then user validate dashboard


  Scenario Outline: User validate login with invalid login credentials
    When user enter username "<username>"
    And user enter password "<password>"
    And user click on Login button
    Then user validate error message "<Error Message>"

    Examples:
      | username      | password      | Error Message                                                             |
      |               |               | Epic sadface: Username is required                                        |
      | standard_user |               | Epic sadface: Password is required                                        |
      |               | secret_sauce  | Epic sadface: Username is required                                        |
      | standard_user | secret1_sauce | Epic sadface: Username and password do not match any user in this service |


