Feature: Facebook Homepage
  Scenario: Verify number of window-handles is 1 after closing the link-windows
    Given User launch facebook homepage
    When User click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
    When User Close ALL windows except Instagram
    Then User verify number of window-Handles equals 1


Scenario: Verify page title is Instagram
  Given User launch facebook homepage
  When User click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
  When User Close ALL windows except Instagram
  Then User Verify page title is Instagram

  Scenario: Verify Log in button on Instagram is disabled by default
    Given User launch facebook homepage
    When User click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
    When User Close ALL windows except Instagram
    Then Verify Log in button on Instagram is disabled by default










#* facebook.com
#* Launch facebook.com
#* Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
#* Close ALL windows except Instagram
#* Verify number of window-Handles is 1
#* Verify Page Title is Instagram
#* Verify Log in button on Instagram is disabled by default