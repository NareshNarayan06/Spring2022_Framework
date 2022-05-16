package StepDefinition.DarkSky;

import Helper.Misc;
import Pages.Darksky.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DarkSkySD {

    LandingPage lPage = new LandingPage();

    @Given("^User is on darkSky homepage$")
    public void launchDarkSkySd(){
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
    }

   @When("^User scrolls to the timeMachine button and click it$")
    public void scrollsAndClickSd(){
        lPage.scrollAndClickTimeMachineButton();
   }

   @Then("^User verify current date is highlighted in the calendar$")
    public void isItHighlightedSd(){
        lPage.verifyDateHighlighted();
   }

   @When("^User scrolls down to the plus button and click$")
    public void scrollAndClickPlusButtonSd(){
        lPage.scrollAndClickPlusButton();
   }

   @Then("^User verify same values are displayed in the Today's data$")
    public void verifyValuesDisplayedAreCorrect(){
       lPage.verifyHighTempValAreEqual();
       lPage.verifyLowTempValAreEqual();

   }

}
