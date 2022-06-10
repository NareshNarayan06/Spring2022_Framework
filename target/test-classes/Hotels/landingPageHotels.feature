
Feature: Hotels Homepage

  #Background:
   #Given User launch hotels homepage

  Scenario: Verify destination error displayed if search with no destination
  Given User launch hotels homepage
  When User click on the hotels search bar
  Then User verify destination error displayed if search with no destination

  Scenario: Verify enter-children's age error is displayed as soon user add a child
  Given User launch hotels homepage
  When User click on the hotels traveller text box
  When User click on the plus sign to add a child
  Then User verify enter-children's age error is displayed as soon user add a child

  Scenario: Verify error is NOT displayed as soon user enter children's age
    Given User launch hotels homepage
    When User click on the hotels traveller text box
    When User click on the plus sign to add a child
    When User click and select child age from child age dropdown
    Then User verify error is NOT displayed as soon user enter children's age

    @TC-17
  Scenario: Verify past dates and back button are disabled on the current month calendar
      Given User launch hotels homepage
      When User click on the hotels check-in button
      When User click on the hotels check-in button inside the calendar
      Then User verify past dates are disabled on the hotels current month calendar
      Then User verify back button on hotels current month is disabled
      When User click the done button under the hotels calendar
      When User click on the hotels check-out button
      When User click on the hotels check-out button inside the calendar
      Then User verify past dates are disabled on the hotels current month calendar
      Then User verify back button on hotels current month is disabled

      @TC-18
      Scenario: Verify user can update number of guests in hotels homepage
        Given User launch hotels homepage
        When User click on the hotels traveller text box
        When User select number of adults as 6 on hotels guest page by clicking add button next to 'Adults'
        When User select number of children as 2 on hotels guest page by clicking add button next to children
        When User click the first child button and select age '4' from drop down on hotels guest page
        When User click the second child button and select age 'under 1' from drop down on hotels guest page
        When User click on the hotels done button inside the traveller
        Then User verify total number of guests in sum of adults and children are equal


      @TC-19
      Scenario: Verify Share feedback button is displayed at the end of hotels search results
        Given User launch hotels homepage
        When User click and enter Bora in hotels search box
        When User select Bora Bora from hotels auto suggestion
        When User click on the hotels check-in button
        When User select date 1 August 2022 from hotels check-in calendar
        When User click the done button under the hotels calendar
        When User click on the hotels check-out button
        When User select the date 10 August 2022 from hotels check-out calendar
        When User click the done button under the hotels calendar
        When User click on the hotels search bar
        Then User verify share button is displayed on the hotels
        Then User Verify share button is enabled on the hotels
        Then User Verify Tell us how we can improve our site is displayed on hotels


      @TC-20
      Scenario: Verify TermsAndConditions link and PrivacyStatements link open hotels correct page on new tab
        Given User launch hotels homepage
        When User click on the hotels sign-in link
        When User click on the hotels sign-up button
        When User clicks Term and Condition link on the hotels
        Then User verify “Terms and Conditions” page opens in hotels new tab
        When User click “Privacy Statement” link on the hotels
        Then User verify “Privacy Statement” page opens in hotels new tab

        @TC-21
       Scenario: Verify verification message for invalid sign in credentials
          Given User launch hotels homepage
          When User click on the hotels sign-in link
          When User click on the hotels sign-in button under sign-in link
          When User enter test@gmail.com in hotels login username
          When User enter test@123 in hotels login password
          When User click on the sign-in button on the log-in form of hotels
          Then User Verify verification message for invalid sign in credentials


        @TC-24
        Scenario: Verify error is displayed when user submits the empty feedback form
          Given User launch hotels homepage
          When User click on the hotels sign-in link
          When User click on the hotels feedback button
          When User click on the submit button in hotels feedback page
          Then User Verify error is displayed when user submits the empty feedback form









