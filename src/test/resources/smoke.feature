Feature: Smoke
  As a user
  I want to test some site functional
  So that I can be sure that this functional works correctly

  Scenario Outline: Check color products
    Given User opens '<homePage>' page
    When User clicks on 'Man' button
    And User clicks on 'Shop Now' button
    And User clicks on 'Change Color' button
    And User checks color list visible
    And User choose '<color>' color
    Then User check that list of products has '<color>' color



    Examples:
      | homePage                  | color |
      | https://www.asos.com/men/ | black |

  Scenario Outline: Check watches price
    Given User opens '<homePage>' page
    When User clicks on 'Search Field'
    And User write '<Search Word>' and click Enter
    And User click 'Sort Button'
    And User wait sorting options
    And User click on 'Price Low to High'
    Then User check watches price


    Examples:
      | homePage                    | Search Word |
      | https://www.asos.com/women/ | watch       |
