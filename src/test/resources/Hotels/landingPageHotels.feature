
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
      When User click on the hotels Dates button
      Then User verify past dates are disabled on the hotels current month calendar
      Then User verify back button on hotels current month is disabled
      When User click the done button under the hotels calendar


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
        When User click on the hotels Dates button
        When User select date 1 August 2022 from hotels check-in calendar
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


        @TC-22
        Scenario: Verify error message for invalid data in SignUp form
          Given User launch hotels homepage
          When User click on the hotels sign-in link
          When User click on the hotels sign-up button
          When User enter #!@### in hotels sign-up email address box
          When User enter !@ in hotels sign-up first name box
          When User enter %^& in hotels sign-up last name box
          When User enter 1234 in hotels sign-up password box
          Then User verify error is displayed 'Enter a valid email address' hotels sign-up page
          Then User verify error is displayed 'First name cannot contain special characters' hotels sign-up page
          Then User verify error is displayed 'Last name cannot contain special characters' hotels sign-up page
          Then User verify 'Keep me signed in' checkbox on hotels sign-up page is displayed
          Then User verify 'Keep me signed in' checkbox on hotels sign-up page is enabled
          Then User verify 'Continue' button on hotels sign-up page is displayed
          Then User verify 'Continue' button on hotels sign-up page is not enabled

       @TC-23
       Scenario: Verify filter-by and sort-by functionality works as expected
         Given User launch hotels homepage
         When User click and enter Manhattan in hotels search box
         When User select Manhattan from hotels auto suggestion
         When User click on the hotels Dates button
         When User select date 10 August 2022 from hotels check-in calendar
         When User select the date 15 August 2022 from hotels check-out calendar
         When User click the done button under the hotels calendar
         When User click on the hotels search bar
         When User click on the 5 star on the hotels star ratings from 1 to 5
         When User select Price from hotels sort-by dropdown
         Then User verify all hotels in search results are five star rated as selected in above step
         Then User verify all hotels are listed in increasing order of the price

       @TC-25
       Scenario: Verify user can submit feedback after completing the feedback form
         Given User launch hotels homepage
         When User click on the hotels sign-in link
         When User click on the hotels feedback button
         When User select 3 star rating on the hotels feedback form
         When User enter its not up to the mark on feedback form comment box
         When User select Unsure option for How likely are you to return to Hotels.com
         When User select Yes answer for Prior to this visit have you ever booked on Hotels.com
         When User select No answer for Did you accomplish what you wanted to do on Hotels.com
         When User click on the submit button in hotel feedback page
         Then User verify THANK YOU FOR YOUR FEEDBACK is displayed

       @TC-26
       Scenario: Verify links on Deals page
         Given User launch hotels homepage
         When User click on more travel button on hotels
         When User select Deals from more travel dropdown on hotels
         Then User verify Manage your booking anytime, anywhere is displayed
         Then User verify Manage your booking anytime, anywhere is enabled
         Then User verify Stay Flexible with free cancellation is displayed
         Then User verify Stay Flexible with free cancellation is enabled
         Then User verify Save on your next trip to the great outdoors is displayed
         Then User verify Save on your next trip to the great outdoors is enabled
         When User click Manage your booking anytime, anywhere on hotels
         Then User Verify Search, book and Save on the go title is displayed
         When User go back to deals on hotels
         When User click on Stay Flexible with free cancellation on hotels
         Then User verify Amazing deals with free cancellation is displayed
         When User go back to deals on hotels
         When User click on Save on your next trip to the great outdoors
         Then User verify Save on your next trip to the great outdoors title is displayed












