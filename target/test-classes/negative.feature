Feature: negative
  As a user
  I want to test some site functional
  So that I can be sure that this functional works correctly



  Scenario Outline: Check add to bag without select size
    Given User opens '<homePage>' page
    When User clicks on 'Search Field'
    And User write '<Search Word>' and click Enter
    And User click on first T-Shirt
    And User click 'Add to Bag'
    Then User get another Error Message

    Examples:
      | homePage                    |Search Word|
      | https://www.asos.com/women/ |Boss|