Feature: Item detail system test

  Background:
    Given the home page is opened
    Then fill in the 'standard_user' and 'secret_sauce' address
    When  click the Login button
    Given the Item page is opened
  Scenario Outline:
    And Click '<item>'
    Then Click Back button
    Examples:
      | item                 |
      | SauceLabsBackpack    |
      | SauceLabsBikeLight   |
      | SauceLabsBoltT_Shirt |
      | SauceLabsOnesie      |
      | T_ShirtRed           |

    Scenario: add 'SauceLabsBackpack' form it's detail page
      Given Click 'SauceLabsBackpack'
      And Click add button
      Then Click cart icon

    Scenario: remove 'SauceLabsBackpack' form it's detail page
      Given Click 'SauceLabsBackpack'
      And Click add button
      Then Click remove button
