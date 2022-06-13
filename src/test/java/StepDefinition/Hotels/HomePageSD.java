package StepDefinition.Hotels;

import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSD {

    LandingPage lPage = new LandingPage();

    @Given("^User launch hotels homepage$")
    public void launchHotelsSD() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @When("^User click on the search bar$")
    public void clickOnSearchBarSD() {
        lPage.clickSearchBox();
    }

    @Then("^User verify destination error displayed if search with no destination$")
    public void verifyErrorMessageDisplayedSD() {
        Assert.assertTrue(lPage.errorMsgIsDisplayed(), "error message is not displayed");
    }

    @When("^User click on the traveller text box$")
    public void clickTravellerTextBoxSD() {
        lPage.clickTravellerBox();
    }

    @When("^User click on the plus sign to add a child$")
    public void clickOnAddSign() {
        lPage.clickOnAddButtonForChildren();
    }

    @Then("^User verify enter-children's age error is displayed as soon user add a child$")
    public void verifyChildrenErrMessageDisplayedSD() {
        Assert.assertTrue(lPage.childErrorMsgDisplayed(), "the error message is not displayed");
    }

    @When("^User click and select child age from child age dropdown$")
    public void clickAndSelectAgeSD() {
        lPage.clickAndSelectAgeFromDd("2");
    }

    @Then("^User verify error is NOT displayed as soon user enter children's age$")
    public void childErrorDisplayedAfterAgeSD(){
        Assert.assertFalse(lPage.isChildMsgDisplayed(),"error message is displayed");
    }

}