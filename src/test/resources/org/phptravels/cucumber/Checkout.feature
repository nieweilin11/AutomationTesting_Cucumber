Feature: Checkout system test

  Background:
    Given the home page is opened
    Given fill in the 'standard_user' and 'secret_sauce' address
    Then click the Login button
    Given the Item page is opened

  Scenario Outline:
    And Click '<item>' button add item
    Given Click cart icon
    Given the Checkout page is opened
    Then Click checkout Button
    And fill in the '<FirstName>' ,'<Lastname>','<PostalCode>'
    Then Click Continue Button
    Given the checkout Step2 page is opened
    Then Click Finish button
#    Then the '<feedback>' error message is shown out
    Examples:
      | FirstName   | Lastname | PostalCode | item                 |
      | Nie         | Weilin   | 123        | SauceLabsBackpack    |
      | Nie         | 4dxc@ada | 123        | SauceLabsBikeLight   |
      | 4dxc!2%!(da | Weilin   | 123        | SauceLabsBoltT_Shirt |
      | Nie         | Weilin   | _xc!2%!(da | SauceLabsOnesie      |

  Scenario: successful checkout
    And Click 'SauceLabsBackpack' button add item
    Given Click cart icon
    Given the Checkout page is opened
    Then Click checkout Button
    And fill in the 'Nie' ,'Weilin','123'
    Then Click Continue Button
    Given the checkout Step2 page is opened
    Then Click Finish button

