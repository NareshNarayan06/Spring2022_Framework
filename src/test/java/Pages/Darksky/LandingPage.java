package Pages.Darksky;

import Helper.DateLib;
import Helper.Misc;
import Pages.Facebook.Commands;
import Web.MyDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class LandingPage extends Commands {

    // Locators of Landing Page elements
    By timeMachineLocator = By.xpath("//a[contains(text(),'Time Machine')]");
    By dateFromTimeMachineLocator = By.xpath("//td[@class='is-today']/button");
    By plusButtonLocator = By.xpath("(//span[@class='toggle']/span[@class='open'])[1]");
    By lowBarTempLocator = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
    By lowNumTempLocator = By.xpath("(//span[@class='temp'])[1]");
    By highBarTempLocator = By.xpath("(//span[@class='maxTemp'])[1]");
    By highNumTempLocator = By.xpath("(//span[@class='arrow']/following::span[@class='temp'])[1]");
    // Method to interact with Landing Page elements
    // method to scroll and find if Time Machine button is enabled



    // method to scroll to Time Machine button
    public WebElement scrollToTimeMachineButton() {
        return scrollToElement(timeMachineLocator);
    }


    // method to check if Time Machine button is enabled
    public boolean isTimeMachineButtonEnabled() {
        return scrollToTimeMachineButton().isEnabled();
    }

    public void verifyDateHighlighted(){
       Assert.assertEquals(currentDate(),findTextFromTimeMachine(),"Its not highlighted");
    }

    public void scrollAndClickTimeMachineButton(){
        scrollToButtonDarkSky(timeMachineLocator);
    }

    public String findTextFromTimeMachine(){
        String text = getTextFromElementDarkSky(dateFromTimeMachineLocator);
        return text;
    }

    public String currentDate(){
        String currentDate = DateLib.getCurrentDateAsString();
        return currentDate;
    }



    public void scrollAndClickPlusButton(){
        scrollAndClickToButtonDarkSky(plusButtonLocator);
    }

    public void verifyLowTempValAreEqual(){
        Assert.assertEquals(getTextFromElementDarkSky(lowBarTempLocator),getTextFromElementDarkSky(lowNumTempLocator),
                "temperature values are not equal");

    }

    public void verifyHighTempValAreEqual(){
        Assert.assertEquals(getTextFromElementDarkSky(highBarTempLocator),getTextFromElementDarkSky(highNumTempLocator),
                "temperature values are not equal");

    }









    @Test
    public void areValuesDisplayedCorrect() {

        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");

        for (int i = 0; i <= 10; i++) {
            try {
                MyDriver.getDriver().findElement(By.xpath("(//span[@class='toggle']/span[@class='open'])[1]")).click();
                break;
            } catch (ElementClickInterceptedException | NoSuchElementException e) {
                JavascriptExecutor jsE = (JavascriptExecutor) MyDriver.getDriver();
                jsE.executeScript("scrollBy(0,100)");
            }
        }

        Misc.pause(5);

        String lowBarTemp = MyDriver.getDriver().findElement(By.xpath("//a[@class='day revealed']//span[@class='minTemp']")).getText();
        String lowNumTemp = MyDriver.getDriver().findElement(By.xpath("(//span[@class='temp'])[1]")).getText();
        Assert.assertEquals(lowBarTemp, lowNumTemp, "The Low temperatures displayed are non identical");

        String highBarTemp = MyDriver.getDriver().findElement(By.xpath("(//span[@class='maxTemp'])[1]")).getText();
        String highNumTemp = MyDriver.getDriver().findElement(By.xpath("(//span[@class='arrow']/following::span[@class='temp'])[1]")).getText();
        Assert.assertEquals(highBarTemp, highNumTemp, "The High temperatures displayed are non identical");

        MyDriver.quitWindow();
    }



}
