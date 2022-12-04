Feature: Login test

  Background:
    Given the home page is opened


  Scenario Outline:
    Given fill in the '<username>' and '<password>' address
    When  click the Login button
    Then the '<feedback>' error message is shown out
    Examples:
      | username                | password     | feedback                                                                  |
      |                         | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | problem_user            | secret_sauce |                                                                           |
      |                         |              | Epic sadface: Username and password do not match any user in this service |
      | performance_glitch_user | secret_sauce |                                                                           |
      | standard_user           |              | Epic sadface: Username and password do not match any user in this service |


  Scenario: successful Login
    Given fill in the 'standard_user' and 'secret_sauce' address
    When  click the Login button

  Scenario: Unsuccessful Login
    Given fill in the 'locked_out_user' and 'secret_sauce' address
    When  click the Login button
    Then the '<feedback>' error message is shown out

  Scenario: Logout
    Given fill in the 'standard_user' and 'secret_sauce' address
    And  click the Login button
    Given the Item page is opened
    And Click sideMenu
    Then Click Logout


