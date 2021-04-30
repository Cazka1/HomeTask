Feature: homeTask1
  As a user
  I want to test some site functional
  So that I can be sure that this functional works correctly

#  Scenario Outline: Сheck the purchase
#    When User click on 'UA' button
#    When User clicks on 'Search Field'
#    And User write '<Search Word>' and click Enter button
#    And User choose 'Apple' producer
#    And User click on first product
#    And user check that product name contains '<Product Name>'
#    And user click buy button
#    Then User see cart window
#    Examples:
#      | Search Word                   | Product Name                   |
#      | Apple iPhone 12 Pro Max 256GB | Apple iPhone 12 Pro Max 256 GB |


  Scenario Outline: Check registration without e-mail
    When User click on 'UA' button
    When User clicks on 'Log In' button
    And User click 'Registration' button
    And User clicks on 'Name' field
    And User enter name '<Name>'
    And User clicks on 'Surname' field
    And User enter surname '<Surname>'
    And User enter phone number '<Phone Number>'
    And User clicks on 'Password' field'
    And User enter password '<Password>'
    And user click on 'registration' button
    Then User see 'Write e-mail' message
    Examples:
      | Password   | Name      | Surname    | Phone Number |
      | 1234567891 | Олександр | Войналович | 0678358099   |
#
#
#  Scenario Outline: Check search for non-existent goods
#    When User clicks on 'Search Field'
#    And User Write '<Search Word>'
#    Then User see 'Message'
#
#    Examples:
#      | Search Word       |
#      | синхрофазотрон    |
#      | зілля невидомості |
#      | індульгенція      |
#
#  Scenario Outline: Check sorting
#    When User click on 'UA' button
#    When User clicks on 'Search Field'
#    And User write '<Search Word>' and click Enter button
#    And User choose 'Apple' producer
#    And User click 'Sort Button'
#    And User click 'From Cheap to Expensive' button
#    And User click 'Large tiles'
#    And User check that first product cheaper than last
#    And User click 'Sort Button'
#    And User click 'From Expensive to Cheap' button
#    And User click 'Small tiles'
#    Then User check that first product more expensive than last
#    Examples:
#      | Search Word                   |
#      | Apple iPhone 12 Pro Max 256GB |