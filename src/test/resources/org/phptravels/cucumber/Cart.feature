Feature: Add  products to cart and remove test

  Background:
    Given the home page is opened
    Then fill in the 'standard_user' and 'secret_sauce' address
    When  click the Login button
    Given the Item page is opened


  Scenario Outline:
    Given Click '<Add>' button add item
    And Click '<Remove>' button remove item
    Then Click cart icon

    Examples:
      | Add                  | Remove               |  |
      | SauceLabsBackpack    | SauceLabsBackpack    |  |
      | SauceLabsBikeLight   | SauceLabsBikeLight   |  |
      | SauceLabsBoltT_Shirt | SauceLabsBoltT_Shirt |  |
      | SauceLabsOnesie      | SauceLabsOnesie      |  |
      | T_ShirtRed           | T_ShirtRed           |  |


  Scenario: Empty cart
   Given Click cart icon

  Scenario: Choose all product
    Given Click all product's add button
    Then Click cart icon

  Scenario:  Choose all product and remove them
    Given Click all product's add button
    And Click all product's remove button
    Then Click cart icon

    Scenario: Click add and remove
      Given Click 'SauceLabsBackpack' button add item
      And Click 'SauceLabsBackpack' button remove item
      Then Click cart icon