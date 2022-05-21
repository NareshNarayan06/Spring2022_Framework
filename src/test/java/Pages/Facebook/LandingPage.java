package Pages.Facebook;


import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LandingPage extends Commands {

    // Variables (Locators)
    By loginEmailLocator = By.id("email");
    By loginPassLocator = By.id("pass");
    By loginButtonLocator = By.tagName("button");
    By createNewAccountBtnLocator = By.xpath("//a[@data-testid='open-registration-form-button']");
    By facebookPayLocator = By.linkText("Facebook Pay");
    By oculusLocator = By.linkText("Oculus");
    By instagramLocator = By.linkText("Instagram");
    By portalLocator = By.linkText("Portal");
    By bulletinLocator = By.linkText("Bulletin");
    By logInInstagramLocator = By.xpath("//div[text()='Log In']");

    // Methods (to interact with webElements present on this webpage)
    public void enterLoginEmail(String loginEmail) {
        // MyDriver.getDriver().findElement(loginEmailLocator).sendKeys(loginEmail);
        type(loginEmailLocator, loginEmail);
    }

    public void enterLoginPassword(String loginPwd) {
        // MyDriver.getDriver().findElement(loginPassLocator).sendKeys(loginPwd);
        type(loginPassLocator, loginPwd);
    }

    public void clickLoginButton() {
        // MyDriver.getDriver().findElement(loginButtonLocator).click();
        clickIt(loginButtonLocator);
    }

    public void clickCreateNewAccountBtn() {
        // MyDriver.getDriver().findElement(createNewAccountBtnLocator).click();
        clickIt(createNewAccountBtnLocator);
    }

    public boolean isLoginBtnEnabled() {
        return MyDriver.getDriver().findElement(loginButtonLocator).isEnabled();
    }

    public boolean isCreateNewAccountBtnEnabled() {
        return isElementEnabled(createNewAccountBtnLocator);
    }


    public void clickMultipleWindowsInFacebook(){
        clickIt(facebookPayLocator);
        clickIt(oculusLocator);
        clickIt(instagramLocator);
        clickIt(portalLocator);
        clickIt(bulletinLocator);
    }

    public void closeAllWindowsExceptInstagram(){
       Set<String> allWindowHandles= getAllWindowHandles();
       List<String> allWindowHandlesToList = convertListToSet(allWindowHandles);
       switchToWindowAndClose(allWindowHandlesToList.get(0));
       switchToWindowAndClose(allWindowHandlesToList.get(1));
       switchToWindowAndClose(allWindowHandlesToList.get(3));
       switchToWindowAndClose(allWindowHandlesToList.get(4));
       switchToWindow(allWindowHandlesToList.get(2));
    }

    public void verifyCurrentWindowHandles(){
        Assert.assertEquals(NumOfWindowHandles(),1,"More than one window handles");
    }

    public void verifyCurrentTitle(){
      Assert.assertEquals(getCurrentTitle(),"Instagram","Its not InstagramTitle");
    }

public void isLogInButtonDisabled(){
        isItSelected(logInInstagramLocator);
}
















}
