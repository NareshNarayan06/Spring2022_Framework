Feature: Hotels Homepage

  Scenario: Verify destination error displayed if search with no destination
  Given User launch hotels homepage
  When User click on the search bar
  Then User verify destination error displayed if search with no destination

  Scenario: Verify enter-children's age error is displayed as soon user add a child
  Given User launch hotels homepage
  When User click on the traveller text box
  When User click on the plus sign to add a child
  Then User verify enter-children's age error is displayed as soon user add a child

  Scenario: Verify error is NOT displayed as soon user enter children's age
    Given User launch hotels homepage
    When User click on the traveller text box
    When User click on the plus sign to add a child
    When User click and select child age from child age dropdown
    Then User verify error is NOT displayed as soon user enter children's age










    #* hotels.com
   # * Verify enter-children's age error is displayed as soon user add a child
   # * and, error is NOT displayed as soon user enter's children's age

   # * After click Search button
   # * Also, verify numbers of travelers before and after is the same.



