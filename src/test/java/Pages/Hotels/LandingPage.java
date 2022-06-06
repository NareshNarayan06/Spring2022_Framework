package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends Commands {

    //
    By checkInDateBoxLocator = By.id("d1-btn");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");

    By searchBarLocator = By.xpath("//button[@data-testid='submit-button']");
    By searchBarErrorMsgLocator = By.xpath("//h3[contains(text(),'To continue, please')]");

    By travellerBoxLocator = By.xpath("//button[contains(text(),'1 room, 2 travelers')]");
    By childrenAddButtonLocator = By.xpath("(//span[contains(@class,'input-button')])[4]");
    By childErrorMsgLocator = By.xpath("//*[text()='Please provide the ages of children.']");
    By childAgeDropDownLocator = By.id("child-age-input-0-0");
    By childAgeDropDownElementsLocator = By.xpath("//select[@id='child-age-input-0-0']//option[text()]");


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
    }

    public void selectFromDestinationSuggestion(String userChoice) {
        selectFromSuggestions(destinationSuggestions, userChoice);
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
    }

    public void clickSearchBox() {
        clickIt(searchBarLocator);
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





        public void clickAndSelectAgeFromDd(String age){
        List<WebElement> ageElements = findWebElements(childAgeDropDownElementsLocator);
        for (WebElement ages : ageElements) {

            String ageValue = ages.getAttribute("value");
            if (ageValue.equals(age)) {
                ages.click();
            }
        }

    }
}
