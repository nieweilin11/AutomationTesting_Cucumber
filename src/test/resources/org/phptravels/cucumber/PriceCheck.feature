Feature: Price system test

  Background:
    Given the home page is opened
    Given fill in the 'standard_user' and 'secret_sauce' address
    Then click the Login button
    Given the Item page is opened

  Scenario Outline:
    And Click '<item>' button add item and record the price
    Given Click cart icon
    Given the Checkout page is opened
    Then Click checkout Button
    And fill in the 'Weilin' ,'Nie','123'
    Then Click Continue Button
    Given the checkout Step2 page is opened
    And  Check the '<price>' of '<item>'
    Then Click Finish button
#    Then the '<feedback>' error message is shown out
    Examples:
      | item                 | price |
      | SauceLabsBackpack    | 29.99 |
      | SauceLabsBikeLight   | 9.99  |
      | SauceLabsBoltT_Shirt | 15.99 |
      | SauceLabsOnesie      | 6.8   |

    Scenario: incorrect price
      And Click 'SauceLabsBackpack' button add item and record the price
      Given Click cart icon
      Given the Checkout page is opened
      Then Click checkout Button
      And fill in the 'Weilin' ,'Nie','123'
      Then Click Continue Button
      Given the checkout Step2 page is opened
      And  Check the '12341' of 'SauceLabsBackpack'
      Then Click Finish button

    Scenario: Calculate tax rate
      And Click 'SauceLabsBackpack' button add item
      Given Click cart icon
      Given the Checkout page is opened
      Then Click checkout Button
      And fill in the 'Nie' ,'Weilin','123'
      Then Click Continue Button
      Given the checkout Step2 page is opened
      Then Calculate tax rate
      Then Click Finish button

