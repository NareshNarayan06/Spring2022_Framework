package StepDefinition.Facebook;

import Pages.Facebook.LandingPage;
import Pages.Facebook.LoginErrorPage;
import Tests.Facebook.Login;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSD {
    LandingPage lpage = new LandingPage();
    LoginErrorPage lePage = new LoginErrorPage();


    // Glue code
    @Given("^I am on facebook landing page$")
    public void openFacebook() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
    }


    @When("^I click on login button$")
    public void clickLoginBtn() {
        lpage.clickLoginButton();
    }

//    @Given("^I enter (.+) in login username$")
//    public void enterLoginUsername(String username) {
//        lpage.enterLoginEmail(username);
//    }
//
//    @Given("^I enter (.+) in login password$")
//    public void enterLoginPwd(String pwd) {
//        lpage.enterLoginPassword(pwd);
//    }


    /*
        pattern starts with I
         enter ANYTHING in login <password or username>patternEnds
     */
    @Given("^I enter (.+) in login (password|username)$")
    public void enterLoginCredentials(String data, String field) {
        switch (field.toLowerCase()) {
            case "username":
                lpage.enterLoginEmail(data);
                break;
            case "password":
                lpage.enterLoginPassword(data);
                break;
            default:
                System.out.println("Incorrect field name -> " + field);
        }
    }

    @Then("^I [vV]erify error is displayed$")
    public void isLoginErrorDisplayed() {
        Assert.assertTrue(lePage.isLoginErrorDisplayed(), "Login error is not displayed");
    }





}
