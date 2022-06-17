package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LandingPageHotelsSD {

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

    @When("^User click on the hotels Dates button$")
    public void clickOnDatesButton() {
        lPage.clickDatesButton();
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

    @Then("^User enter (.+) in hotels sign-up email address box$")
    public void enterEmailAddressOnSignUpForm(String input) {
        lPage.enterEmailAddressOnSignUpForm(input);
    }

    @Then("^User enter (.+) in hotels sign-up first name box$")
    public void enterFirstnameOnSignUpForm(String firstName){
        lPage.enterFirstnameOnSignUpForm(firstName);
    }

    @Then("^User enter (.+) in hotels sign-up last name box$")
    public void enterLastnameOnSignUpForm(String LastName){
        lPage.enterLastnameOnSignUpForm(LastName);
    }

    @Then("^User enter (.+) in hotels sign-up password box$")
    public void enterPasswordOnSignUpForm(String password){
        lPage.enterPasswordOnSignUpForm(password);
    }

    @Then("^User verify error is displayed 'Enter a valid email address' hotels sign-up page$")
    public void verifyEmailAddressErrorDisplayedOnSignUpForm(){
        Assert.assertTrue(lPage.errorMsgOnEmailAddressSignUpDisplayed(),"Error Message is not displayed");
    }

    @Then("^User verify error is displayed 'First name cannot contain special characters' hotels sign-up page$")
    public void verifyFirstNameErrorDisplayedOnSignUpForm(){
        Assert.assertTrue(lPage.errorMsgOnFirstNameSignUpDisplayed(),"Error Message is not displayed");
    }

    @Then("^User verify error is displayed 'Last name cannot contain special characters' hotels sign-up page$")
    public void verifyLastNameErrorDisplayedOnSignUpForm(){
        Assert.assertTrue(lPage.errorMsgOnLastNameSignUpDisplayed(),"Error Message is not displayed");
    }

    @Then("^User verify 'Keep me signed in' checkbox on hotels sign-up page is displayed$")
    public void verifyCheckBoxMessageDisplayedOnSignUpForm(){
        Assert.assertTrue(lPage.keepMeSignMeCheckBoxDisplayed(),"CheckBox is not displayed");
    }

    @Then("^User verify 'Keep me signed in' checkbox on hotels sign-up page is enabled$")
    public void verifyCheckBoxEnabledOnSignUpForm(){
        Assert.assertTrue(lPage.keepMeSignMeCheckBoxEnabled(),"CheckBox is not enabled");
    }

    @Then("^User verify 'Continue' button on hotels sign-up page is displayed$")
    public void verifyContinueButtonDisplayedOnSignUpForm(){
        Assert.assertTrue(lPage.continueButtonSignUpDisplayed(),"Continue button is displayed");
    }

    @Then("^User verify 'Continue' button on hotels sign-up page is not enabled$")
    public void verifyContinueButtonNotEnabledOnSignUpForm(){
        Assert.assertFalse(lPage.continueButtonSignUpNotEnabled(),"Continue button is enabled");
    }

    @Then("^User click on the (.+) star on the hotels star ratings from 1 to 5")
    public void selectFiveStarFromStarRating(String star){
        lPage.clickAndSelectStarFromStarRatings(star);
    }

    @Then("^User select (.+) from hotels sort-by dropdown$")
    public void selectPriceFromSortByDropDown(String dropDownData){
        lPage.selectFromSortByDropDown(dropDownData);
    }

    @Then("^User verify all hotels in search results are five star rated as selected in above step$")
    public void verifyHotelsAreFiveStarRated(){
        Assert.assertTrue(lPage.verifySelectedHotelsAreFiveStarRated(),"Hotels are not five star rated");
    }

    @Then("^User verify all hotels are listed in increasing order of the price$")
    public void verifyHotelsPricesAreIncreasingOrder(){
        Assert.assertTrue(lPage.verifyPricesAreInIncreasingOrder(),"Its not in increasing order");
    }

    @Then("^User click on the submit button in hotel feedback page$")
    public void clickSubmitInFeedBackForm(){
            lPage.submitButtonClickFeedbackPage();
    }

    @Then("^User select (.+) star rating on the hotels feedback form$")
    public void selectStarRatingInFeedBackForm(String rating){
        lPage.moveToFeedbackForm();
        lPage.selectStarRatingFromFeedBack(rating);
    }

    @Then("^User enter (.+) on feedback form comment box$")
    public void enteringCommentOnCommentBox(String comments){
            lPage.enterCommentsOnCommentBox(comments);
    }

    @Then("^User select (.+) option for How likely are you to return to Hotels.com$")
    public void selectOptionFromHowLikelyReturnsToHotels(String option){
            lPage.selectOptionsHowLikely(option);
    }

    @Then("^User select (.+) answer for Prior to this visit have you ever booked on Hotels.com$")
    public void selectOptionFromHaveBookedPrior(String answer){
            lPage.selectOptionsPriorBooking(answer);
    }

    @Then("^User select (.+) answer for Did you accomplish what you wanted to do on Hotels.com$")
    public void selectOptionFromAccomplish(String answer){
        lPage.selectOptionsAccomplishment(answer);
    }

    @Then("^User verify THANK YOU FOR YOUR FEEDBACK is displayed$")
    public void verifyThankYouMsgDisplayed(){
        Assert.assertTrue(lPage.thankYouFeedbackMsgDisplayed(),"Message is not displayed");
    }

    @Then("^User click on more travel button on hotels$")
    public void clickingMoreTravels(){
        lPage.clickMoreTravel();
    }

    @Then("^User select (.+) from more travel dropdown on hotels$")
    public void selectFromMoreTravelsDropDown(String name){
        lPage.selectFromMoreTravelDropdown(name);
    }

    @Then("^User verify Manage your booking anytime, anywhere is displayed$")
    public void verifyManageBookingIsDisplayed(){
        Assert.assertTrue(lPage.isManageBookingDisplayed(),"Its not displayed");
    }

    @Then("^User verify Manage your booking anytime, anywhere is enabled$")
    public void verifyManageBookingIsEnabled(){
        Assert.assertTrue(lPage.isManageBookingEnabled(),"Its not enabled");
    }

    @Then("^User verify Stay Flexible with free cancellation is displayed$")
    public void verifyStayFlexibleIsDisplayed(){
        Assert.assertTrue(lPage.isStayFlexibleDisplayed(),"Its not displayed");
    }

    @Then("^User verify Stay Flexible with free cancellation is enabled$")
    public void verifyStayFlexibleIsEnabled(){
        Assert.assertTrue(lPage.isStayFlexibleEnabled(),"Its not enabled");
    }

    @Then("^User verify Save on your next trip to the great outdoors is displayed$")
    public void verifyNextTripIsDisplayed(){
        Assert.assertTrue(lPage.isNextTripIsDisplayed(),"Its not displayed");
    }

    @Then("^User verify Save on your next trip to the great outdoors is enabled$")
    public void verifyNextTripIsEnabled(){
        Assert.assertTrue(lPage.isNextTripEnabled(),"Its not enabled");
    }

    @Then("^User click Manage your booking anytime, anywhere on hotels$")
    public void clickManageBooking(){
        lPage.clickingManageBooking();
    }

    @Then("^User Verify Search, book and Save on the go title is displayed$")
    public void verifyManageBookTitleIsDisplayed(){
        Assert.assertTrue(lPage.isManageBookingTitleDisplayed(),"The title is not displayed");
    }

    @Then("^User go back to deals on hotels$")
    public void goBackToDeals(){
        lPage.goBack();
        Misc.pause(2);
    }

    @Then("^User click on Stay Flexible with free cancellation on hotels$")
    public void clickStayFlexible(){
        lPage.clickingStayFlexible();
    }

    @Then("^User verify Amazing deals with free cancellation is displayed$")
    public void verifyStayFlexibleTitleIsDisplayed(){
        Assert.assertTrue(lPage.isStayFlexibleTitleIsDisplayed(),"The Title is not displayed");
    }

    @Then("^User click on Save on your next trip to the great outdoors$")
    public void clickNextTrip(){
        lPage.clickingNextTrip();
    }

    @Then("^User verify Save on your next trip to the great outdoors title is displayed$")
    public void verifyNextTripTitleIsDisplayed(){
        Assert.assertTrue(lPage.nextTripTitleIsDisplayed(),"The title is not displayed");
    }




}