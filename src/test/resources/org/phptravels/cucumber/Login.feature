Feature: Login system test

  Background:
    Given the home page is opened


  Scenario Outline:
    Given fill in the '<username>' and '<password>' address
    When  click the Login button
    Then the '<feedback>' error message is shown out
    Examples:
      | username      | password     | feedback                                                                  |
      |               | secret_sauce | Epic sadface: Username is required                                        |
      | problem_user  |              | Epic sadface: Password is required                                        |
      |               |              | Epic sadface: Username is required                                        |
      | standard_user | 124          | Epic sadface: Username and password do not match any user in this service |
      | standard_user |              | Epic sadface: Password is required                                        |


  Scenario: successful Login
    Given fill in the 'standard_user' and 'secret_sauce' address
    When  click the Login button

  Scenario: Unsuccessful Login
    Given fill in the 'locked_out_user' and 'secret_sauce' address
    When  click the Login button
    Then the 'Epic sadface: Sorry, this user has been locked out.' error message is shown out

  Scenario: Logout
    Given fill in the 'standard_user' and 'secret_sauce' address
    And  click the Login button
    Given the Item page is opened
    And Click sideMenu
    Then Click Logout


