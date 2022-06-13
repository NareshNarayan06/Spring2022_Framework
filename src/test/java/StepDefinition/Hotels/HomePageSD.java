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

    @When("^User click on the hotels search bar$")
    public void clickOnSearchBarSD() {
        lPage.clickSearchBox();
    }

    @Then("^User verify destination error displayed if search with no destination$")
    public void verifyErrorMessageDisplayedSD() {
        Assert.assertTrue(lPage.errorMsgIsDisplayed(), "error message is not displayed");
    }

    @When("^User click on the hotels traveller text box$")
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
    public void childErrorDisplayedAfterAgeSD() {
        Assert.assertFalse(lPage.isChildMsgDisplayed(), "error message is displayed");
    }

    @When("^User click on the hotels check-in button$")
    public void clickOnCheckInButton() {
        lPage.clickCheckInButton();
    }

    @When("^User click on the hotels check-in button inside the calendar$")
    public void clickOnCheckInButtonInsideCalendar() {
        lPage.clickCheckInButtonInsideCal();
    }

    @Then("^User verify past dates are disabled on the hotels current month calendar$")
    public void doesPastDatesDisabled() {
        Assert.assertTrue(lPage.isPastDaysDisabled(), "Past days are displayed");
    }

    @Then("^User verify back button on hotels current month is disabled$")
    public void doesBackButtonDisabled() {
        Assert.assertTrue(lPage.isBackButtonDisabled(), "Back Button is enabled");
    }

    @When("^User click the done button under the hotels calendar$")
    public void clickingTheDoneButtonUnderCal() {
        lPage.clickDoneButtonUnderCal();
    }

    @When("^User click on the hotels check-out button$")
    public void clickOnCheckOutButton() {
        lPage.clickCheckOutButton();
    }

    @When("^User click on the hotels check-out button inside the calendar$")
    public void clickOnCheckOutButtonInsideCalendar() {
        lPage.clickCheckOutButtonInsideCal();
    }

    @When("^User select number of adults as 6 on hotels guest page by clicking add button next to 'Adults'$")
    public void selectingTheNumberOfAdults() {
        lPage.selectNumberOfAdults(6);
    }

    @When("^User select number of children as 2 on hotels guest page by clicking add button next to children$")
    public void selectingNumberOfChildren() {
        lPage.selectChild(2);
    }

    @When("^User click the first child button and select age '4' from drop down on hotels guest page$")
    public void clickAndSelectFirstChildButton() {
        lPage.clickAndSelectAgeFromDd("4");
    }

    @When("^User click the second child button and select age 'under 1' from drop down on hotels guest page$")
    public void clickAndSelectAgeForSecondChildButton() {
        lPage.clickAndSelectAgeFromSecondChildDd("0");
    }

    @When("^User click on the hotels done button inside the traveller$")
    public void clickingDoneFromTravellers() {
        lPage.clickDoneBtnFrmTravellers();
    }

    @Then("^User verify total number of guests in sum of adults and children are equal$")
    public void verifyTotalGuestNumAreEqual() {
        Assert.assertTrue(lPage.areTotalNumberOfGuestAreEqual(), "Total Guests are not equal ");
    }

    @Then("^User click and enter (.+) in hotels search box$")
    public void clickAndSelectLocation(String name) {
        lPage.enterDestination(name);
    }

    @Then("^User select (.+) from hotels auto suggestion$")
    public void selectLocationsFromAutoSuggestion(String place) {
        lPage.selectFromDestinationSuggestion(place);
    }

    @Then("^User select date (.+) from hotels check-in calendar$")
    public void selectCheckInDateFromCalendar(String dates){
        lPage.selectDateFromAnyMonth(dates);
    }

    @Then("^User select the date (.+) from hotels check-out calendar$")
    public void selectCheckOutDateFromCalendar(String dates){
        lPage.selectDateFromAnyMonth(dates);
    }

    @Then("^User verify share button is displayed on the hotels")
    public void shareButtonIsDisplayed(){
        Assert.assertTrue(lPage.isShareButtonDisplayed());
    }

    @Then("^User Verify share button is enabled on the hotels$")
    public void shareButtonIsEnabled(){
        Assert.assertTrue(lPage.isShareButtonEnabled());
    }

    @Then("^User Verify Tell us how we can improve our site is displayed on hotels$")
    public void tellUsTextIsDisplayed(){
        Assert.assertTrue(lPage.isTellUsTextDisplayed());
    }

    @Then("^User click on the hotels sign-in link$")
    public void clickSignInButton(){
        lPage.clickSignInHotels();
    }

    @Then("^User click on the hotels sign-up button")
    public void clickSignUPButton(){
        lPage.clickSignUpHotels();
    }

    @Then("^User clicks Term and Condition link on the hotels$")
    public void clicksTermsAndConditions(){
        lPage.clickTermsAndConditionsHotels();
    }

    @Then("^User verify “Terms and Conditions” page opens in hotels new tab")
    public void verifyTermsAndConditionOnNewTab(){
        Assert.assertEquals(lPage.verifyTermsAndConditionsOnHotels(),
                "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
    }

    @Then("^User click “Privacy Statement” link on the hotels$")
    public void clickPrivacyStatement(){
        lPage.clickPrivacyStatement();
    }

    @Then("^User verify “Privacy Statement” page opens in hotels new tab$")
    public void verifyPrivacyStatementOnNewTab(){
        Assert.assertEquals(lPage.privacyStatementOnHotels(),
                "Privacy Statement");
    }

    @Then("^User click on the hotels sign-in button under sign-in link$")
    public void clickSignInUnderSignInButton(){
        lPage.clickSignInButtonHotels();
    }

    @Then("^User enter (.+) in hotels login username$")
    public void enterLogInUsername(String userName){
            lPage.enterLogInUsernameHotels(userName);
    }

    @Then("^User enter (.+) in hotels login password$")
    public void enterPassword(String password){
            lPage.enterPasswordHotels(password);
    }

    @Then("User click on the sign-in button on the log-in form of hotels$")
    public void clickSignInButtonOnLoginForm(){
        lPage.clickingSigInLogInFormHotels();
    }

    @Then("^User Verify verification message for invalid sign in credentials$")
    public void verifyMessageIsDisplayedForInvalid(){
        Assert.assertTrue(lPage.invalidErrorMsgIsDisplayedHotels());
    }

    @Then("^User click on the hotels feedback button$")
    public void clickFeedBackButton(){
        lPage.clickingFeedbackButtonHotels();
    }

    @Then("^User click on the submit button in hotels feedback page$")
    public void clickSubmitButtonInTheFeedBack(){
        lPage.clickingSubmitButtonInFeedBackHotels();
    }

    @Then("^User Verify error is displayed when user submits the empty feedback form$")
    public void verifyErrorMsgIsDisplayedFeedBackForm(){
        Assert.assertTrue(lPage.errorMessageInFeedBackFormHotels());
    }

}