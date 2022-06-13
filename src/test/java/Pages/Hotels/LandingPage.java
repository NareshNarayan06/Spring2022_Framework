package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class LandingPage extends Commands {

    //
    By checkInDateBoxLocator = By.id("d1-btn");
    By checkInDateButtonLocator = By.xpath("//button[@id='d1-btn']");
    By checkInButtonInsideCalender = By.xpath("(//button[@type='button']/span)[1]");
    By checkOutButtonInsideCalendar = By.xpath("(//button[@type='button']/span)[2]");
    By checkOutButtonLocator = By.xpath("//button[@id='d2-btn']");
    By calBackButtonLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[1]");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");
    By doneButtonUnderCalLocator = By.xpath("//button[contains(text(),'Done')and@data-stid]");
    By doneButtonUnderTravellerLocator = By.xpath("//button[@data-testid='guests-done-button']");
    By searchBarLocator = By.xpath("//button[@data-testid='submit-button']");
    By searchBarErrorMsgLocator = By.xpath("//h3[contains(text(),'To continue, please')]");

    By adultNumValueLocator = By.xpath("//input[@id='adult-input-0']");
    By childrenNumValueLocator = By.xpath("//input[@id='child-input-0']");

    By travellerBoxLocator = By.xpath("//button[contains(text(),'1 room, 2 travelers')]");
    By travelerNumLocator = By.xpath("//button[contains(text(),'travelers')] ");

    By howCanYouImproveTextLocator = By.xpath("//span[contains(text(),'Tell us how we can improve our site')]");
    By shareFeedBackButton = By.xpath("//a[contains(text(),'Share feedback')]");
    By shareButton = By.partialLinkText("Share feedback");
    By getAppLocator = By.xpath("//div[@data-stid='voice-of-the-customer']/span");
    By shareButtonLinkTextLocator = By.linkText("Share feedback");

    By signInLocator = By.xpath("//button[contains(text(),'Sign in')]");
    By usernameInputLocator = By.xpath("//input[@id='loginFormEmailInput']");
    By signInButtonLocator = By.linkText("Sign in");
    By passwordLocator = By.xpath("//input[@name='password']");
    By logInFormSignInButtonLocator = By.xpath("//button[@id='loginFormSubmitButton']");
    By signUpLocator = By.xpath("//a[@data-stid='link-header-account-signup']");
    By invalidErrorMsgInLogInFormLocator = By.xpath("//h3[contains(text(),'Email and password')]");
    By termsAndConditionLocator = By.linkText("Terms and Conditions");
    By privacyStatementLocator = By.linkText("Privacy Statement");
    By feedBackButtonLocator = By.xpath("//div[contains(text(),'Feedback')]");
    By submitButtonInFeedbackFormLocator = By.xpath("//button[@id='submit-button']") ;
    By errorMsgInTheFeedBackFormLocator = By.xpath("//p[contains(text(),'fill in the required')]");


    By childrenAddButtonLocator = By.xpath("(//span[contains(@class,'input-button')])[4]");
    By adultAddButtonLocator = By.xpath("(//span[contains(@class,'input-button')])[2]");
    By childErrorMsgLocator = By.xpath("//*[text()='Please provide the ages of children.']");
    By childAgeDropDownLocator = By.id("child-age-input-0-0");
    By childAgeDropDownElementsLocator = By.xpath("//select[@id='child-age-input-0-0']//option[text()]");
    By secondChildAgeDropDownElementSLocator = By.xpath("//select[@id='child-age-input-0-1']//option[@value]");


    By june2022DatesLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");
    /*

        monthYear = August 2022
        "//h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day]"
        monthDates_1 + monthYear + monthDates_2
     */
    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";

    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");


    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInputLocator = By.id("location-field-destination");
  //By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");
  // By destinationSuggestions = By.xpath("//div[@class='truncate']//following-sibling::div[@class='is-subText truncate']");                //button[@aria-label]


    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");


    public void clickCheckInBox() {
        clickIt(checkInDateBoxLocator);
    }

    public List<WebElement> getAllDisabledDates() {
        return findWebElements(checkInDisabledDatesLocator);
    }

    public void selectDateInJune2022(String dateToSelect) {
        selectDateInCalendar(june2022DatesLocator, dateToSelect);
    }

    public void enterDestination(String destination) {
        clickIt(destinationInputBoxLocator);
        type(destinationInputLocator, destination);
        Misc.pause(2);
    }

    public void selectFromDestinationSuggestion(String destination) {
        selectFromSuggestions(destinationSuggestions,destination);
        Misc.pause(2);
    }

    public void goToMonth(String monthYear) {
        for (int i = 0; i < 12; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }


    public void selectDateFromAnyMonth(String dateMonthYear) {
        String[] dateValues = dateMonthYear.split(" ");
        goToMonth(dateValues[1] + " " + dateValues[2]);
        By allDatesLocator = By.xpath(monthDates_1 + dateValues[1] + " " + dateValues[2] + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValues[0]);
        Misc.pause(1);
    }

    public void clickSearchBox() {
        clickIt(searchBarLocator);
        Misc.pause(7);
    }

    public boolean errorMsgIsDisplayed() {
        return isElementDisplayed(searchBarErrorMsgLocator);
    }

    public void clickTravellerBox() {
        clickIt(travellerBoxLocator);
    }

    public void clickOnAddButtonForChildren() {
        clickIt(childrenAddButtonLocator);
    }

    public boolean childErrorMsgDisplayed() {
        return isElementDisplayed(childErrorMsgLocator);
    }


    public boolean isChildMsgDisplayed() {
        boolean isItDisplay = false;
        String msgDisplayed = "Please provide the ages of children.";
        if (getPageSource().contains(msgDisplayed)) {
            isItDisplay = true;
        } else
            isItDisplay = false;
        return isItDisplay;
    }


    public void clickAndSelectAgeFromDd(String age) {
        List<WebElement> ageElements = findWebElements(childAgeDropDownElementsLocator);
        for (WebElement ages : ageElements) {

            String ageValue = ages.getAttribute("value");
            if (ageValue.equals(age)) {
                ages.click();
            }
        }
    }

    public void clickAndSelectAgeFromSecondChildDd(String age) {
        List<WebElement> ageElements = findWebElements(secondChildAgeDropDownElementSLocator);
        for (WebElement ages : ageElements) {

            String ageValue = ages.getAttribute("value");
            if (ageValue.equals(age)) {
                ages.click();
            }
        }
    }



    public void selectNumberOfAdults(int num) {
        WebElement a = findWebElement(adultAddButtonLocator);
        for (int i = 2; i < num; i++) {
            a.click();
        }
    }


    public void clickCheckInButton() {
        clickIt(checkInDateButtonLocator);
    }

    public void clickCheckInButtonInsideCal() {
        clickIt(checkInButtonInsideCalender);
    }

    public boolean isPastDaysDisabled() {
        return isElementDisplayed(checkInDisabledDatesLocator);
    }

    public boolean isBackButtonDisabled() {
        return isElementDisplayed(calBackButtonLocator);
    }

    public void clickDoneButtonUnderCal() {
        clickIt(doneButtonUnderCalLocator);
        Misc.pause(1);
    }

    public void clickCheckOutButton() {
        clickIt(checkOutButtonLocator);
        Misc.pause(1);
    }

    public void clickCheckOutButtonInsideCal() {
        clickIt(checkOutButtonInsideCalendar);
    }

    public void selectChild(int num) {
        WebElement a = findWebElement(childrenAddButtonLocator);
        for (int i = 1; i <= num; i++) {
            a.click();
        }
    }

    public void clickDoneBtnFrmTravellers() {
        clickIt(doneButtonUnderTravellerLocator);
    }

    public boolean areTotalNumberOfGuestAreEqual() {
   boolean isItEqual = false;
   int adultNum=Integer.parseInt( getAttributeValueFromWebElement(adultNumValueLocator,"value"));
   int childNum=Integer.parseInt(getAttributeValueFromWebElement(childrenNumValueLocator,"value"));
   int total= adultNum+childNum;

   String totalInString = Integer.toString(total);
   String travelersText=getTextOfElement(travelerNumLocator);

   if (travelersText.contains(totalInString)){
       isItEqual=true;
   }

        return isItEqual;
    }

    public boolean isShareButtonDisplayed(){

        MyDriver.getDriver().manage().window().maximize();
        Misc.pause(2);
        scrollIntoElementToView(shareButtonLinkTextLocator);
        boolean isItDisplayed = findWebElementWithWait(shareButtonLinkTextLocator).isDisplayed();
        return isItDisplayed;
    }

    public boolean isShareButtonEnabled(){
        return findWebElementWithWait(shareButtonLinkTextLocator).isEnabled();
    }

    public boolean isTellUsTextDisplayed(){
        return findWebElementWithWait(howCanYouImproveTextLocator).isDisplayed();
    }

    public void clickSignInHotels(){
        clickIt(signInLocator);
        Misc.pause(1);
    }

    public void clickSignInButtonHotels(){
        clickIt(signInButtonLocator);
        Misc.pause(1);
    }

    public void clickSignUpHotels(){
        clickIt(signUpLocator);
        Misc.pause(1);
    }

    public void clickTermsAndConditionsHotels(){
        clickIt(termsAndConditionLocator);
        Misc.pause(1);
    }

    public void clickPrivacyStatement(){
        clickIt(privacyStatementLocator);
        Misc.pause(1);
    }

    public String verifyTermsAndConditionsOnHotels() {

        String currentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindows = MyDriver.getDriver().getWindowHandles();
        String currentTitle = null;
        for (String window : allWindows) {
            if (!currentWindowHandle.equalsIgnoreCase(window)) {
                MyDriver.getDriver().switchTo().window(window);
                currentTitle = MyDriver.getDriver().getTitle();
                Misc.pause(2);
                MyDriver.getDriver().close();
                MyDriver.getDriver().switchTo().window(currentWindowHandle);
            }
        }
        return currentTitle;
    }


    public String privacyStatementOnHotels() {

        String currentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindow = MyDriver.getDriver().getWindowHandles();
        String Title = null;
        for (String windows : allWindow) {
            if (!currentWindowHandle.equalsIgnoreCase(windows)) {
                MyDriver.getDriver().switchTo().window(windows);
                Title = MyDriver.getDriver().findElement(privacyStatementLocator).getText();
                Misc.pause(2);
                MyDriver.getDriver().close();
                MyDriver.getDriver().switchTo().window(currentWindowHandle);
            }
        }
        return Title;
    }

    public void clickingSubmitButtonInFeedBackHotels(){
        String presentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindowF = MyDriver.getDriver().getWindowHandles();
        for (String windows : allWindowF) {
            if (!presentWindowHandle.equalsIgnoreCase(windows)) {
                MyDriver.getDriver().switchTo().window(windows);
              scrollIntoElementToView(submitButtonInFeedbackFormLocator);
                Misc.pause(2);
                clickIt(submitButtonInFeedbackFormLocator);

            }
        }
    }




    public void enterLogInUsernameHotels(String userName){
        type(usernameInputLocator,"test@gmail.com");
        Misc.pause(1);
    }

    public void enterPasswordHotels(String password){
        type(passwordLocator,"test@123");
        Misc.pause(1);
    }

    public void clickingSigInLogInFormHotels(){
        clickIt(logInFormSignInButtonLocator);
        Misc.pause(10);
    }

    public boolean invalidErrorMsgIsDisplayedHotels(){
       return isElementDisplayed(invalidErrorMsgInLogInFormLocator);

    }

    public void clickingFeedbackButtonHotels(){
        clickIt(feedBackButtonLocator);
    }

    public boolean errorMessageInFeedBackFormHotels(){
        return isElementDisplayed(errorMsgInTheFeedBackFormLocator);
    }

}


