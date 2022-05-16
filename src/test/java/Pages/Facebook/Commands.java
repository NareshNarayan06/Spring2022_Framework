package Pages.Facebook;

import Helper.DateLib;
import Web.MyDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Commands {

    // Create a local method to find WebElement
    public WebElement findWebElement(By locator) {
        return MyDriver.getDriver().findElement(locator);
    }

    // Create a local method to find WebElements
    public List<WebElement> findWebElements(By locator) {
        return MyDriver.getDriver().findElements(locator);
    }

    // Create a local method to type in the webElement
    public void type(By locator, String data) {
        findWebElement(locator).sendKeys(data);
    }

    public String getCurrentTitle(){
       return MyDriver.getDriver().getTitle();
    }

    public String getTextOfWebElement(By locator) {
        return findWebElement(locator).getText();
    }

    public String getAttributeValueFromWebElement(By locator, String attribute) {
        return findWebElement(locator).getText();
    }

    // Create a local method to click on the webElement
    public void clickIt(By locator) {
        findWebElement(locator).click();
    }

    //Method to get text of element
    public String getTextOfElement(By locator) {
        return findWebElement(locator).getText();
    }

    // Create a local method to click on the webElement after scroll
    public void clickItWithScroll(By locator) {
        scrollToElement(locator).click();
    }

    // Create a local method to find if element is enabled
    public boolean isElementEnabled(By locator) {
        return findWebElement(locator).isEnabled();
    }

    // Create a local method to select a value from a dropdown
    public void selectInDropdown(By locator, String dataToSelect) {
        WebElement ddElement = findWebElement(locator);
        Select dropdown = new Select(ddElement);
        dropdown.selectByVisibleText(dataToSelect);
    }

    // Create a local method to find if element is displayed
    public boolean isElementDisplayed(By locator) {
        return findWebElement(locator).isDisplayed();
    }

    // Create custom method to scroll
    public WebElement scrollToElement(By locator) {
        WebElement element = null;
        for (int i=0 ; i <= 20 ; i++) {
            try {
                element = findWebElement(locator);
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException e) {
                //scroll by 100
                JavascriptExecutor js =  (JavascriptExecutor) MyDriver.getDriver();
                js.executeScript("scrollBy(0,100)");
            }
        }
        return element;
    }

    public void verifyIsEquals(String element1,String element2){
        Assert.assertEquals(element1, element2, "They are not equal");

    }

    // custom methods to switch to a window
    public void switchToWindow(String newHandle) {
        MyDriver.getDriver().switchTo().window(newHandle);
    }

    public void switchToWindowAndClose(String handle){
        MyDriver.getDriver().switchTo().window(handle).close();
    }
    // custom method to get current window-handle
    public String getCurrentWindowHandle() {
        return MyDriver.getDriver().getWindowHandle();
    }

    // custom method to get all window-handles
    public Set<String> getAllWindowHandles() {
        return MyDriver.getDriver().getWindowHandles();
    }

    // custom method to select date from Calendar
    public void selectDateInCalendar(By locator, String userDate) {
        List<WebElement> allDates = MyDriver.getDriver().findElements(locator);
        for (WebElement dateElement : allDates) {
            String dateValue = dateElement.getAttribute("data-day");
            if (dateValue.equals(userDate)) {
                dateElement.click();
                break;
            }
        }
    }

    public void selectFromSuggestions(By locator, String userSuggestion) {
        List<WebElement> allSuggestions = MyDriver.getDriver().findElements(locator);
        for (WebElement suggestion : allSuggestions) {
            if(suggestion.getText().equalsIgnoreCase(userSuggestion)) {
                suggestion.click();
                break;
            }
        }
    }


    public void scrollToButtonDarkSky(By locator){
        for (int i = 0; i <= 15; i++) {
            try {
                findWebElement(locator);
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException e) {
                JavascriptExecutor jsE = (JavascriptExecutor) MyDriver.getDriver();
                jsE.executeScript("scrollBy(0,100)");
            }
        }
    }

    public void scrollAndClickToButtonDarkSky(By locator){
        for (int i = 0; i <= 15; i++) {
            try {
                findWebElement(locator).click();
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException e) {
                JavascriptExecutor jsE = (JavascriptExecutor) MyDriver.getDriver();
                jsE.executeScript("scrollBy(0,100)");
            }
        }
    }
    public String getTextFromElementDarkSky(By locator){
        return findWebElement(locator).getText();
    }

    public List<String> convertListToSet (Set<String> input){
        List<String> arrList = new ArrayList<>();
        for (String val : input){
            arrList.add(val);
        }
        return arrList;
    }

    public int NumOfWindowHandles (){
       return getAllWindowHandles().size();
    }

    public boolean isItSelected(By locator){
       return findWebElement(locator).isSelected();

    }

}
