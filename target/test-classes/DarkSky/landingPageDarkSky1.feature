Feature: DarkSky HomePage

  Scenario: Verify the current date is highlighted in Time Machine's calendar
    Given User is on darkSky homepage
    When  User scrolls to the timeMachine button and click it
    Then  User verify current date is highlighted in the calendar

  Scenario: Verify same values are displayed in the Today's data
    Given User is on darkSky homepage
    When User scrolls down to the plus button and click
    Then User verify same values are displayed in the Today's data