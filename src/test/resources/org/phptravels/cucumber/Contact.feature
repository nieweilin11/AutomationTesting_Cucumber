Feature: Contact system test

  Background:
    Given the home page is opened
    Given fill in the 'standard_user' and 'secret_sauce' address
    Then click the Login button
    Given the Item page is opened

  Scenario: aboutUs
    And Click sideMenu
    Then Click aboutUs icon

    Scenario: facebook
      Then Click the facebook icon

    Scenario: linkedin
      Then Click the linkedin icon

    Scenario: twitch
      Then Click twitch icon

