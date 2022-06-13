package StepDefinition.Facebook;

import Helper.Misc;
import Pages.Commands;
import Pages.Facebook.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePageSD {
     LandingPage lPage = new LandingPage();

    @Given("^User launch facebook homepage$")
    public void launchFacebookSD(){
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com");
    }

    @When("^User click on Facebook Pay, Oculus, Instagram, Portal and Bulletin$")
    public void clickingMultiWindowsSD(){
        lPage.clickMultipleWindowsInFacebook();
    }

    @When("^User Close ALL windows except Instagram$")
    public void closeAllWindowExceptInstagramSD(){
        lPage.closeAllWindowsExceptInstagram();
    }

    @Then("^User verify number of window-Handles equals 1$")
    public void verifyNumberOfWindowHandlesSD(){
        lPage.verifyCurrentWindowHandles();
    }

    @Then("^User Verify page title is Instagram$")
    public void verifyCurrentTitleSD(){
        lPage.verifyCurrentTitle();
    }

@Then("^Verify Log in button on Instagram is disabled by default$")
    public void IsLogInButtonDisabled(){
        Assert.assertFalse(lPage.isLoginBtnEnabled(),"LogIn Button Is Disabled");
}
























}
