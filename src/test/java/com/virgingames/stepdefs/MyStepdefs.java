package com.virgingames.stepdefs;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on log in link$")
    public void iClickOnLogInLink() throws InterruptedException {
        //Thread.sleep(3000);
    new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Virgin Games" , new LoginPage().getloginPgTxt());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
    new LoginPage().enterUserName(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassWord(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errormessage) {
        Assert.assertEquals(errormessage,new LoginPage().verifyErrorMessage());

    }
}
